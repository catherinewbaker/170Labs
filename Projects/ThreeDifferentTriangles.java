public class ThreeDifferentTriangles {

    public static void main(String[] args) {
        Turtle tarantino = new Turtle();

        tarantino.color("yellow");

        for (int i = 0; i < 3; i++) {
            tarantino.forward(100);
            tarantino.left(120);
        }
        tarantino.penup();
        tarantino.forward(150);
        tarantino.color("green");
        tarantino.pendown();

        tarantino.forward(100);
        tarantino.left(143.13);
        tarantino.forward(80);
        tarantino.left(90);
        tarantino.forward(60);
        tarantino.left(126.87);

        tarantino.penup();
        tarantino.forward(150);
        tarantino.color("blue");
        tarantino.pendown();

        tarantino.forward(100);
        tarantino.left(110);
        tarantino.forward(196.962);
        tarantino.left(150);
        tarantino.forward(187.939);
        tarantino.left(100);


    }

}
