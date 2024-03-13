package org.example;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CsvReader {

    public static List<Book> readBooksFromCsv(String filePath) {
        List<Book> books = new ArrayList<>();


//    //parsing a CSV file into Scanner class constructor
//    Scanner sc = new Scanner(new File("F:\\CSVDemo.csv"));
//sc.useDelimiter(",");   //sets the delimiter pattern
//while (sc.hasNext())  //returns a boolean value
//    {
//        System.out.print(sc.next());  //find and returns the next complete token from this scanner
//    }
//sc.close();  //closes the scanner
//}
//}