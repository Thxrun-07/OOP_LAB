public class Operators{
    public static void main(String arghs[])
{

int a = 45;
System.out.println("variable a : " + a);
int b = 22;
System.out.println("variable b : " + b);
int c = a+b;
System.out.println("sum : " + c);
int d = a-b;
System.out.println("difference : " + d);
int e = a*b;
System.out.println("product : " + e);
int f = a/b;
System.out.println("divison : " + f);
int g = a%b;
System.out.println("reminder : " + g);
int x = 0;
System.out.println("declaring x is : " + x);
x++;
System.out.println("x after increment is : " + x);
x--;
System.out.println("x after dicrement is : " + x);
boolean p = a>b;
System.out.println("a > b: " + p);
boolean q = a<b;
System.out.println("a < b : " + q);
boolean r = a!=b;
System.out.println("a != b : " + r);
boolean s = a<=b;
System.out.println("a <= b : " + s);
boolean t = a>=b;
System.out.println("a <= b : " + t);
boolean a1 = a == b;
System.out.println("a == b : " + a1);
System.out.println("p is a > b ");
System.out.println("q is a < b ");
boolean b1 = p || q;
System.out.println("p or q : " + b1);
boolean b2 = p && q;
System.out.println("p and q : " + b2);
boolean b3 = !(p && q);
System.out.println("not(p and q) : " + b3);
}
}