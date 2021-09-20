package hirarachy;

public class Hirarachy {
	public void show()
	{
		System.out.println("Hi iam in paresnt class");
	}
public static void main(String args[])
{
	Child2 s=new Child2();
	s.show();
}

}

class Child extends Hararachy
{
	public void show()
	{
		super.show();
		System.out.println("iam in child class");
	}
}

class Child2 extends Hirarachy
{
	public void show()
	{
		super.show();
		System.out.println("iam in child2 class");
	}
}
