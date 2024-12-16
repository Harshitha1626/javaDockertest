import util.java.Scanner;
public class Palindrome{
	public static void main(String[] ardgs){
		Scanner sc = new Scanner(System.in);
		int num = nextInt(),rev=0,temp=num;
		while(num>0)rev=rev*10+num%10,num/10;
		System.out.println(temp==rev?"palindrome:" "Not palindrome:");
		sc.close();
	}
}
