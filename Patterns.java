/*
//1
public class Patterns
{
public static void main(String[]args)
{
System.out.println("*");
}
}


//2
public class Patterns
{
public static void main(String[]args)
{
for(int i=0;i<5;i++)
{
System.out.println("*");
}
}
}


//3
public class Patterns
{
public static void main(String[]args)
{
for(int i=0;i<5;i++)
{
System.out.print("*");
}
}
}

//4
public class Patterns
{
public static void main(String[]args)
{
for(int i=0;i<5;i++)
{
for(int j=0;j<5;j++)
{
System.out.print("*");
}
System.out.println("");
}
}
}

/•4
1 1 1 1 1 
2 2 2 2 2 
3 3 3 3 3 
4 4 4 4 4 
5 5 5 5 5*/
public class Patterns
{
public static void main(String[]args)
{
for(int i=1;i<=5;i++)
{
for(int j=1;j<=5;j++)
{
System.out.print(i);
}
System.out.println("");
}
}
}

/*5
1 2 3 4 5 
1 2 3 4 5 
1 2 3 4 5 
1 2 3 4 5 
1 2 3 4 5*/
public class Patterns
{
public static void main(String[]args)
{
for(int i=1;i<=5;i++)
{
for(int j=1;j<=5;j++)
{
System.out.print(j);
}
System.out.println("");
}
}
}

/*6
1       2       3       4       5
6       7       8       9       10
11      12      13      14      15
16      17      18      19      20
21      22      23      24      25*/
public class Patterns
{
    public static void main(String[]args)
    {
        int rows=5;
        int col=5;
        int number=1;
        for(int i=1;i<=rows;i++)
        {
            for(int j=1;j<=col;j++)
            {
                System.out.print(number+"\t");
                number++;
            }
            System.out.println();
        }
    }
}
/*
//7
1       2       3       4       5 
6       7       8       9       1 
2       3       4       5       6 
7       8       9       1       2 
3       4       5       6       7*/
public class Patterns
{
    public static void main(String[]args)
    {
        int rows=5;
        int col=5;
        int number=1;
        for(int i=1;i<=rows;i++)
        {
            for(int j=1;j<=col;j++)
            {
                System.out.print(number+"\t");
                number++;
                if(number>9)
                {
                    number=1;
                }
            }
            System.out.println();

        }
    }
}

/*
//8
1       3       5       7       9
11      13      15      17      19
21      23      25      27      29
31      33      35      37      39
41      43      45      47      49*/
public class Patterns
{
    public static void main(String[]args)
    {
        int rows=5;
        int col=5;
        int number=1;
        for(int i=1;i<=rows;i++)
        {
            for(int j=1;j<=col;j++)
            {
                System.out.print(number+"\t");
                number+=2;
            }
            System.out.println();

        }
    }
}

/*9
0 1 0 1
0 1 0 1
0 1 0 1
0 1 0 1
0 1 0 1*/
public class Patterns
{
    public static void main(String[]args)
    {
        for(int i=0;i<=5;i++)
        {
            for(int j=0;j<=3;j++)
            {
                System.out.print(j%2 +"\t");
            }
            System.out.println("");
        }
    }
}
*/

//9

public class Pattern
{
    public static void main(String[] args) 
    {
        int size = 5; 

        for (int i = 1; i <= size; i++) 
        {
            for (int j = 1; j <= size; j++) 
            {
                if (i == 1 || i == size || j == 1 || j == size) 
                {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); 
                }
            }
            System.out.println();
        }
    }
}


/*
    *     
    *     
* * * * * 
    *     
    *   
*/
//10


public class Pattern 
{
    public static void main(String[] args) 
    {
        int n = 5; 

        int mid = n / 2 + 1; 

        for (int i = 1; i <= n; i++) 
        {
            for (int j = 1; j <= n; j++) 
            {
               
                if (i == mid || j == mid) 
                {
                    System.out.print("* ");
                } else 
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
