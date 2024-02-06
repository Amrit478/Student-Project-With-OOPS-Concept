import java.util.Scanner;

public class Array {
    
    public static void main(String[] args) {
        
/* An array is a data structure that stores a collection 
of elements of the same type, accessed by index. Advantages
 include efficient storage and retrieval, while disadvantages
  involve fixed size and lack of flexibility in resizing. */\

  /* Write a class where you write for five people names ages
   * and their income*/
  Scanner jass = new Scanner(System.in); 

//I have assign the variables value and take input from user

  System.out.println(" Enter your name ");  
  String[] amrit = new String[100];

//I have assign value to the array

  int arr[] = {27, 31, 60, 58, 32};

// I did not specify the range for this array and take input from user
System.out.println("Enter you income");
    double[] dad = new double[]{};
    
    for( int i = 0; i < 3; i++) {

        System.out.println("My name is " + amrit[i] + ". My age is" + arr[i] + ". My income is" + dad[i]);
    }
    }
}
