# Problem 2

## Introduction

A program for recursively copying files from a directory to another directory, keeping the directory structure. The user may specify a file type to copy only files with a certain extension (e.g., .txt or .java). The program is invoked with 2 or 3 parameters: the source directory, the target directory, and optionally the file extension. If no extension is given as the 3rd argument, all files will be copied recursively.

Example:
```
java CopyAll src bak txt
```

If some file cannot be copied, the program should print a message about it and proceed with the next file.


## Deployment

**Apache Ant**

An ant build.xml file is provided for building and running. 

**Compilation & Run**

In root directory, just execute:

```
ant dist
cd dist
java -jar Main.jar source destination extension

```
**javadoc**

```
ant javadoc
```

**Clean**

```
ant clean

```
