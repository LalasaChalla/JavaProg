import java.io.*;
import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    int year= sc.nextInt();
    if(year%4==0 || year%400==0){
      System.out.println("Schedule Event");
    }
    else{
      System.out.println("No Event This Year");
    }
  }
}
