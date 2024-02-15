import java.util.Scanner;
public class SumOfDigits {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a number to find its sum of digits: ");//eg 144
      int num = sc.nextInt();
      int sum=0;
      while(num>0){
          int digits = num%10; //to retrive each digits of the number from last ,eg:4
          sum=sum+digits; //summing up the retrieved digits, eg sum=4
          num=num/10; //finding the remaining substring of the number ,eg num=14
      }
      System.out.println("Sum of the digits : "+sum);
    }
}