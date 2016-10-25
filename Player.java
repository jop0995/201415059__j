
package com.sd.DiceGame;

public class Player {
    private String name=null;
    private int num=0;
    public Player(String name) {
        this.name=name;
    }
    public void play() {
        Dice d=new Dice();
        d.roll();
        num = d.getNum();
    }
    public int getNum() {
      return num;
    }
    public String getName() {
      return name;
    }
}