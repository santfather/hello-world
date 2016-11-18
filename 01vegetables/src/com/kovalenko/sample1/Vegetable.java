package com.kovalenko.sample1;

public abstract class Vegetable {
	
	protected int kcal;
	
	public Vegetable (int kcal) {
		this.kcal = kcal;
	}

   	public abstract void wash();
    public abstract void peel();
    public abstract void cut();
//    public abstract void cutStrips();
    public abstract void boil();
    //	void boilTime() {
    //	}
    void taste(){
    }
    void color(){
    }
}
