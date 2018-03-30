#Problem 5

## Explanation

Two classes:
Driver - class for the class ProductRecords. Using it user can add, modify or find the
product records in the database. On every start the program restores the values from
the saved file and on every exit it stores them back to the file.
Product Records - Class serves as Database for product records. It stores names, quantities and prices.
On every creation it tries to restore the values from STORAGE_FILENAME. And on request,
can store them back into that file.

## How to run manually

In order to run the program, you need to do:
    
    ant dist
    cd dist
    java -jar ProductRecords.jar 

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



