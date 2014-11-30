package com.pickme.android.activities;

import com.pickme.android.R;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Pi_ASplash extends Activity {
	
	private boolean _init = false;
	private boolean _flag = true;
	// try 3rd commit
	private boolean _init3 = false;
	// try 4th commit
	private boolean _init4 = false;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pi_lay_asplash);
		_init = true;
		_flag = false;
		// 3rd commit
		_init3 = true;
		// 4th commit
		_init4 = true;
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.pi__asplash, menu);
		return true;
	}

}
