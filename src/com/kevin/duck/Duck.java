package com.kevin.duck;

import android.util.Log;

import com.kevin.duck.Interface.FlyBehavior;
import com.kevin.duck.Interface.QuackBehavior;

public abstract class Duck {

	FlyBehavior flyBehavoir;
	QuackBehavior quackBehavior;
	
	public abstract void display();
	
	public void performQuack(){
		quackBehavior.quack();
	}
	
    public void performFly(){
    	flyBehavoir.fly();
    }
    
    public void swim(){
    	 Log.d("DEBUG","---------- ��� ������ ���� ���.-----------------");
    }
    
    
}
