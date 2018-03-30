#Problem 3

## Explanation

WordCount - the class has only a main method, which is a simple program that takes
a file name as command line input and prints out the number of characters,
number of unique characters, number of words, number of unique words and number of lines
into the system output.

## How to run manually

1) Compile

-> javac WordCount.java

2) Create a *.txt file in the same directory as the compiled file

3) Run it with filename as parameter

-> java WordCount "file_name.txt"

## Deployment

**Apache Ant**

An ant build.xml file is provided for building and running. 

**Compilation & Run**

In root directory, just execute

```
$ ant
```

to compile and run JAR files, with javadoc generated.



Or you can also use target names to execute separately:

```
$ ant init compile
$ ant javadocs
$ ant copy
$ ant runUseBook
$ ant runBookArray
$ ant clean
```

## Contributors

**Sabin Bhandari 30000374**

**Shikhat Karkee 30000394**

**Temirlan Ulugbek uulu 30000294**

**Zihan Qi 30000612**



