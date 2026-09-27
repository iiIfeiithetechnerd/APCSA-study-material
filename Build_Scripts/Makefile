SHELL := cmd.exe

JAVA_SRC := $(wildcard src/*.java)
OUT := build

windows:
	javac -d $(OUT) $(JAVA_SRC)
	java -cp $(OUT) Main   