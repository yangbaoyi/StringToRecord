package com.example.stringtorecord;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;

public class PlayRecordReceiver extends BroadcastReceiver {
	private final String PLAYRECORD_ACTION = "com.shuguo.playrecord.action";
	@Override
	public void onReceive(Context context, Intent intent) {
		// TODO Auto-generated method stub
		if(intent.getAction().equals(PLAYRECORD_ACTION)){
			String playString = intent.getStringExtra("record_string");
			if(!TextUtils.isEmpty(playString)){
				TTSManager.getInstance().textToSpeak(playString);
			}
		}
	}

}
