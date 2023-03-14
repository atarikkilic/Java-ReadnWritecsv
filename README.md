# Java-ReadnWritecsv (Req.1)

This project read a input csv file using the CsvReader class. Parsed the data from the csv file to show distribution of count of played distinct songs per client count on a particular date (Feb 02, 2022).
Counted the number of occurrences of each customer. Depending on the count of occurrences, wrote the updated variables (client_count and distinct_play_count) to a output csv file.

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

**Step 4:** Change the path in CsvReader class according to your path

```java
String fileName = "C://Users//ekilabd//OneDrive - Ericsson//Documents//GitHub//Java-ReadnWritecsv//input-data.csv";
```

**Step 5:** Change the path in CsvWriter class according to your path

```java
new FileWriter("C://Users//ekilabd//OneDrive - Ericsson//Documents//GitHub//Java-ReadnWritecsv//output-data.csv")
```

**Step 6:** Run the Main class in IDE

Get the output csv file

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


## SQL Query (Req.2)

```sql
SELECT COUNT(DISTINCT clientId) AS client_count, COUNT(DISTINCT songId) AS distinct_play_count FROM table WHERE time='2.02.2022';
```
