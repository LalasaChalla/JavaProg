import java.util.*;
import java.io.*;
public class Main{
  public static void main(String []args){
    Scanner sc= new Scanner(System.in);
    String M=sc.nextLine();
    if(M.equals("rock"))
    {
      System.out.println("Paper");
    }
    else if(M.equals("paper")){
      System.out.println("Scissors");
    }
    else{
      System.out.println("Rock");
    }
  }
}
