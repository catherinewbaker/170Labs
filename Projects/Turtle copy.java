/**
 * Simple Turtle library
 * 
 * @author Davide Fossati <davide@fossati.us>
 * @version 1.07 - 2019.09.18
 */

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;
import java.io.*;
import javax.imageio.*;

public class Turtle {
	
	static final int DEFAULT_DELAY = 100; // default delay of a turtle
	
	static final Color DEFAULT_COLOR = Color.BLACK; // default color of a turtle
	
	static final int[][] DEFAULT_SHAPE = {{10, -10, -10}, {0, -7, 7}}; // default shape of a turtle; format: {{x1, ... , xn}, {y1, ..., yn}}
	
	/**
	 * Default constructor. Creates a turtle in the default world.
	 */
	public Turtle() {
		this(TurtleWorld.getDefaultWorld());
	}
	
	/**
	 * Constructor. Creates a turtle in a specified world.
	 * @param world World in which the turtle will be created.
	 *              If null, the turtle is created in the default world.
	 */
	public Turtle(TurtleWorld world) {
		if (world == null) {
			world = TurtleWorld.getDefaultWorld();
		}
		this.world = world;
		world.addTurtle(this);
		x = world.getWidth() / 2;
		y = world.getHeight() / 2;
		dir = 0;
		color = DEFAULT_COLOR;
		if (world.isVisible()) {
			delay = DEFAULT_DELAY;
		} else {
			delay = 0;
		}
		visible = true;
		penDown = true;
		shape = DEFAULT_SHAPE;
	}

