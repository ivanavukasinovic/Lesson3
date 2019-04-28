package optional;

import javax.swing.JOptionPane;

import junit.framework.TestCase;

/* Complete the countQuarters() method so that it calculates the number of cents left over 
 * if you took out all the possible quarters. */

public class CountQuarters extends TestCase {
	
	public void test() throws Exception {
		assertEquals(0, countQuarters(0.25));
		assertEquals(0, countQuarters(1));
		assertEquals(14, countQuarters(0.64));
		assertEquals(3, countQuarters(12.78));
	}

	private Object countQuarters(double money) {
		// TODO Auto-generated method stub
		if(money >= 0.25) {
			return money*100 % 25;
		}else {
		return ("You have less than a quarter.");
		}
	}
	
	public static void main(String[] args) throws Exception{
		
		CountQuarters cq = new CountQuarters();
		
		cq.test();
		
	}

}