package com.example.mycollection;

/**
 * @author olive chao
 * Reset Password page stores new password in SQLite database
 */

import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;
import android.os.Bundle;

public class PasswordResetActivity extends ActionBarActivity implements OnClickListener {
	
	//declaration of variables
	EditText etNewPassword, etConfirmNewPassword;
	Button btnResetPassword;
	TextView tvLogin;
	
	public static final int DATABASE_VERSION = 1;
	public static final String DATABASE_NAME = "passwordResetData";
	public static final String DATABASE_CREATE = 
			"CREATE TABLE" + DATABASE_NAME + " ( " +
		    "NEW_PASSWORD" + "TEXT," +
			"CONFIRMED_PASSWORD" + "TEXT);";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.password_reset);
		
		//initialization of variables
		etNewPassword = (EditText)findViewById(R.id.etNewPassword);
		etConfirmNewPassword = (EditText)findViewById(R.id.etConfirmNewPassword);
		
		btnResetPassword = (Button)findViewById(R.id.btnResetPassword);
		//set onClickListener for button
		btnResetPassword.setOnClickListener(this);
		
		tvLogin = (TextView)findViewById(R.id.tvResetPasswordLogin);

		
	}

	@Override
	public void onClick(View v) {
		// switch case statement
		switch (v.getId()) {
		case R.id.btnResetPassword:
			
			break;
			
		case R.id.tvResetPasswordLogin:
			startActivity(new Intent(getApplicationContext(),HomeActivity.class));
			break;

		default:
			break;
		}
		
	}

}
