package com.example.mycollection;

/**
 * @author olive chao
 * @date 4th October,2014
 * Login Page Activity
 */

<<<<<<< HEAD
import java.util.HashMap;

import constants.Constants;
import constants.SessionManager;
=======
>>>>>>> b07c3dfb81d38c8c5dde0729230fd91c02651368
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
<<<<<<< HEAD
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
=======
>>>>>>> b07c3dfb81d38c8c5dde0729230fd91c02651368
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;
import android.os.Bundle;

<<<<<<< HEAD
public class LoginActivity extends ActionBarActivity implements OnClickListener, OnCheckedChangeListener {
=======
public class LoginActivity extends ActionBarActivity implements OnClickListener {
>>>>>>> b07c3dfb81d38c8c5dde0729230fd91c02651368
	
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
<<<<<<< HEAD
	
	//common
	Constants commonCode;
	SessionManager session;
=======
>>>>>>> b07c3dfb81d38c8c5dde0729230fd91c02651368

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
<<<<<<< HEAD
		//A setOnCheckedChangeListener for the checkBox
		checkBoxRemMe.setOnCheckedChangeListener(this);
=======
>>>>>>> b07c3dfb81d38c8c5dde0729230fd91c02651368
		
		//TextViews
		tvForgotPassword = (TextView)findViewById(R.id.tvLoginForgotPassword);
		tvRegister = (TextView)findViewById(R.id.tvLoginRegister);
		
		//Button
		btnLogin = (Button)findViewById(R.id.btnLogin);
<<<<<<< HEAD
		//setting an onClickListener on the button
		btnLogin.setOnClickListener(this);
		
		/**
		 * Setting an onClickListener to TextViews 
		 *  a.)ForgotPassword 
		 *  b.)Register
		 */
		tvForgotPassword.setOnClickListener(this);
		tvRegister.setOnClickListener(this);
		
		//call constants
		commonCode = new Constants();
		
		//call the sessionManager class
	    session = new SessionManager(getApplicationContext());
=======
		
		/**
		 * Setting an onClickListener for the various variables
		 *  a.)TextViews forgotPassword and Register
		 *  b.)Button Login
		 */
		tvForgotPassword.setOnClickListener(this);
		tvRegister.setOnClickListener(this);
		btnLogin.setOnClickListener(this);

		//A setOnCheckedChangeListener for the checkBox
>>>>>>> b07c3dfb81d38c8c5dde0729230fd91c02651368
	}

	@Override
	public void onClick(View v) {
		/**
		 * Switch case statement
<<<<<<< HEAD
		 *  a.)ForgetPassword text view should navigate to Reset Password Activity
		 *  b.)register text view should navigate to Register Activity
		 *  c.)ButtonLogin should navigate to Home Activity
=======
		 *  a.)CheckBox should retain user name and password details
		 *  b.)ForgetPassword text view should navigate to Reset Password Activity
		 *  c.)register text view should navigate to Register Activity
		 *  d.)ButtonLogin should navigate to Home Activity
>>>>>>> b07c3dfb81d38c8c5dde0729230fd91c02651368
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
<<<<<<< HEAD
	    	//get details from session manager
	    	HashMap<String, String> details = session.getUserDetails();
	    	String strUserName = details.get(Constants.KEY_HASHMAP_USERNAME);
	    	String strPassword = details.get(Constants.KEY_HASHMAP_PASSWORD);
	    	
	    	//checks if both user name and password are empty and prompts user to fill them in
	    	if (etUserName.getText().toString().equals("")
	    			&&etPassword.getText().toString().equals("")) {
				Toast.makeText(getApplicationContext(), "UserName and Password empty", Toast.LENGTH_LONG).show();
			}
	    	//checks if user name is empty and prompts user to fill it
	    	else if (etUserName.getText().toString().equals("")) {
				Toast.makeText(getApplicationContext(), "User Name empty", Toast.LENGTH_LONG).show();
			}
	    	//checks if password is empty and prompts user to fill it
	    	else if (etPassword.getText().toString().equals("")) {
				Toast.makeText(getApplicationContext(), "Password empty", Toast.LENGTH_LONG).show();
			}
	    	else if (!etUserName.getText().toString().equals(session.getUserDetails())){
	    		Toast.makeText(getApplicationContext(), "User Name incorrect", Toast.LENGTH_LONG).show();
	    	}
	    	else if (!etPassword.getText().toString().equals(session.getUserDetails())){
	    		Toast.makeText(getApplicationContext(), "Password incorrect", Toast.LENGTH_LONG).show();
	    	}
	    	else if (etUserName.getText().toString().equals(strUserName)
				       &&etPassword.getText().toString().equals(strPassword)){
	    		//after validation user can navigate to home activity on clicking login button
		    	startActivity(new Intent(getApplicationContext(),HomeActivity.class));
		    	Toast.makeText(getApplicationContext(), "Welcome to the Home Page", Toast.LENGTH_LONG).show();
			}
=======
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
>>>>>>> b07c3dfb81d38c8c5dde0729230fd91c02651368
	    	break;

		default:
			break;
		}
	}

<<<<<<< HEAD
	@Override
	public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
		/**
		 * CheckBox should retain user name and password details
		 * If not checked it should delete/clear the fields(EditTexts userName and password)
		 * Or create a boolean method
		 */
		Toast.makeText(getApplicationContext(), String.valueOf(isChecked), Toast.LENGTH_LONG).show();
		
	}
}

=======
}
>>>>>>> b07c3dfb81d38c8c5dde0729230fd91c02651368
