package EDNA2;

import java.util.Scanner;

public class Titia2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner hi = new Scanner(System.in);
		float nu = hi.nextFloat();
		
		if (nu >= 1.99 && nu <=5.99) {
			System.out.println("O número está entre 1,99 e 5,99: ");
		}
		else {
			System.out.println("O número nao está entre 1,99 e 5,99: ");
		}
		
	}

}