	/**
	 * Moves the turtle forward.
	 * @param steps the distance traveled by the turtle (1 step = 1 pixel)
	 */
	public void forward(double steps) {
		double x0 = x;
		double y0 = y;
		x += steps * Math.cos(dir);
		y -= steps * Math.sin(dir);
		if (penDown) {
			world.drawLine((int)Math.round(x0), (int)Math.round(y0),
							(int)Math.round(x), (int)Math.round(y), color);
		}
		world.repaint();
		if (delay > 0) {
			try {
				Thread.sleep(delay);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * Moves the turtle backward.
	 * @param steps the distance traveled by the turtle (1 step = 1 pixel)
	 */
	public void backward(double steps) {
		forward(-steps);
	}

	/**
	 * Rotates the turtle counter-clockwise.
	 * @param degrees the rotation angle (in degrees)
	 */
	public void left(double degrees) {
		dir += degrees * Math.PI / 180;
		double pi2 = 2 * Math.PI;
		while (dir >= pi2) {
			dir -= pi2;
		}
		while (dir < 0) {
			dir += pi2;
		}
		world.repaint();
		if (delay > 0) {
			try {
				Thread.sleep(delay);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * Rotates the turtle clockwise.
	 * @param degrees the rotation angle (in degrees)
	 */
	public void right(double degrees) {
		left(-degrees);
	}
	
	/**
	 * Raises the turtle's pen. When the pen is up, the turtle does not draw lines on the screen.
	 */
	public void penup() {
		penDown = false;
	}
	
	/**
	 * Lowers the turtle's pen. When the pen is down, the turtle draws lines on the screen.
	 */
	public void pendown() {
		penDown = true;
	}
	
	/**
	 * Sets the turtle's delay between moves. The lower the delay, the faster the turtle. Default: 100 ms
	 * @param delay the amount of delay (in milliseconds)
	 */
	public void delay(int delay) {
		this.delay = delay;
	}
	
	/**
	 * Hides the turtle so it is not visible on the screen.
	 */
	public void hideturtle() {
		visible = false;
		world.repaint();
	}
	
	/**
	 * Shows the turtle so it is visible on the screen.
	 */
	public void showturtle() {
		visible = true;
		world.repaint();
	}
	
	/**
	 * Sets the color of the turtle.
	 * @param color a string representation of the color. Examples: "red", "green", "blue", "yellow", etc.
	 */
	public void color(String color) {
		try {
			this.color = (Color)Class.forName("java.awt.Color").getField(color).get(null);
		} catch (Exception e) {
			e.printStackTrace();
		}
		world.repaint();
	}

	/**
	 * Sets the color of the turtle.
	 * @param red the red component of the color (0 <= red <= 255)
	 * @param green the blue component of the color (0 <= green <= 255)
	 * @param blue the blue component of the color (0 <= blue <= 255)
	 */
	public void color(int red, int green, int blue) {
		color = new Color(red, green, blue);
		world.repaint();
	}

	/**
	 * Flood-fills the area under the turtle with the turtle's current color.
	 */
	public void fill() {
		world.fill(x, y, color);
		world.repaint();
	}
	
	/**
	 * Sets the shape of the turtle as a polygon with given vertices.
	 * The array of coordinates has the following format:
	 * {{x1, x2, ... , xn}, {y1, y2, ..., yn}}
	 * The center of the shape is (0, 0).
	 * If the given array does not have at least 3 pairs of coordinates,
	 * then the shape of the turtle is not changed.
	 * @param coordinates a 2D array in the format {{x1, x2, ... , xn}, {y1, y2, ..., yn}}
	 */
	public void setShape(int[][] coordinates) {
		// The input array must must contain at least 3 vertices
		if (coordinates.length == 2 && coordinates[0].length >= 3) {
			shape = coordinates;
			world.repaint();
		}
	}

	/**
	 * Returns true if the turtle is visible, false otherwise.
	 * @return true if the turtle is visible, false otherwise.
	 */
	public boolean isVisible() {
		return visible;
	}
	
	/**
	 * Returns the world of this turtle.
	 * @return the world of this turtle.
	 */
	public TurtleWorld getWorld() {
		return world;
	}

	/**
	 * Returns the current color of the turtle, in Java AWT format.
	 * @return the current color of the turtle.
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * Calculates an array containing the coordinates of the vertices
	 * of the shape of the turtle, rotated in the current direction.
	 * The result array has the following format:
	 * {{x1, x2, ..., xn}, {y1, y2, ..., yn}}
	 * @return a 2D array of integers representing the coordinates of the vertices of the turtle
	 */
	public int[][] turtleCoordinates() {
		int[] xValues = new int[shape[0].length];
		int[] yValues = new int[shape[0].length];
		double sind = Math.sin(dir);
		double cosd = Math.cos(dir);

		for (int i = 0; i < shape[0].length; i++) {
			xValues[i] = (int)Math.round(x + shape[0][i] * cosd - shape[1][i] * sind);
			yValues[i] = (int)Math.round(y - shape[0][i] * sind - shape[1][i] * cosd);
		}

		return new int[][] {xValues, yValues};
	}

	/**
	 * Returns a String with a representation of position and direction of the turtle.
	 * Format: (x y dir)
	 * @return a String with a representation of position and direction
	 *         of all the turtles in the current world.
	 */
	public String turtlePosition() {
		return String.format("(%.1f %.1f %.5f)", x, y, dir);
	}

	private TurtleWorld world; // world of the turtle

	private double x; // x position of the turtle

	private double y; // y position of the turtle

	private double dir; // direction of the turtle in radians
	
	private Color color; // color of the turtle

	private long delay; // delay of the turtle
	
	private boolean visible; // true if the turtle is visible
	
	private boolean penDown; // true if the pen is down
	
	private int[][] shape; // shape of the turtle at 0 degrees; format: {{x1, ... , xn}, {y1, ..., yn}}

}

class TurtleWorld {

	static final int DEFAULT_WIDTH = 900; // default width of the drawing area

	static final int DEFAULT_HEIGHT = 900; // default height of the drawing area
	
	static final Color DEFAULT_BACKGROUND = Color.WHITE; // default background color
	
	/**
	 * Default constructor. Creates a visible TurtleWorld with default width and height.
	 */
	public TurtleWorld() {
		this(DEFAULT_WIDTH, DEFAULT_HEIGHT, true);
	}
	
	/**
	 * Constructor. Creates a visible TurtleWorld with specified width and height.
	 * @param width Horizontal dimension of the world
	 * @param height Vertical dimension of the world
	 */
	public TurtleWorld(int width, int height) {
		this(width, height, true);
	}

	/**
	 * Constructor. Creates a TurtleWorld with default width and height and specified visibility.
	 * @param visible If true the world is visible and a new window will be opened;
	 *                if false the world is invisible.
	 */
	public TurtleWorld(boolean visible) {
		this(DEFAULT_WIDTH, DEFAULT_HEIGHT, visible);
	}

	/**
	 * Constructor. Creates a TurtleWorld with specified width, height, and visibility.
	 * @param width Horizontal dimension of the world
	 * @param height Vertical dimension of the world
	 * @param visible If true the world is visible and a new window will be opened;
	 *                if false the world is invisible.
	 */
	public TurtleWorld(int width, int height, boolean visible) {
		numWorlds++;

		turtles = new ArrayList<Turtle>();
		
		worldPanel = new TurtlePanel();
		worldPanel.setPreferredSize(new Dimension(width, height));
		worldPanel.setBackground(DEFAULT_BACKGROUND);
		
		drawing = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);

		lines = new LinkedHashSet<TurtleLine>();

		this.visible = visible;
		if (visible == true) {
			JScrollPane sp = new JScrollPane(worldPanel);
			String title = numWorlds > 1 ? "Turtle World " + numWorlds : "Turtle World";
			JFrame f = new JFrame(title);
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			f.add(sp);

			JMenuBar menuBar = new JMenuBar();
			JMenu menuFile = new JMenu("File");
			menuBar.add(menuFile);
			JMenuItem menuItemSave = new JMenuItem("Save Drawing...");
			menuFile.add(menuItemSave);
			f.setJMenuBar(menuBar);
			
			menuItemSave.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					save();
				}
			});

			f.pack();
			f.setVisible(true);
		}
	}
	
	/**
	 * Returns the default world of turtles.
	 * @return a default TurtleWorld
	 */
	public static TurtleWorld getDefaultWorld() {
		if (defaultWorld == null) {
			defaultWorld = new TurtleWorld();
		}
		return defaultWorld;
	}
	
	/**
	 * Adds a turtle to the current world.
	 * @param t The turtle to be added
	 */
	public void addTurtle(Turtle t) {
		if (!turtles.contains(t)) {
			turtles.add(t);
		}
	}

	/**
	 * Returns the width of this world.
	 * @return the width of this world.
	 */
	public int getWidth() {
		return drawing.getWidth();
	}
	
	/**
	 * Returns the height of this world.
	 * @return the height of this world.
	 */
	public int getHeight() {
		return drawing.getHeight();
	}
	
	/**
	 * Returns true if this world is visible, false otherwise.
	 * @return true if this world is visible, false otherwise.
	 */
	public boolean isVisible() {
		return visible;
	}

	/**
	 * Sets the background color of this world.
	 * @param color a string representation of the color. Examples: "red", "green", "blue", "yellow", etc.
	 */
	public void setBackground(String color) {
		try {
			Color bg = (Color)Class.forName("java.awt.Color").getField(color).get(null);
			worldPanel.setBackground(bg);
		} catch (Exception e) {
			e.printStackTrace();
		}
		repaint();
	}

	/**
	 * Sets the background color of this world.
	 * @param red the red component of the color (0 <= red <= 255)
	 * @param green the blue component of the color (0 <= green <= 255)
	 * @param blue the blue component of the color (0 <= blue <= 255)
	 */
	public void setBackground(int red, int green, int blue) {
		worldPanel.setBackground(new Color(red, green, blue));
		repaint();
	}

	public void drawLine(int x1, int y1, int x2, int y2, Color c) {
		Graphics2D g = drawing.createGraphics();
		g.setColor(c);
		g.drawLine(x1, y1, x2, y2);
		g.dispose();
		TurtleLine line = new TurtleLine(x1, y1, x2, y2, c);
		lines.remove(line);
		lines.add(line);
	}

	public void fill(double x0, double y0, Color foreground) {
		int ix0 = (int)Math.round(x0);
		int iy0 = (int)Math.round(y0);
		int fgc = foreground.getRGB();
		int bgc = drawing.getRGB(ix0, iy0);
		
		if (fgc == bgc) {
			return;
		}
		
		Queue<Point> q = new ArrayDeque<Point>();
		q.add(new Point(ix0, iy0));
		
		while (!q.isEmpty()) {
			Point p = q.remove();
			if (p.x >=0 && p.x < drawing.getWidth()
					&& p.y >=0 && p.y < drawing.getHeight()
					&& drawing.getRGB(p.x, p.y) == bgc) {
				drawing.setRGB(p.x, p.y, fgc);
				q.add(new Point(p.x-1, p.y));
				q.add(new Point(p.x+1, p.y));
				q.add(new Point(p.x, p.y-1));
				q.add(new Point(p.x, p.y+1));
			}
		}
	}

	public void repaint() {
		worldPanel.repaint();
	}

	/**
	 * Returns a fingerprint of the current drawing.
	 * The fingerprint does not include the image of the turtles.
	 * Optionally, the current position and direction of the turtles can be included.
	 * @param includeTurtlePositions a boolean indicating whether the position and direction
	 *                               of the turtles should be included in the result.
	 * @return a String representing the fingerprint the current drawing.
	 */
	public String getDrawingFingerprint(boolean includeTurtlePositions) {
		String result = null;
		int width = drawing.getWidth();
		int height = drawing.getHeight();
		byte[] snapshotBytes = new byte[width * height * 4];
		int i = 0;
		for (int x = 0; x < width; x++) {
			for (int y = 0; y < height; y++) {
				int pixel = drawing.getRGB(x, y);
				snapshotBytes[i++] = (byte)(pixel >> 24);
				snapshotBytes[i++] = (byte)(pixel >> 16);
				snapshotBytes[i++] = (byte)(pixel >> 8);
				snapshotBytes[i++] = (byte)(pixel);
			}
		}
		try {
			java.security.MessageDigest md = java.security.MessageDigest.getInstance("SHA1");
			md.update(snapshotBytes);
			result = Base64.getEncoder().encodeToString(md.digest());
			
			if (includeTurtlePositions) {
				result += turtlePositions();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	/**
	 * Saves the current drawing in PNG format.
	 * @param fileName Name of the PNG file to be saved
	 * @param cropped If true, the saved image is cropped to fit the exact size of the drawing.
	 * @param includeTurtles If true, the saved image includes the visible turtles.
	 * @return true if writing was successful, false otherwise
	 */
	public boolean saveDrawingPNG(String fileName, boolean cropped, boolean includeTurtles) {
		// create a working copy of the drawing
		BufferedImage img = new BufferedImage(drawing.getWidth(), drawing.getHeight(), BufferedImage.TYPE_INT_RGB);
		Graphics2D g = img.createGraphics();
		g.drawImage(drawing, 0, 0, worldPanel.getBackground(), null);
		if (includeTurtles) {
			paintTurtles(g);
		}
		g.dispose();
		if (cropped) {
			int[] bounds = drawingBounds(includeTurtles);
			int minX = bounds[0];
			int minY = bounds[1];
			int maxX = bounds[2];
			int maxY = bounds[3];
			if (minX < 0) minX = 0;
			if (minY < 0) minY = 0;
			if (maxX < 0) maxX = 0;
			if (maxY < 0) maxY = 0;
			if (minX > img.getWidth()) minX = img.getWidth();
			if (minY > img.getHeight()) minY = img.getHeight();
			if (maxX > img.getWidth()) maxX = img.getWidth();
			if (maxY > img.getHeight()) maxY = img.getHeight();
			int width = Math.min(maxX - minX + 1, img.getWidth() - minX);
			int height = Math.min(maxY - minY + 1, img.getHeight() - minY);
			img = img.getSubimage(minX, minY, width, height);
		}
		
		// save the image
		File output = new File(fileName);
		try {
			ImageIO.write(img, "PNG", output);
			return true;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}

	/**
	 * Saves the current drawing in SVG format.
	 * The saved picture does not include filled areas.
	 * @param fileName Name of the SVG file to be saved
	 * @param cropped If true, the saved image is cropped to fit the exact size of the drawing.
	 * @param includeTurtles If true, the saved image includes the visible turtles.
	 * @return true if writing was successful, false otherwise
	 */
	public boolean saveDrawingSVG(String fileName, boolean cropped, boolean includeTurtles) {
		try {
			FileWriter output = new FileWriter(fileName);
			output.write(toSVG(cropped,includeTurtles));
			output.close();
			return true;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}

	/**
	 * Returns a String representation of the current drawing in SVG format.
	 * It does not include filled areas.
	 * @param cropped If true, the image is cropped to fit the exact size of the drawing.
	 * @param includeTurtles If true, the image includes the visible turtles.
	 * @return a String representation of the current drawing in SVG format
	 */
	public String toSVG(boolean cropped, boolean includeTurtles) {
		StringBuilder s = new StringBuilder();
		int width = drawing.getWidth();
		int height = drawing.getHeight();
		int dx = 0;
		int dy = 0;
		if (cropped) {
			int[] bounds = drawingBounds(includeTurtles);
			int minX = bounds[0];
			int minY = bounds[1];
			int maxX = bounds[2];
			int maxY = bounds[3];
			width = maxX - minX + 1;
			height = maxY - minY + 1;
			dx = -minX;
			dy = -minY;
		}
		s.append("<svg width=\"" + width + "\" height=\"" + height + "\">\n");
		s.append(String.format("<rect width=\"100%%\" height=\"100%%\" fill=\"rgb(%d,%d,%d)\"/>\n",
				worldPanel.getBackground().getRed(),
				worldPanel.getBackground().getGreen(),
				worldPanel.getBackground().getBlue()));
		for (TurtleLine line : lines) {
			s.append(String.format("<line x1=\"%d\" y1=\"%d\" x2=\"%d\" y2=\"%d\" stroke=\"rgb(%d,%d,%d)\"/>\n",
									line.x1 + dx, line.y1 + dy, line.x2 + dx, line.y2 + dy,
									line.red, line.green, line.blue));
		}
		if (includeTurtles) {
			for (Turtle t : turtles) {
				if (t.isVisible()) {
					int[][] c = t.turtleCoordinates();
					s.append("<polygon points=\"");
					for (int i = 0; i < c[0].length - 1; i++) {
						s.append(String.format("%d,%d ", c[0][i] + dx, c[1][i] + dy));
					}
					s.append(String.format("%d,%d", c[0][c[0].length - 1] + dx, c[1][c[0].length - 1] + dy));
					s.append(String.format("\" stroke=\"rgb(%d,%d,%d)\" fill=\"transparent\"/>\n",
								t.getColor().getRed(), t.getColor().getGreen(), t.getColor().getBlue()));
				}
			}
		}
		s.append("</svg>");
		return s.toString();
	}

	/**
	 * Calculates the boundaries of the current drawing.
	 * @param includeTurtles If true, the visible turtles are included in the boundary calculation.
	 * @return an array of integers containing the drawing boundaries: {minX, minY, maxX, maxY}
	 */
	public int[] drawingBounds(boolean includeTurtles) {
		int minX = Integer.MAX_VALUE;
		int minY = Integer.MAX_VALUE;
		int maxX = Integer.MIN_VALUE;
		int maxY = Integer.MIN_VALUE;

		for (TurtleLine line : lines) {
			if (line.x1 < minX) minX = line.x1;
			if (line.x2 < minX) minX = line.x2;
			if (line.y1 < minY) minY = line.y1;
			if (line.y2 < minY) minY = line.y2;
			if (line.x1 > maxX) maxX = line.x1;
			if (line.x2 > maxX) maxX = line.x2;
			if (line.y1 > maxY) maxY = line.y1;
			if (line.y2 > maxY) maxY = line.y2;
		}
		
		if (includeTurtles) {
			for (Turtle t : turtles) {
				if (t.isVisible()) {
					int[][] c = t.turtleCoordinates();
					for (int i = 0; i < c[0].length; i++) {
						if (c[0][i] < minX) minX = c[0][i];
						if (c[1][i] < minY) minY = c[1][i];
						if (c[0][i] > maxX) maxX = c[0][i];
						if (c[1][i] > maxY) maxY = c[1][i];
					}
				}
			}
		}
		
		return new int[] {minX, minY, maxX, maxY};
	}

	/**
	 * Returns a String with a sorted representation of all the lines in the current drawing.
	 * If the translate parameter is true, then the coordinates are translated
	 * to fit a bounding box without empty border.
	 * Each line is in the following format: x1 y1 x2 y2 red green blue
	 * @param tanslate If true, the coordinates are translated to fit a bounding box
	 * @return a String with a sorted representation of all the lines in the current drawing.
	 */
	public String sortedDrawingLines(boolean translate) {
		int dx = 0;
		int dy = 0;
		
		if (translate) {
			int[] bounds = drawingBounds(false);
			dx = -bounds[0];
			dy = -bounds[1];
		}

		ArrayList<String> sLines = new ArrayList<String>(lines.size());

		for (TurtleLine line : lines) {
			sLines.add(String.format("%d %d %d %d %d %d\n",
					line.x1 + dx, line.y1 + dy,
					line.x2 + dx, line.y2 + dy,
					line.red, line.green, line.blue));
		}
		sLines.sort(null);
		StringBuilder s = new StringBuilder();
		for (String sLine : sLines) {
			s.append(sLine);
		}
		return s.toString();
	}

	/**
	 * Returns a String with a representation of position and direction
	 * of all the turtles in the current world.
	 * Format for each turtle: (x y dir)
	 * @return a String with a representation of position and direction
	 *         of all the turtles in the current world.
	 */
	public String turtlePositions() {
		StringBuilder s = new StringBuilder();
		for (Turtle t : turtles) {
			s.append(t.turtlePosition());
		}
		return s.toString();
	}

	private void paintTurtles(Graphics g) {
		for (int i = 0; i < turtles.size(); i++) {
			Turtle t = turtles.get(i);
			if (t.isVisible()) {
				g.setColor(t.getColor());
				int[][] c = t.turtleCoordinates();
				g.drawPolygon(c[0], c[1], c[0].length);
			}
		}
	}

	/**
	 * Opens a dialog to ask the user for a file name, and saves the drawing to that file.
	 */
	public void save() {
		JRadioButton rbPNG = new JRadioButton("PNG");
		JRadioButton rbSVG = new JRadioButton("SVG");
		rbPNG.setActionCommand("png");
		rbSVG.setActionCommand("svg");
		rbPNG.setSelected(true);
		ButtonGroup formatGroup = new ButtonGroup();
		formatGroup.add(rbPNG);
		formatGroup.add(rbSVG);
		
		JPanel pFormat = new JPanel();
		pFormat.setBorder(BorderFactory.createTitledBorder("File Format"));
		pFormat.add(rbPNG);
		pFormat.add(rbSVG);

		JCheckBox ckCropped = new JCheckBox("Crop Image");
		JCheckBox ckTurtles = new JCheckBox("Include Turtles");
		ckCropped.setSelected(false);
		ckTurtles.setSelected(true);
		
		JPanel pOptions = new JPanel();
		pOptions.setLayout(new BoxLayout(pOptions, BoxLayout.PAGE_AXIS));
		pOptions.setBorder(BorderFactory.createTitledBorder("Options"));
		pOptions.add(ckCropped);
		pOptions.add(ckTurtles);
		
		JPanel pAccessory = new JPanel(new GridLayout(0, 1));
		pAccessory.add(pFormat);
		pAccessory.add(pOptions);
		
		JFileChooser fc = new JFileChooser();
		fc.setAccessory(pAccessory);

		int result = fc.showSaveDialog(worldPanel);
		if (result == JFileChooser.APPROVE_OPTION) {
			String filename = fc.getSelectedFile().getAbsolutePath();
			boolean cropped = ckCropped.isSelected();
			boolean includeTurtles = ckTurtles.isSelected();
			boolean saved;
			String format = formatGroup.getSelection().getActionCommand();
			if (!filename.endsWith("." + format)) {
					filename += "." + format;
			}
			
			if (new File(filename).exists()) {
				int replace = JOptionPane.showConfirmDialog(worldPanel, "The following file already exists:\n\n" + filename + "\n\nWould you like to overwrite it?",
						"File Exists", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
				if (replace != JOptionPane.YES_OPTION) {
					JOptionPane.showMessageDialog(worldPanel, "The image was not saved",
							"Image Not Saved", JOptionPane.ERROR_MESSAGE);
					return;
				}
				
			}
			
			if (format.equals("png")) {
				saved = saveDrawingPNG(filename, cropped, includeTurtles);
			} else {
				saved = saveDrawingSVG(filename, cropped, includeTurtles);
			}
			
			if (saved) {
				JOptionPane.showMessageDialog(worldPanel, format.toUpperCase() + " image saved:\n\n" + filename,
						"Image Saved", JOptionPane.INFORMATION_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(worldPanel, "Error: Could not save the image\n\n" + filename,
						"Image Not Saved", JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	
	private static TurtleWorld defaultWorld;
	
	private static int numWorlds;

	private ArrayList<Turtle> turtles;

	private TurtlePanel worldPanel;

	private BufferedImage drawing;

	private LinkedHashSet<TurtleLine> lines;

	private boolean visible;

	class TurtlePanel extends JPanel { // inner class of TurtleWorld
		private static final long serialVersionUID = 1L;

		@Override
		protected void paintComponent(Graphics g) {
	        super.paintComponent(g);
			g.drawImage(drawing, 0, 0, null, null);
			g.drawRect(-1, -1, drawing.getWidth() + 1, drawing.getHeight() + 1);
			paintTurtles(g);
	    }
	}

}

class TurtleLine {

	int x1; // x coordinate of the first point
	int y1; // y coordinate of the first point
	int x2; // x coordinate of the second point
	int y2; // y coordinate of the second point
	int red;   // red color component
	int green; // green color component
	int blue;  // blue color component

	public TurtleLine(int x1, int y1, int x2, int y2, Color color) {
		// Sort the coordinates
		if (x1 < x2) {
			this.x1 = x1;
			this.y1 = y1;
			this.x2 = x2;
			this.y2 = y2;
		} else if (x1 > x2) {
			this.x1 = x2;
			this.y1 = y2;
			this.x2 = x1;
			this.y2 = y1;
		} else if (y1 <= y2) {
			this.x1 = x1;
			this.y1 = y1;
			this.x2 = x2;
			this.y2 = y2;
		} else {
			this.x1 = x2;
			this.y1 = y2;
			this.x2 = x1;
			this.y2 = y1;			
		}
		
		// Extract the RGB color components
		red = color.getRed();
		green = color.getGreen();
		blue = color.getBlue();
	}

	@Override
	public int hashCode() {
		return Objects.hash(x1, y1, x2, y2, red, green, blue);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof TurtleLine)) {
			return false;
		}
		TurtleLine other = (TurtleLine) obj;
		return x1 == other.x1 && y1 == other.y1 && x2 == other.x2 && y2 == other.y2
				&& red == other.red && green == other.green && blue == other.blue;
	}

	@Override
	public String toString() {
		return x1 + " " + y1 + " " + x2 + " " + y2 + " " + red + " " + green + " " + blue;
	}

}
