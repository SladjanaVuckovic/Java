import java.util.Scanner;

public class IfElseStruktura {

	public static void main(String[] args) {
		

		int x, y;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesite vrednost x: ");
		x = sc.nextInt();
		
		if(x>=0)
			y = x;
		else
			y = -x;
		
		System.out.println("Za uneto x= " +x+ " dobija se y= "+y);
			
		
	}

}
