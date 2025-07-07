import java.util.*;
import java.io.*;

public class Main{
  public static void main(String []args){
    Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();
    for(int i=1;i<=n;i++){
      float a= 0.5f*(float)(Math.pow(3,i-1));
      System.out.print(a+" ");
    }
  }
}
