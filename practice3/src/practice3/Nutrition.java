package practice3;
import java.util.Scanner;
public class Nutrition {
	public static final String foodone= "avocado";
	public static final String foodtwo = "tomato";
	public static final double Vitc = 0.23;
	public static final double Vita = 5.5;
	
	private static boolean validserv(int a){
		if (a > 15 || a <0){
			return false;
		}
		return true;
			
	}
	private static boolean validamount(int b){
		if (b < 0 || b > 1500){
			return false;
		}
		return true;
	}
	
	public static void main(String [] args){
		 int userinput;
		 int serv;
		double totalvitC = 0;
		double totalvitA =0;
		Scanner n = new Scanner (System.in);
		Scanner p = new Scanner (System.in);
		Scanner g = new Scanner (System.in);
		Scanner k = new Scanner (System.in);
		System.out.println("Possible ingredients");
		System.out.println("Avocado");
		System.out.println("Tomato");
		System.out.println("what do you want to call this recipe?");
		String recipename = n.nextLine();
		System.out.println("How many servings?");
		 serv = p.nextInt();
		if (serv > 15 || serv <0){
			System.out.println("invalid input");
			}
		if (!validserv(serv)){
			return;}
		
		System.out.println("how much tomato?");
		 userinput = g.nextInt();
		 if (!validamount(userinput)){
			 return;
		 }
			 
		totalvitC = (userinput * Vitc)/100;
		totalvitA = (userinput * Vita)/100;
		System.out.println("how much avocado?");
		 userinput = k.nextInt();
		 if (!validamount(userinput)){
			 return;
		 }
		totalvitC = (userinput * Vitc)/100;
		totalvitA = (userinput * Vita)/100;
		System.out.println("Ntrition per serving is");
		System.out.println("total vitamin c is " + totalvitC/serv);
		System.out.println("total vitamin A is " + totalvitA/serv);
		
		
	}

}
