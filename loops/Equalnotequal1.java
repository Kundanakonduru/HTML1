import java.util.Scanner;
class Equalnotequal1
{
public static void main(String[] args)
{

Scanner s=new Scanner(System.in);
System.out.println("Enter the value of a:");
int a=s.nextInt();
System.out.println("Enter the value of b:");
int b=s.nextInt();
if(a==b)
{
System.out.println("Equal");
}
else
{
System.out.println("Not equal");
}
}
}