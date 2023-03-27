//2. How do we reverse a String?

import java.util.Scanner;

class Reverse
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the original String:");
String str =sc.nextLine();
String revname="";
for(int i=0;i<str.length();i++)
{
revname=str.charAt(i)+revname;
}
System.out.println("Reversed String : "+revname);
}
}

















































