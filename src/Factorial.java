import java.util.Scanner;
/**
 * 
 * @author Veer.Singa
 *
 */
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number :");
		int num = sc.nextInt();
		int fac = 1;
		for(int i = num;i >= 1;i--) {
			fac = fac * i;
		}
		System.out.println("The Factorial is : "+fac);

	}

}
