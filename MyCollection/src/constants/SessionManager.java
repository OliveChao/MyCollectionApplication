package constants;

import java.util.HashMap;

import com.example.mycollection.HomeActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public class SessionManager {
	
	SharedPreferences sharedPreferences;
	Editor editor;
	Context _context; 
	
	
	/**
	 * Shared preferences enable you to save and retrieve data in the form of key and value.
	 * call the getSharedPrefrence()method which returns a SharedPreference instance pointing to
	 * the file containing the values of preferences
	 * In our case the preferences are in the class Constants.
	 * 
	 * We will use a constructor to do this as we want to access context from the register and login
	 * pages dependent on where it will be instantiated
	 * 
	 * @param context
	 */
	
	public SessionManager(Context context){
		this._context = context;
		sharedPreferences = _context.getSharedPreferences(Constants.PREFS_NAME, 0);
		editor = sharedPreferences.edit();
		
		editor.commit();
	}
	
	/**
	 * 
	 * @param firstName
	 * @param lastName
	 * @param email
	 * @param userName
	 * @param password
	 */
	public void createUserDetails(String firstName, String lastName, String email, String userName, String password){
		//stores data
		editor.putString(Constants.KEY_FIRSTNAME, firstName);
		editor.putString(Constants.KEY_LASTNAME, lastName);
		editor.putString(Constants.KEY_EMAIL, email);
		editor.putString(Constants.KEY_USERNAME, userName);
		editor.putString(Constants.KEY_PASSWORD, password);
		
		//commit changes
		editor.commit();
	}
	
	/**
	 * This gets the user details stored in the shared preferences
	 * @return
	 */
	public HashMap<String, String> getUserDetails(){
		//get data
		HashMap<String, String> user = new HashMap<String, String>();
		user.put(Constants.KEY_HASHMAP_FIRSTNAME,sharedPreferences.getString(Constants.KEY_FIRSTNAME, null));
		user.put(Constants.KEY_HASHMAP_LASTNAME, sharedPreferences.getString(Constants.KEY_LASTNAME,null));
		user.put(Constants.KEY_HASHMAP_EMAIL, sharedPreferences.getString(Constants.KEY_EMAIL,null));
		user.put(Constants.KEY_HASHMAP_USERNAME, sharedPreferences.getString(Constants.KEY_USERNAME, null));
		user.put(Constants.KEY_HASHMAP_PASSWORD, sharedPreferences.getString(Constants.KEY_PASSWORD,null));
		
		return user;
	}
	
	/**
	 * Checks if user is logged in and keeps them logged in
	 * @return
	 */
	public Boolean LogedIn() {
		return sharedPreferences.getBoolean(Constants.State, false);
	}
	
	/**
	 * Checks if user is logged out and redirects to home page
	 */
	public void LogedOut() {
		editor.clear();
		editor.commit();
		
		//redirect user to home page
		_context.startActivity(new Intent(_context,HomeActivity.class));
	}
		
	}

