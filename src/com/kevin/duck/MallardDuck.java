package com.kevin.duck;

import com.kevin.duck.Interface.QuackBehavior;

import android.util.Log;

public class MallardDuck extends Duck {

	/*private Quack quackBehavior;
	private FlyWithWings flyBehavior;*/
	
	public MallardDuck() {
		// TODO Auto-generated constructor stub
		quackBehavior = new Quack();
		flyBehavoir = new FlyWithWings();
		
	}
	
	@Override
	public void display() {
		
		 Log.d("DEBUG","---------- 저는 물오리에요-----------------");

	}

}
