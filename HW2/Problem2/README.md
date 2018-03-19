#Problem 2

## Explanation

Singleton class.

One can create only one or limited number of instances of a singleton class. The name speaks for itself and only SINGLE instance (or more, depending on the case) of the class is created and stored statically.
This is achieved by making all the constructors of the class private, so that no one from the outside can't create a new instance and uses only the existing ones.

Example: Federal States
In our case, having only 16 states make sense inside the germany, so we are using a singleton pattern here. We make static fields for each land in germany and create a static getState which can get you one of those lands. Meanwhile, the constructor is private, so no one can create a new instance of the class.

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



