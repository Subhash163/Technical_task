//6.How is an infinite loop declared in Java?

import java.util.Scanner;
class infinite
{
public static void main (String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the name :");
String name=sc.nextLine();
for(int i=0;i<1;)
{	
System.out.println(name);
}
}
}
