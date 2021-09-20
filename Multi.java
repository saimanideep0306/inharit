package hirarachy;

public class Multi {
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

class Child extends Multi
{
	public void show()
	{
		super.show();
		System.out.println("iam in child class");
	}
}

class Child2 extends Child
{
	public void show()
	{
		super.show();
		System.out.println("iam in child2 class");
	}
}

