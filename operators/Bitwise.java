import java.util.Scanner;
class Bitwise
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the value of i and j:");
int i=s.nextInt();
int j=s.nextInt();
System.out.println("AND:"+(i<2 &j<3));
System.out.println("AND:"+(i<2|j<3));
System.out.println("NOT:"+!(j<2));
System.out.println("LEFT SHIFT:"+(i<<1));
System.out.println("RIGHT SHIFT:"+(i>>1));
}
}








