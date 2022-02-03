#!/bin/bash
javac src/edu/zzabost/spoj/depend/Depend.java 
javac src/edu/zzabost/spoj/addrev/AddRev.java
javac -cp ./junit-4.13.2.jar:hamcrest-core-1.3.jar:./src/ src/edu/zzabost/spoj/addrev/AddRevTest.java
