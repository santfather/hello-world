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
		
		System.out.println("Ovoschi po vozrastaniju kalorijnisti");
		
		Collections.sort(vegetables, new Comparator<Vegetable>() {
		    @Override
		    public int compare(Vegetable o1, Vegetable o2) {
		        return o1.getKcal() - o2.getKcal();
		    }
		});
		
		for (Vegetable v : vegetables) {
			System.out.println(v.getName()+": "+v.getKcal());
		}
		
//	       Vegetable a=new roots("корнеплоды");
//	       Vegetable b=new potatoes("клубневые"); 
//	       Vegetable c=new gourd("тыквенные");
//	       Vegetable d=new solanaceae("пасленовые");
	}

}
