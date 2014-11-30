package com.pickme.android.activities;

import com.pickme.android.R;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Pi_ASplash extends Activity {
	
	private boolean _init = false;
	private boolean _flag = true;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pi_lay_asplash);
		_init = true;
		_flag = false;
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.pi__asplash, menu);
		return true;
	}

}
