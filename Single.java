package hirarachy;

public class Single {
	public void show()
	{
		System.out.println("Hi iam in paresnt class");
	}
public static void main(String args[])
{
	Child s=new Child();
	s.show();
}

}

class Child extends Single
{
	public void show()
	{
		super.show();
		System.out.println("iam in child class");
	}
}
