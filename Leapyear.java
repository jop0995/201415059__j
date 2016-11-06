class LeapYear {
	public void computeLeap(int[] y) {
		for (int x: y) {
			if (((x % 4 == 0) && (x % 100 != 0)) || (x % 400 == 0)) {
				System.out.printf("%d ���� �����̾�\n", x);
			}
			else{
				System.out.printf("%d ���� �����̾ƴϾ�\n", x);
			}
		}
	}
	
	public static void main(String[] args) {
		int[] year = { 1000, 1400, 1280, 1842, 1996, 2007, 2013 };
		
		LeapYear l = new LeapYear();
		l.computeLeap(year);
	}
}