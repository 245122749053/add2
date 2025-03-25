import java.util.*;
class add1{
	public static void main(String args[]){
		int a,b,c;
		Scanner myobj=new Scanner(System.in);
		System.out.println("enter a number");
		a=myobj.nextInt();
		System.out.println("enter a number");
		b=myobj.nextInt();
		int add=a+b;
		int sub=a-b;
		int mul=a*b;
		int div=a/b;
		System.out.println(add);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(div);
	}
}
