class RockScissorsPaper {
	String sel1, sel2;
	
	public RockScissorsPaper(String sel1, String sel2) {
		this.sel1 = sel1;
		this.sel2 = sel2;
		
		rspPlay(sel1, sel2);
	}
	
	public void rspPlay(String sel1, String sel2) {
		if (sel1.equals("����")) {
			if (sel2.equals("����"))
				System.out.println("�÷��̾�2�� �̰��");
			else if (sel2.equals("��"))
				System.out.println("�÷��̾�1�� �̰��");
			else
				System.out.println("����");
		}
		else if (sel1.equals("����")) {
			if (sel2.equals("����"))
				System.out.println("�÷��̾�1�� �̰��");
			else if (sel2.equals("��"))
				System.out.println("�÷��̾�2�� �̰��");
			else
				System.out.println("����");
		}
		else {
			if (sel2.equals("����"))
				System.out.println("�÷��̾�2�� �̰��");
			else if (sel2.equals("����"))
				System.out.println("�÷��̾�1�� �̰��");
			else
				System.out.println("����");
		}
	}
	
	public static void main(String[] args) {
		String sel1 = "��";
		String sel2 = "����";
		
		System.out.println("�÷��̾�1�� " + sel1 + "�� �°� �÷��̾� 2�� " + sel2 +"�� �¾� �׷���");
		RockScissorsPaper rps = new RockScissorsPaper(sel1, sel2);
	}
}