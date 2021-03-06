package es.jab.noteandreminderandroid.activity;

import es.jab.noteandreminderandroid.R;
import es.jab.noteandreminderandroid.presenter.UserPresenter;
import android.os.Bundle;
import android.widget.EditText;


public class UserActivity extends GenericConnectionActivity {
	
	public static final int USER_ACTIVITY = 000;

	public static final String METHOD = "User/";
	
	private UserPresenter userPresenter;
	
	private EditText nameEditView;
	private EditText surnameEditView;
	private EditText emailEditView;
	private EditText passwordEditView;
	
	public EditText getNameEditView(){
		return nameEditView;
	}
	
	public EditText getSurnameEditView(){
		return surnameEditView;
	}
	
	public EditText getEmailEditText(){ 
		return emailEditView;
	}
	
	public EditText getPasswordEditView(){
		return passwordEditView;
	}
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_user);
				
		userPresenter = new UserPresenter(this);
		
		nameEditView = (EditText) findViewById(R.id.NameInputUser);
		surnameEditView = (EditText) findViewById(R.id.SurnameInputUser);
		emailEditView = (EditText) findViewById(R.id.EmailInputUser);
		passwordEditView = (EditText) findViewById(R.id.PasswordInputUser);
		
		nameEditView.setText("");
		surnameEditView.setText("");	
		emailEditView.setText("");	
		passwordEditView.setText("");	

		
		userPresenter.onCreate();
	}

	@Override
	public void closeConnection(boolean error, String json) {
		userPresenter.closeConnection(error, json);
	}
	
	@Override
	public void onBackPressed(){
		super.onBackPressed();
	}
	
	@Override
	public void onResume(){
		super.onResume();
	}

}
