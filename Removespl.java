//14.How to remove special characters from a string in java?	

import java.util.Scanner;

class Removespl
{
	
public static void main (String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.print("enter your name:");
String name = sc.nextLine();
int ascii;
System.out.println("Your name is:");
for (int i=0; i<name.length(); i++)
{
ascii = name.charAt(i);
if((name.charAt(i)>=65&&name.charAt(i)<=90)||(name.charAt(i)>=97&&name.charAt(i)<=122)||(name.charAt(i)>=48&&name.charAt(i)<=57))
{
System.out.print(name.charAt(i));
}
else
{
continue;
}
}
}
}

