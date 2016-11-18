package com.kovalenko.sample1;

public abstract class Vegetable {
	
	protected int kcal;
	
	private String name;
	
	private String taste;
	
	public Vegetable (int kcal, String name, String taste) {
		this.kcal = kcal;
		this.name = name;
		this.taste = taste;
	}

   	public abstract void wash();
    public abstract void peel();
    public abstract void cut();
//    public abstract void cutStrips();
   // public abstract void boil();
    //	void boilTime() {
    //	}
   // void taste(){
    //}
    //void color(){
    //}
    
	public int getKcal() {
		return kcal;
	}

	public String getName() {
		return name;
	}
	public String getTaste(){
		return taste;
	}
	}

