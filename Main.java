import java.util.Scanner;

/**
 *calculate the total
total of all of the digits (addition)in that integer
 * @author Cesar Gil
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // User input
    Scanner input = new Scanner(System.in);
    int number;
    //  loop
    do{
      System.out.println("Please enter a postive integer to add the digits of:");
      number = input.nextInt();
    }while(number <= 0);
    int lastdigit = number%10;
    int total = 0;
    // calculate
    while (number > 0){
      number = number / 10;
      total = total +number % 10;
    }
//
System.out.println("The sum of these digits is " + (total+lastdigit));
  }
}