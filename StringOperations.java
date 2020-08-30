/* Sanjeev Makesh
AP Computer Science A, Period 2
August 28, 2020 */

public class StringOperations{

  public static void main(String args[]){
//Challenge 1
  
String word1 = "scissors";
String word2 = "picture";
String word3 = "computer";

int length1 = word1.length();
int length2 = word2.length();
int length3 = word3.length();

String firstHalf1 = word1.substring(0, length1 / 2);
String firstHalf2 = word2.substring(0, length2 / 2);
String firstHalf3 = word3.substring(0, length3 / 2);

String secondHalf1 = word1.substring(length1 / 2);
String secondHalf2 = word2.substring(length2 / 2);
String secondHalf3 = word3.substring(length3 / 2);

System.out.println(secondHalf1 + firstHalf1);
System.out.println(secondHalf2 + firstHalf2);
System.out.print(secondHalf3 + firstHalf3);

//Challenge 2
System.out.println();
System.out.println("   ________ \n /________ /\\");
System.out.println(" \\\\        / /");
System.out.println("  \\\\      / /");
System.out.println("___\\\\____/_/____");
System.out.println("    \\\\  / /");
System.out.println("     \\\\/ /");
         
  }
}