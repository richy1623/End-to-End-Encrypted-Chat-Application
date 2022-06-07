all: 
	cd src; javac -d ../classfiles *.java

server:
	clear
	java -classpath classfiles Server

client:
	clear
	java -classpath classfiles Client

GUI:
	clear
	java -classpath classfiles GUI

clean:
	find . -name \*.class -type f -delete