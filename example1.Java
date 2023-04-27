package misc;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

import misc.Binary_tree.Node;



public class main_misc {
    
	
	public static void main(String[] args) {
	  
	
    
		Binary_tree b = new Binary_tree();
		b.add(0, 8);
		b.add(1, 4);
		b.add(2, 2);
		b.add(3, 6);
		b.add(4, 10);
		b.add(5, 20);
		
		b.link_left(0, 1);
		b.link_right(0, 4);
		
		b.link_left(1, 2);
		b.link_right(1, 3);
		
		b.link_right(4, 5);
		
		//System.out.println(b.bst_sequences(b.get_node(0)));
		
		LinkedList<Integer> a = new LinkedList<>();
		a.add(8);
		
		LinkedList<Integer> c = new LinkedList<>();
		c.add(4);
		c.add(2);
		c.add(6);
		
		LinkedList<Integer> d = new LinkedList<>();
		d.add(10);
		d.add(20);
		
		System.out.println(b.bst_sequences(b.get_node(0)));
		
		
	
	}
		
	
	
		
	}
	
	
		
	
		

	
  
	
    
	
		

	

	
		
		
	

	
	
	
	
	
	
	
	
	

	


	
	

	
		
	
	


	

	
	


	
	
	

	


	
	

	
		
	
	


	

	
	

