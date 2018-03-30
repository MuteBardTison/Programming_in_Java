# Problem4

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
$ ant run
$ ant copyresult
$ ant clean
```

Or

```
$ ant init compile
$ ant javadocs
$ ant copydata
$ ant dist
$ cd bin/dist
$ java -jar Copy.jar file1.txt file2.txt
$ cd ../..
$ ant copyresult
$ ant clean
```



## Contributors

**Sabin Bhandari 30000374**

**Shikhat Karkee 30000394**

**Temirlan Ulugbek uulu 30000294**

**Zihan Qi 30000612**










