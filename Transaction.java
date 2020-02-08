package casino;

public class Transaction {
	
	String bet = " ";
	int amount = 0;
	
	Transaction(String b, int a){
		bet = b;
		amount = a;
	}
	
	public String toString() {
		String res = bet + " " + amount;
		return res;
	}

}
