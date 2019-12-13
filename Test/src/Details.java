
public class Details extends Test {
	
	public void tamil(String a)
	{
		System.out.println("Child Tamil"+a);
	}
	public void english()
	{
		System.out.println("Child English");
	}
	public static void main(String[] args)
	{
	Details t=new Details();
	t.english();
	t.tamil(1);
	}
	
	

}
