package com.example.mycollection;

/**
 * @author olive chao
 * @date 4th October,2014
 * Login Page Activity
 */

import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;
import android.os.Bundle;

public class LoginActivity extends ActionBarActivity implements OnClickListener {
	
	/**
	 * Declaration of variables
	 * Variables Login page has include
	 *   a.)EditTexts user name and password
	 *   b.)CheckBox for remember me
	 *   c.)TextViews that are clickable to perform an action forget password and register
	 *   d.)Button login
	 */
	EditText etUserName, etPassword;
	CheckBox checkBoxRemMe;
	TextView tvForgotPassword, tvRegister;
	Button btnLogin;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login);
		
		/**
		 * Initialization of variables
		 * Finding variables by their id
		 */
		//EditTexts
		etUserName = (EditText)findViewById(R.id.etLoginUserName);
		etPassword = (EditText)findViewById(R.id.etLoginPassword);
		
		//CheckBox
		checkBoxRemMe = (CheckBox)findViewById(R.id.chBoxLoginRememberMe);
		
		//TextViews
		tvForgotPassword = (TextView)findViewById(R.id.tvLoginForgotPassword);
		tvRegister = (TextView)findViewById(R.id.tvLoginRegister);
		
		//Button
		btnLogin = (Button)findViewById(R.id.btnLogin);
		
		/**
		 * Setting an onClickListener for the various variables
		 *  a.)TextViews forgotPassword and Register
		 *  b.)Button Login
		 */
		tvForgotPassword.setOnClickListener(this);
		tvRegister.setOnClickListener(this);
		btnLogin.setOnClickListener(this);

		//A setOnCheckedChangeListener for the checkBox
	}

	@Override
	public void onClick(View v) {
		/**
		 * Switch case statement
		 *  a.)CheckBox should retain user name and password details
		 *  b.)ForgetPassword text view should navigate to Reset Password Activity
		 *  c.)register text view should navigate to Register Activity
		 *  d.)ButtonLogin should navigate to Home Activity
		 *      -validation of users details before they can login
		 *      -check if fields are empty and prompt user to fill them in
		 *      -check if the user name and password are correct match
		 */
		switch (v.getId()) {
		case R.id.tvLoginForgotPassword:
	    	startActivity(new Intent(getApplicationContext(),PasswordResetActivity.class));
	    	break;
	    	
	    case R.id.tvLoginRegister:
	    	startActivity(new Intent(getApplicationContext(),RegisterActivity.class));
	    	break;
	    	
	    case R.id.btnLogin:
	    	//checks if both user name and password are empty and prompts user to fill them in
	    	if (etUserName.equals("")
	    			&&etPassword.equals("")) {
				Toast.makeText(getApplicationContext(), "UserName and Password empty", Toast.LENGTH_LONG).show();
			}
	    	//checks if user name is empty and prompts user to fill it
	    	else if (etUserName.equals("")) {
				Toast.makeText(getApplicationContext(), "User Name empty", Toast.LENGTH_LONG).show();
			}
	    	//checks if password is empty and prompts user to fill it
	    	else if (etPassword.equals("")) {
				Toast.makeText(getApplicationContext(), "Password empty", Toast.LENGTH_LONG).show();
			}
	    	//after validation user can navigate to home activity on clicking login button
	    	startActivity(new Intent(getApplicationContext(),HomeActivity.class));
	    	break;

		default:
			break;
		}
	}

}
