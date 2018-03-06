package practicefour;
import java.util.Scanner;
public class Practicefroyo {
	static final String process = "p";
	static final String shutdown = "s";
	static final String yes = "y";
	static final String no = "n";
	public static void main(String [] args) {
		Scanner n = new Scanner (System.in);
		Scanner p = new Scanner (System.in);
		Scanner k = new Scanner (System.in);
		Scanner l = new Scanner (System.in);
		int totalpurchase = 0;
		
		while(true){
			boolean normalbuy = true;
			System.out.println("p:Process");
			System.out.println("s:Shutdown");
			String choice = n.nextLine();
			System.out.println("your choice" + choice);
			if (!choice.toLowerCase().startsWith(process)&&
					!choice.toLowerCase().startsWith(shutdown)){
				System.out.print("please use p or s");
				continue;
			}
			if (choice.toLowerCase().startsWith(shutdown)){
				break;
			}
			if (totalpurchase >=7){
				normalbuy = false;
				System.out.print("You qualify for a free yogurt. would you like"
						+ "to use your credits");
				System.out.print("press y or n to confirm your choice");
				String userinput = p.nextLine();
				if (userinput.toLowerCase().startsWith(yes)){
					totalpurchase = totalpurchase - 7;
					System.out.print("enjoy your free yougurt. you have" +
				 totalpurchase + "stamps left");		
				} else {
					normalbuy = true;
				}
			}
			if (normalbuy = true){
				System.out.println("how many yogurts would you like to buy?");
				int userinput = k.nextInt();
				userinput = userinput + totalpurchase;
				System.out.println("you have total" + userinput +
						"stamps to use");
			
			}
		}
	}
}
