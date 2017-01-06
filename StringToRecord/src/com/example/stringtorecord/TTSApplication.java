package com.example.stringtorecord;

import android.app.Application;
import android.content.Context;

public class TTSApplication extends Application{
	private static Context context;
	
	
	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		context = this;
		super.onCreate();
	}

	public static Context getContext(){
		return context;
	}
}
