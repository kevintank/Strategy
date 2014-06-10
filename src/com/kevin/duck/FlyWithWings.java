package com.kevin.duck;

import android.util.Log;

import com.kevin.duck.Interface.FlyBehavior;

public class FlyWithWings implements FlyBehavior {

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		Log.d("DEBUG","----------  날고 있어요-----------------");
	}

}
