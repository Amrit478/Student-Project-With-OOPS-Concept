import java.util.Scanner;

public class loops {

    public static void main(String[] args) {
        
 /*I am going to write loops programms in different ways*/
    for(int i = 0; i < 5; i++){

        System.out.println(i);
    }

/*This is for while loops. In this loop we test the expression first
 also and it is working until expression found correct */

        int num =10;
    while (5 <= num) {
        System.out.println("Whatever");
        num--;
    } 

/* Write a programm where loops adds only positive numbers */
//Give scanner class if you want to take input from user

    Scanner amrit = new Scanner(System.in);

    int arr[] = {-1, 1, 2, 4, -9, 5, 4};

    System.out.println("Enter any number");

    int i = 0;

    int sum = 0;

    while (i < arr.length) {

    if (arr[i] > 0 ){

        sum += arr[i];
    }
    
    else if(arr[i] <= 0) {
    
        i++;
        continue;
    }
        i++;
    }
        System.out.println(sum);
    }
}