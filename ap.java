import java.io.*;
import java.util.*;

public class Main{
  public static void main(String []args){
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    float runrate=95.0f;
    System.out.print(runrate+" ");
    for(int i=1;i<n;i++){
      runrate=runrate+20.5f;
      System.out.print(runrate+" ");
    }
  }
}
