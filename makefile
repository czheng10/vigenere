help:
	@echo encoding: make run ARGS="encode plaintext keytext"
	@echo decoding: make run ARGS="decode plaintext keytext"

run: vigenere.class
	java vigenere $(ARGS)

vigenere.class: 
	javac vigenere.java

clean:
	rm *.class
