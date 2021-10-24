package org.my.util;

/**
 * 222
 * 
 * @author jerry
 *
 */
public class Scanner {

	public int s = 1;
	public String ss = "";

	public Scanner(int j) {
		s = j;
	}

	public Scanner(int j, String ss) {
		s = j;
		this.ss = ss;

	}

	public void testS() {
		System.out.println(s);
	}

	public int getS() {
		return s;
	}

	@Override
	public boolean equals(Object obj) {
		boolean flag = false;
		Scanner scan = (Scanner) obj;
		if (scan.getS() >= s) {
			flag = true;
			if (obj == this) {
				flag = true;
			} else {
				flag = false;
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(9);
		Scanner scan1 = new Scanner(1);
		System.out.println(scan.equals(scan1));
		System.out.println("11".equals("11"));

	}

}
