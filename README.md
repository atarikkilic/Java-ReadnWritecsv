# Java-ReadnWritecsv

This project read a input csv file using the CsvReader class. Parsed the data from the csv file to extract customers who played the songs on a particular date(02-02-2022).
Counted the number of occurrences of each customer. Depending on the count of occurences, wrote the updated variables to a output csv file.

## Getting Started

**Step 1:** Make sure git is installed on your os. I will be using Windows for the project.

**Step 2:** Clone the project into your local machine using below command or download zip in github page.

```git clone https://github.com/atarikkilic/Java-ReadnWritecsv```

**Step 3:** Import the maven project to Eclipse IDE:

1. Open Eclipse
2. Click File > Import
3. Type Maven in the search box under Select an import source:
4. Select Existing Maven Projects
5. Click Next
6. Click Browse and select the folder that is the root of the Maven project (probably contains the pom.xml file)
7. Click Next
8. Click Finish

### Prerequisites

**1. Java**

Install Java 8
```https://www.oracle.com/in/java/technologies/javase/javase8-archive-downloads.html```

**2. Eclipse IDE**

```https://www.eclipse.org/downloads/```

**3. Opencsv**

Opencsv is an easy-to-use CSV (comma-separated values) parser library for Java. Adding this dependency in pom.xml 

Maven:
```xml
<dependency>
      <groupId>com.opencsv</groupId>
      <artifactId>opencsv</artifactId>
      <version>5.3</version>
  </dependency>
```



## Built With

* [Java](https://www.java.com/en/download/) - Programming Language
* [Maven](https://maven.apache.org/index.html) - Open-Source Build Tool
* [Eclipse](https://www.eclipse.org/) - IDE
