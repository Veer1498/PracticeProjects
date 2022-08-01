import java.util.Scanner;
/**
 * 
 * @author Veer.Singa
 *
 */
public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Start Number :");
		int num = sc.nextInt();
		System.out.print("Enter End Number :");
		int num2 = sc.nextInt();
		int a = 0,b = 0;
		int aSum = 0,bSum = 0;
		System.out.println("Odd \t Even");
		System.out.println("=== \t ====");
		System.out.println(" ");

			for(int i = num;i<num2;i++) {
				if(i%2!=0) {
					a = i;
					aSum = aSum + a;
					b = a+1;
					bSum = bSum + b;
					System.out.println(" "+a+"\t  "+b);
				}
				
			}
			System.out.println("\nTotal \t Total");
			System.out.println("=====    =====");
			System.out.println(" "+aSum+"\t  "+bSum);
	}

}
