package com.example.takaapplication;

import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
import android.os.Bundle;

public class MainScreenActivity extends ActionBarActivity implements OnClickListener {
	
	//Declaration of variables
	EditText etEnterQntty;
	Button btnSubmit;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_screen);
		
		/**
		 * Initialization of variables
		 * Finding them by their id
		 */
		
		etEnterQntty = (EditText)findViewById(R.id.etMainEnterQntty);
		btnSubmit = (Button)findViewById(R.id.btnMainSubmit);
		
		/**
		 * Adding an onClickListener to the button
		 */
		btnSubmit.setOnClickListener(this);
		
		
	}

	@Override
	public void onClick(View v) {
		/**
		 * switch case
		 */
		switch (v.getId()) {
		case R.id.btnMainSubmit:
			startActivity(new Intent(getApplicationContext(),ConclusionScreenActivity.class));
			break;

		default:
			break;
		}
		
	}
}
