all:
	javac -sourcepath src -d bin src/*
	java -cp bin bozo

compile:
	javac -sourcepath src -d bin src/*

run:
	java -cp bin bozo
