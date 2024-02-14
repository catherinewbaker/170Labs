@echo off

cd %~dp0
java -cp ".;lib/*" -Djava.security.policy=lib/client.policy client.QTestLauncher server=qtest2.mathcs.emory.edu %* >nul 2>&1

