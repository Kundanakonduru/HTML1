class ScopeExample
{
int a=5;//global
void display()
{
int a=10;//local
System.out.println("local:"+a);
System.out.println("global:"+this.a);
}
public static void main(String[] args)
{
ScopeExample obj=new ScopeExample();
obj.display();
}
}
