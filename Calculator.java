import java.util.Scanner;

class Calculator
{
public static void main(String[] args)
{
Scanner m=new Scanner(System.in);
System.out.println("Enter two numbers:");
double a=m.nextDouble();
double b=m.nextDouble();
switch(operator)
{
case 1:
  output= a+b;
  break;
case 2:
  output= a-b;
  break;
case 3:
  output= a*b;
  break;
case 4:
  output= a/b;
  break;
}
System.out.println(a,operator,b,output);
}
}
