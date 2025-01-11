interface X
{
	int a=50;
	void add();
	void sub();
}
interface Y
{
	int b=10;
	void mul();
	void div();
}
interface Z extends X,Y
{
}
class Calculator implements Z
{
	public void add()
	{
		System.out.println("Add: "+(X.a+Y.b));
	}
	public void sub()
	{
		System.out.println("Subtract: "+(X.a-Y.b));
	}
	public void mul()
	{
		System.out.println("Multiply: "+(X.a*Y.b));
	}
	public void div()
	{
		System.out.println("Divide: "+(X.a/Y.b));
	}

}
public class InterfaceDemo
{
	public static void main(String args[])
	{
		
		Calculator c1=new Calculator();
		
		X x1=c1;
		x1.add();
		x1.sub();
		System.out.println("-----------------");

		Y y1=c1;
		y1.mul();
		y1.div();
		System.out.println("-----------------");

		Z z1=c1;
		z1.add();
		z1.sub();
		z1.mul();
		z1.div();
	}
}
