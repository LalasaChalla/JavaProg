import java.io.*;
import java.util.*;

public class Main{
  public static void main(String []args){
    Scanner sc= new Scanner(System.in);
    char c = sc.next().toLowerCase().charAt(0);   
    if(c=='a' || c=='e' || c=='i'|| c=='o'|| c=='u'){
      System.out.println("Vowel");
    }
    else if((c>='a' && c<='z')){
      System.out.println("Consonant");
    }
    else{
      System.out.println("Not an alphabet");
    }
  }
}
