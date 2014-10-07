package com.example.mycollection;

/**
 * @author olive chao
 * @date 5th, October 2014
 * Register Page Activity
 */

import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;
import android.os.Bundle;

public class RegisterActivity extends ActionBarActivity implements OnClickListener {
	
	/**
	 *Declaration of variables
	 *  a.)EditTexts firstName, lastName, emailAddress, userName, Password and confirmPassword
	 *  b.)CheckBox for terms and conditions
	 *  c.)Button Register 
	 */
	EditText etFirstName, etLastName, etEmailAddress, etUserName, etPassword, etConfirmPassword;
	CheckBox chkBoxTermsConditions;
	Button btnRegister;

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
		
		//Button
		btnRegister = (Button)findViewById(R.id.btnRegister);
		
		/**
		 * Setting an onClickListener to the button
		 */
		btnRegister.setOnClickListener(this);
		
		//EditText getText and converted to string
		etFirstName.getText().toString();
		etLastName.getText().toString();
		etEmailAddress.getText().toString();
		etUserName.getText().toString();
		etPassword.getText().toString();
		etConfirmPassword.getText().toString();
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
			if (etFirstName.equals("")
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
			else if (!etConfirmPassword.equals(etPassword)) {
				Toast.makeText(getApplicationContext(), "Wrong Password", Toast.LENGTH_LONG).show();
			}
			//after validation process user can navigate to home activity at the click of register button
			startActivity(new Intent(getApplicationContext(),HomeActivity.class));
			break;

		default:
			break;
		}
		
	}

}
