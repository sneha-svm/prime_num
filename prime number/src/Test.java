import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a value");
		int num = s.nextInt();
		boolean isPrime = true;
		for(int i=2;i<num;i++) {
			if(num%i==0)
				isPrime=false;
			break;
		}
		if(isPrime) {
			System.out.println(num+"is a prime number");
		}
		else {
			System.out.println(num+"is not a prime number");
		}
	}

}
