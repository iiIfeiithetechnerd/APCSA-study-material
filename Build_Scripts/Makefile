SHELL := cmd.exe

JAVA_SRC := $(wildcard src/*.java)
OUT := build

windows:
	rm -rf $(OUT)
	mkdir $(OUT)
	javac -d $(OUT) $(JAVA_SRC)
	java -cp $(OUT) Main   