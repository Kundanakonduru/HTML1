import java.util.Scanner;
class Largestnumber
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter three numbers:");
int a=s.nextInt();
int b=s.nextInt();
int c=s.nextInt();
if(a>b && a>c)
{
System.out.println("a is largest");
}
else if(b>a && b>c)
{
System.out.println("b is largest");
}
else
{
System.out.println("c is largest");
}
}
}

