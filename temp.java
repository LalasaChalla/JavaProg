import java.util.*;
import java.io.*;

public class Main{
  public static void main(String []args){
    Scanner sc= new Scanner(System.in);
    int temp= sc.nextInt();
    if(temp>0){
      System.out.println("Safe for outdoor activities");
    }
    else{
      System.out.println("Too cold for outdoor activities");
    }
  }
}
