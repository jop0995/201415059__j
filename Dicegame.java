package dicegame;

public class Dicegame {
	
	private Player p1;
	private Player p2;
	private Player score;
	
	
	public void startGame(){
		
		p1= new Player("A");
		p2= new Player("B");
		p1.play();
		p2.play();
		
		if(p1.getNum() > p2.getNum()){
			System.out.println(p1.getName()+ " won!");
			p1.setScore(2);
			System.out.println(p1.getName() + " got " +p1.getScore() + " score");
		} else if (p1.getNum()== p2.getNum()){
			System.out.println("draw!!");
		} else {
			System.out.println(p2.getName() + " won!");
			p2.setScore(2);
			System.out.println(p2.getName() + " got " +p2.getScore() + " score");
		}
		
		if(p1.getScore() > p2.getScore()){
			System.out.println(p1.getName()+ ":" +p1.getScore()+ " score "+ ","+ p2.getName()
					+ ":" + p2.getScore() + " score");
		}else if(p2.getScore() > p1.getScore()){
			System.out.println(p2.getName()+ ":" +p2.getScore()+ " score "+ ","+ p1.getName()
			+ ":" + p1.getScore() + " score");
		}else {
			System.out.println("same score");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dicegame g= new Dicegame();
		g.startGame();
	}

}