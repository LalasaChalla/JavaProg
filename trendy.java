import java.util.*;
import java.io.*;

public class Main{
  public static void main(String []args){
    Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();
    if(n>=100 && n<=999){
      while(n>100){
        n=n/10;
      }
      n=n%10;
      if(n%3==0){
        System.out.println("Trendy Number");
      }
      else{
        System.out.println("Not a Trendy Number");
      }
    }
    else{
      System.out.println("Invalid Number");
    }
  }
}
