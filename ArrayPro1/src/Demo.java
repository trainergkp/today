import java.util.*;
public class Demo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements");
		int num=sc.nextInt();
		int [] a=new int[num];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter element");
			a[i]=sc.nextInt();
		}
			System.out.println("Print the elements");
		System.out.println("......................................");
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
			sum=sum+a[i];
		}
		System.out.println(".........................................................");
		System.out.println("Sum of elements :"+sum);
	}

}
