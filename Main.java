import java.util.Scanner;
public class Main
{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("enter n value");
		n=sc.nextInt();
		if(n==0)
		System.out.println("zer0");
		else
		if(n>0)
		System.out.println("positive");
		else
		System.out.println("negative");
	}
}
		