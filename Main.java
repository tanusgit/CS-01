package linklist;
import java.util.*;
import javax.swing.*;

import linklist.Card.suit;
//import java.util.LinkedList;
public class Main {
	public static void main(String args[]) {
		TripleString m = new TripleString();
		System.out.println("printing default constructor " + m);
		TripleString s = new TripleString("Madhurima", "Nilam", "");
		System.out.println("printing constructor with parameter " + s);
		String str1 = s.getString1();
		System.out.println("printing first string " +str1);
		String str2 = s.getString2();
		System.out.println("printing second string " +str2);
		String str3 = s.getString3();
		System.out.println("printing third string " +str3);
		String str4 = s.setString3("Minasini");
		System.out.println("printing third string after setting it "
				+ "with a new value: " +str4);
		
		
		
		
		/*StringOperation m = new StringOperation();
		char c = m.getKeyCharacter();
		String s = m.getString();
		//String res = m.maskCharacter(s, c);
		//System.out.print(res);
		//String res2 = m.removeCharacter(s, c);
		int res2 = m.countKey(s, c);
		System.out.println(res2);		
		
		/*GuiJava ex = new GuiJava();
		ex.show();
		
		/*MapDemo m = new MapDemo();
		m.show();
		
		
		/*Setdemo k = new Setdemo();
		k.show();
		
		
		/*QueueDemo q = new QueueDemo();
		q.show();
		
		
		
		
		/*List<Customer> list = new ArrayList<>();
		list.add(new Customer("Mina", "aina@gmail"));
		list.add(new Customer("Cina", "bina@gmail"));
		list.add(new Customer("Bina","cina@gmail"));
		list.add(new Customer("Aina", "dina@gmail"));
		//System.out.println(list);
		//we need to implement comparable interface in customer class to call the sort
		//method and compare between two customer objects
		//comparing based on emails so we need to create an object of Emailcomparator
		//and then pass it to the sort method
		Collections.sort(list, new Emailcomparator());
		System.out.println(list);
		//Collections.sort(list);
		//System.out.println(list);
		
		
		
		
		
		
		
		
		
		/*CollectionDemo.show();
		
		
		/*GenericList<String> m = new GenericList<String>();
		 
		m.add("Mina");
		m.add("kina");
		
		for ( String n : m) {
			System.out.println(n);
		}
		
		
		
		/*
		
		
		/*
		 * 
		
		
		
		
		/*Iterator i = m.iterator();
		while((i).hasNext()) {
			Object k =  (i).next();
			System.out.print(k);
		}
		
		
		
		
		/*m.add("rif");
		m.add("nit");
		for(Object n: m.items) {
			System.out.println(n);
		}
		
		
		/*Card m = new Card();
		//to insert enum value in constructor we need to call the enum type before the 
		//value
		Card mn = new Card('T', suit.Diamonds);
		
		
		Card m = new Card();
		m.suffle();
		
		int mo = (int) (Math.random()*11);
		System.out.print(mo);
		
		
		
		TaxCalculator2018 n = new TaxCalculator2018(205000);
		TaxReport k = new TaxReport(n);
		k.show();
		
		
		TaxReport r = new TaxReport();
		r.show();
		LinkedList list = new LinkedList();
		//list.addFirst(5);
		//list.addLast(6);
		//list.addLast(3);
		//list.addLast(2);
		//list.addLast(7);
		list.addLast(6);
		//list.removeFirst();
		try {
		System.out.println(list.toString());
	}catch(NullPointerException e) {
		
	}*/
	}
}
