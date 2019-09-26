#!/bin/bash
set -x
##compiling the Sum.g4 in java files
java -jar "antlr-4.7.2-complete.jar" -no-listener -visitor GrammarLab03.g4
##exporting the class path
export CLASSPATH=".:antlr-4.7.2-complete.jar:$CLASSPATH"
#compiling the .java generated from Sum.g4 with MyParser.java and AddVisitor.java
javac *.java

java Main < test1.sm > result1.txt
java Main < test2.sm > result2.txt
java Main < test3.sm > result3.txt
java Main < test4.sm > result4.txt
java Main < test5.sm > result5.txt
java Main < test6.sm > result6.txt
java Main < test7.sm > result7.txt
java Main < test8.sm > result8.txt

java org.antlr.v4.gui.TestRig GrammarLab03 root -gui < test7.sm
