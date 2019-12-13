import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Employee {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		Pojo p=new Pojo();
		System.out.println("Employee 1st id");
		int a=sc.nextInt();
		p.setId(a);
		System.out.println("Employee 1st name");
		String b=sc.next();
		p.setEmpName(b);
		System.out.println("Employee 1st phnno");
		long c=sc.nextLong();
		p.setPhnNo(c);
		
		Pojo p1=new Pojo();
		System.out.println("Employee 2nd id");
		int d=sc.nextInt();
		p1.setId(d);
		System.out.println("Employee 2nd name");
		String e=sc.next();
		p1.setEmpName(e);
		System.out.println("Employee 2nd phnno");
		long f=sc.nextLong();
		p1.setPhnNo(f);
		
		Set<Pojo> l=new LinkedHashSet<Pojo>();
		l.add(p);
		l.add(p1);
		
		for(Pojo x:l)
		{
			System.out.println(x.getId());
			System.out.println(x.getEmpName());
			System.out.println(x.getPhnNo());
		}
		
		
				
		
		

	}

}
