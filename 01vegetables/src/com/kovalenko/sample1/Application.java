package com.kovalenko.sample1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		List<Vegetable> vegetables = new ArrayList<>();
		
		vegetables.add(new Potato());
		vegetables.add(new Topinambur());
		vegetables.add(new Carrot());
		vegetables.add(new Radish());
		vegetables.add(new Pumpkin());
		vegetables.add(new Squash());
		vegetables.add(new Tomato());
		vegetables.add(new Eggplant());
		
		System.out.println("Овощи по каллорийности");
		
		Collections.sort(vegetables, new Comparator<Vegetable>() {
		    @Override
		    public int compare(Vegetable o1, Vegetable o2) {
		        return o1.getKcal() - o2.getKcal();
		    }
		});
		
		for (Vegetable v : vegetables) {
			System.out.println(v.getName()+": "+v.getKcal());
		}
	}

}
