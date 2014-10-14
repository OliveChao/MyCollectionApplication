package com.example.mycollection;

/**
 * @author olive chao
 * @date 5th, October 2014
 * Register Page Activity
 *   1.)The user should be able to input their details
 *   2.)Validate that fields are not empty and the password is same as confirm password
 *   3.)Then the details get stored in shared preferences
 *   4.)User directed to homePage on successful registration
 */


import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;

public class RegisterActivity extends ActionBarActivity implements OnClickListener, OnCheckedChangeListener {
	
	/**
	 *Declaration of variables
	 *  a.)EditTexts firstName, lastName, emailAddress, userName, Password and confirmPassword
	 *  b.)CheckBox for terms and conditions
	 *  c.)Button Register 
	 */
	EditText etFirstName, etLastName, etEmailAddress, etUserName, etPassword, etConfirmPassword;
	String strFirstName, strLastName, strEmailAddress, strUserName, strPassword, strConfirmPassword;
	CheckBox chkBoxTermsConditions;
	Button btnRegister;

	//shared preferences
		public static final String PREFS_NAME="myPrefs"; 
		public static final String KEY_FIRSTNAME="firstName";
		public static final String KEY_LASTNAME="lastName";
		public static final String KEY_EMAIL="email";
		public static final String KEY_USERNAME="userName";
		public static final String KEY_PASSWORD="password";
		
		SharedPreferences sharedPreferences;
		Editor editor;

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.register);

		/**
		 * Initialization of variables
		 * Finding variables by their id
		 */
		//EditTexts
		etFirstName = (EditText)findViewById(R.id.etRegisterFirstName);
		etLastName = (EditText)findViewById(R.id.etRegisterLastName);
		etEmailAddress = (EditText)findViewById(R.id.etRegisterEmailAddress);
		etUserName = (EditText)findViewById(R.id.etRegisterUserName);
		etPassword = (EditText)findViewById(R.id.etRegisterPassword);
		etConfirmPassword = (EditText)findViewById(R.id.etRegisterConfirmPassword);
		
		//CheckBox
		chkBoxTermsConditions = (CheckBox)findViewById(R.id.chkBoxTermsConditions);
		//Setting an onCheckedChangeListener for the checkBox
		chkBoxTermsConditions.setOnCheckedChangeListener(this);
		
		//Button
		btnRegister = (Button)findViewById(R.id.btnRegister);
		//Setting an onClickListener to the button
		btnRegister.setOnClickListener(this);
		
		//EditText getText and converted to string
		etConfirmPassword.getText().toString();
		
		//Call the getSharedPreferences()method
		//creates the shared preference method of storage 
		sharedPreferences = getSharedPreferences(PREFS_NAME, 0);
		
		//editor to get data
		editor = sharedPreferences.edit();
		
	}

	@Override
	public void onClick(View v) {
		/**
		 * switch case for the variables
		 *  a.)checkBox one has to check it so as to be able to register
		 *  b.)validation of inputs 
		 *      i.)first name
		 *      ii.)last name
		 *      iii.)email address
		 *      iv.)user name
		 *      v.)password
		 *      vi.)confirmation password
		 *  c.)button register navigates to Home Activity after validation process
		 */
		switch (v.getId()) {
		case R.id.btnRegister:
			//checks if fields are all empty and prompts user to fill them
			//store inputs in shared preference
			
			
			//commit changes
			editor.commit();
			
			if (etFirstName.getText().toString().equals("")
					&&etLastName.equals("")
					&&etEmailAddress.equals("")
					&&etUserName.equals("")
					&&etPassword.equals("")
					&&etConfirmPassword.equals("")) {
				Toast.makeText(getApplicationContext(), "Fields empty", Toast.LENGTH_LONG).show();
			}
			//checks if first name is empty and prompts user to fill it
			else if (etFirstName.equals("")) {
				Toast.makeText(getApplicationContext(), "First Name empty", Toast.LENGTH_LONG).show();
			}
			//checks if last name is empty and prompts user to fill it
			else if (etLastName.equals("")) {
				Toast.makeText(getApplicationContext(), "Last Name empty", Toast.LENGTH_LONG).show();
			}
			//checks if email address is empty and prompts user to fill it
			else if (etEmailAddress.equals("")) {
				Toast.makeText(getApplicationContext(), "Email Address empty", Toast.LENGTH_LONG).show();
			}
			//checks if user name is empty and prompts user to fill it
			else if (etUserName.equals("")) {
				Toast.makeText(getApplicationContext(), "User Name empty", Toast.LENGTH_LONG).show();
			}
			//checks if password is empty and prompts user to fill it
			else if (etPassword.equals("")) {
				Toast.makeText(getApplicationContext(), "Password empty", Toast.LENGTH_LONG).show();
			}
			//checks if confirm password is empty and prompts user to fill it
			else if (etConfirmPassword.equals("")) {
				Toast.makeText(getApplicationContext(), "Confirm Password empty", Toast.LENGTH_LONG).show();
			}
			//checks if the content of confirm password is equal to the password if not prompts user to correct it
			//else if (!etConfirmPassword.equals(sharedPreferences.getString(KEY_PASSWORD, null))) {
				//Toast.makeText(getApplicationContext(), "Wrong Password", Toast.LENGTH_LONG).show();
			//}
			else if(!etFirstName.equals("")
					&&etLastName.equals("")
					&&etEmailAddress.equals("")
					&&etUserName.equals("")
					&&etPassword.equals("")
					&&etConfirmPassword.equals("")){
				
				//after validation process user can navigate to home activity at the click of register button
				startActivity(new Intent(getApplicationContext(),HomeActivity.class));
				Toast.makeText(getApplicationContext(), "Welcome to the HomeScreen", Toast.LENGTH_LONG).show();
			}
			
			break;

		default:
			break;
		}
		
	}

	@Override
	public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
		// TODO Auto-generated method stub
		Toast.makeText(getApplicationContext(), String.valueOf(isChecked), Toast.LENGTH_LONG).show();
		
	}

}
