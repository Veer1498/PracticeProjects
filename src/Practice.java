import java.util.Scanner;
/**
 * 
 * @author Veer.Singa
 *
 */
public class Practice {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number :");
		int num = sc.nextInt();
		int add=0;
		for(int i = 1;i<=10;i++) {
			int mul = num * i;
			System.out.println(mul);
			add=add+mul;
		}
		System.out.println("\nSum is : "+add);
	}

}
