import java.io.*;  
import java.util.*;  
public class dataCrunching  
{  
public static void main(String[] args) throws Exception  
{  
//parsing a TSV file into Scanner class constructor  
Scanner sc = new Scanner(new File("D:\\ip_1m.tsv"));  
sc.useDelimiter(",");   //sets the delimiter pattern  
while (sc.hasNext())  //returns a boolean value  
{  
System.out.print(sc.next());  //find and returns the next complete token from this scanner  
}   
sc.close();  //closes the scanner  
}  
}  
