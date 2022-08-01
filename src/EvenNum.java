import java.util.Scanner;
/**
 * 
 * @author Veer.Singa
 *
 */
public class EvenNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Start Number :");
		int num = sc.nextInt();
		System.out.print("Enter End Number :");
		int num2 = sc.nextInt();
		
		if(num<num2) {
			for(int i = num;i<=num2;i++) {
				if(i%2==0)
				System.out.println(i);
			}
		}
		else {
			for(int i = num;i>=num2;i--) {
				if(i%2==0)
				System.out.println(i);
			}
		}
	}

}
