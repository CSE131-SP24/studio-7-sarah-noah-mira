package studio7;

public class Die {

	private int number; //instance variable
	
	public Die(int n) { //constructor method
		number = n;
	}
	
	public int Result() {
		return (int)(Math.random()*number+1);
	}
	
	
	public static void main(String[] args) {
		Die a = new Die(20);
		Die b = new Die(6);
		System.out.println(a.Result());
		System.out.println(b.Result());
	}
	

}
