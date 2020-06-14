compile:
	javac -sourcepath src -d build/classes src/Welcome.java

clean:
	rm -f build/classes/*.class
	rm -f build/jar/Welcome.jar

jar:
	jar cfm build/jar/Welcome.jar Manifest -C build/classes .

run:
	java -cp build/classes Welcome
