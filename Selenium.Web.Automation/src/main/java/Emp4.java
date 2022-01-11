class Emp4{
static String cname="TCS";
String name;
int salary;
void get(String s1,int s2)
{
name=s1;
salary=s2;
}
void show()
{
System.out.println(name);
System.out.println(salary);
System.out.println(cname);
}
static int add(int a,int b)
{
return a+b;
}
public static void main(String[] args)
{
Emp4 e1=new Emp4();
System.out.println(e1.hashCode());
System.out.println(e1);
e1.name="lalu";
System.out.println(e1.name);
Emp4 e2=e1;
System.out.println(e2.hashCode());
System.out.println(e2);
e2.name="bhalu";
System.out.println(e1.name);
}
}
