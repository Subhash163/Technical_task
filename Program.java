//26.Write a Java Program to print the below output: * 1 * 12 * 123 * 1234 * 12345 * 123456 * 1234567


import java.util.Scanner;
class Program
{
public static void main(String [] args)
{
Scanner scan = new Scanner(System.in);
System.out.println("Enter the value of n : ");
int n = scan.nextInt();
for (int i = 1; i <= n; i++) 
{
for (int j = 1; j <= i; j++) 
{
System.out.print(j);
}
System.out.print(", ");
}             
}
}

