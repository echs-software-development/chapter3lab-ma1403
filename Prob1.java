import java.util.Scanner;

public class Prob1 {
  public static void main(String[] args){
  Scanner scan=new Scanner(System.in);
  System.out.println("Enter a number: ");
  int num =scan.nextInt();
  if (num > 5 || num < 76)
  {
    System.out.println("True");
  }
  else {
    System.out.println("False");
  }


  }
  }