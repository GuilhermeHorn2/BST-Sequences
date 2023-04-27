package misc;

import java.util.ArrayList;
import java.util.LinkedList;

import misc.Graph_1.Node;

public class Binary_tree {

	   public static class Node{
	    	public int _id;
	    	public ArrayList<Node> adj;
	    	public int marked = 0;
	    	public int value;
	    	
	    	public Node(int id,int val) {
	    		_id = id;
	    		value = val;
	    		adj = new ArrayList<>();
	    		adj.add(0,null);
	    		adj.add(1,null);
	    		adj.add(2,null);
	    	
	    	}
	    	
	    	/*public String toString() {
	    		return "{id:" + _id + " / value:" + value + "}";
	    	}*/
	    	
	    	public String toString() {
	    		return ""+value;
	    	}
	    	
	    	public void set_value(int v) {
	    		value = v;
	    	}
	    	
		    public Node left() {
		    	if(this.adj.get(0) != null) {
		    		return this.adj.get(0);
		    	}
		    	return null;
		    }
		    public Node right() {
		    	if(this.adj.get(1) != null) {
		    		return this.adj.get(1);
		    	}
		    	return null;
		    }
		    
		    public Node get_parent(){
		    	if(this.adj.get(2) != null){
		    		return this.adj.get(2);
		    	}
		    	return null;
		    }
		    
	    	
	    }
	    
	    public ArrayList<Node> nodes;
	    
	    public Binary_tree() {
	    	nodes = new ArrayList<>();
	    }
	    
	    public void add(int i,int val) {
	    	Node novo = new Node(i,val);
	    	nodes.add(novo);
	    }
	    
	    public void link_left(int id1,int id2){
	    	Node n = nodes.get(id1);
	    	n.adj.remove(0);
	    	n.adj.add(0, nodes.get(id2));
	        Node r = nodes.get(id2);
	        if(r.adj.get(2) == null) {
	        	r.adj.remove(2);
	        	r.adj.add(2,n);
	        }
	    }
	    
	    public void link_right(int id1,int id2) {
	    	Node n = nodes.get(id1);
	    	n.adj.remove(1);
	    	n.adj.add(1,nodes.get(id2));
	    	Node r = nodes.get(id2);
	    	if(r.adj.get(2) == null) {
	    		r.adj.remove(2);
	    		r.adj.add(2,n);
	    	}
	    }
	    
	    
	    public Node get_node(int i) {
	    	return nodes.get(i);
	    }
	    
	    public ArrayList<Node> get_adj(Node n){
	    	return n.adj;
	    }
	    
	    
	    /*Binary tree sequences*/
	    
	  /**/
	  
	  public LinkedList<LinkedList<Node>> bst_sequences(Node n){
		   
		   LinkedList<LinkedList<Node>> all = new LinkedList<>();
		   
		   if(n == null){
			   all.add(new LinkedList<Node>());
			   return all;
		   }
		   
		   
		   LinkedList<Node> l = new LinkedList<>();
		   
		   l.addFirst(n);///n is the root of the subtree,so it must come before
		   
		   LinkedList<LinkedList<Node>> left = bst_sequences(n.left());//all left sequences
		   LinkedList<LinkedList<Node>> right = bst_sequences(n.right());//all right sequences
		   
		   for(int i = 0;i < left.size();i++) {
			   for(int j = 0;j < right.size();j++){
				   
				   all.addAll(combine(l,left.get(i),right.get(j)));
				   
			   }
		   }
		   
		   return all;
	   }
	   
	   public LinkedList<LinkedList<Node>> combine(LinkedList<Node> l,LinkedList<Node> left,LinkedList<Node> right){
		   
		   LinkedList<LinkedList<Node>> combined = new LinkedList<>();
		   
		   
		   if(left.size() == 0 || right.size() == 0){
			   LinkedList<Node> clone = (LinkedList<Node>) l.clone();
			   clone.addAll(left);
			   clone.addAll(right);
			   combined.add(clone);
			   return combined;
		   }
		   
		   
		 
			   l.add(left.removeFirst());
			   combined.addAll(combine(l,left,right));
			   left.addFirst(l.removeLast());
			
		   
		   
		 
			   l.add(right.removeFirst());
			   combined.addAll(combine(l,left,right));
			   right.addFirst(l.removeLast());
		   
		   
		   
		   return combined;
	   }
		   
		   
	   }
	    
	    	
	    
	   	

