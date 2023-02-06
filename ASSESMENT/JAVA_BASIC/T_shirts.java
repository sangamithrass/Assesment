package java_basic;

import java.util.Scanner;

public class T_shirts {


		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			String[] cart = {"round-neck", "collared", "hooded", "round-neck", "round-neck"};
			int total_Cost = 0;
			int discount = 0;
			int final_Amount = 0;
			
			for (String type : cart) {
				  if (type.equals("round-neck")) {
					  total_Cost =total_Cost+ 200;
				  } else if (type.equals("collared")) {
					  total_Cost =total_Cost +250;
				  } else if (type.equals("hooded")) {
					  total_Cost = total_Cost +300;
				  }
				}

				if (cart.length < 5) {
				  discount = 0;
				} else if (cart.length >= 5 && cart.length <= 10) {
				  discount = 10;
				} else if (cart.length > 10) {
				  discount = 20;
				}
				 final_Amount = total_Cost - (total_Cost * discount / 100);
				System.out.println("The final price is Rs." + final_Amount);
			
		}
		
	

}
