import java.io.*;
import java.util.*;

public class Main{
  public static void main(String []args){
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    int a=6;
    System.out.print(a+" ");
    for(int i=1;i<n;i++){
      a=a+5*i;
      System.out.print(a+" ");
    }
  }
}
