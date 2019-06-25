import java.util.Scanner;
public class four {

	public static void main(String[] args) {
		
		char b1,b2;
		Scanner sc=new Scanner(System.in);
		b1=sc.next().charAt(0);
		b2=sc.next().charAt(0);
        if(b1>b2)
        {
        	System.out.println(b2);
        	System.out.println(",");
        	System.out.println(b1);
        }
        else
        {
        	System.out.println(b1);
        	System.out.println(",");
        	System.out.println(b2);
        }
	}

}
