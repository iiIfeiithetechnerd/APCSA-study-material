SHELL := cmd.exe

JAVA_SRC := $(wildcard ../module_sources/unit_1a/*.java ../module_sources/unit_1b/*.java ../UI_packages/*.java)
OUT := ..\build

windows:
	if exist $(OUT) (rmdir /s /q $(OUT))
	mkdir $(OUT)
	javac -d $(OUT) $(JAVA_SRC)
	java -cp $(OUT) Window