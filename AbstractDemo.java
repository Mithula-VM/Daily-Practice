abstract class A
{
	public abstract void abc();
	public void xyz()
	{
	}
}
abstract class B extends A
{
}
class C extends B
{
	public void abc()
	{
	}
}
public class AbstractDemo
{
	public static void main (String args[])
	{
		C c1= new C();
	}
}