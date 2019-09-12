#!/bin/bash
set -x
##compiling the Sum.g4 in java files
#java -jar "antlr-4.7.2-complete.jar" -no-listener -visitor GrammarLab03.g4
##exporting the class path
#export CLASSPATH=".:antlr-4.7.2-complete.jar:$CLASSPATH"
#compiling the .java generated from Sum.g4 with MyParser.java and AddVisitor.java
javac *.java
#feeding a string and reading the tokens
echo "var a = 0;" | java org.antlr.v4.gui.TestRig GrammarLab03 root -tokens
#feeding a string and reading tree in list style
echo "func a(x) 2 + x * 5;" | java org.antlr.v4.gui.TestRig GrammarLab03 root -tree
#feeding a string and printing a graphical tree
echo "var a = 0;" | java org.antlr.v4.gui.TestRig GrammarLab03 root -gui
#execute the implemented visitor
echo "var a = 0;" | java GrammarLab03Parser
