package com.example.mygarden_v3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class FirstActivity extends AppCompatActivity {

    FirebaseAuth mAuth;
    FirebaseUser currentUser;

//    GoogleSignInOptions gso;
//    GoogleSignInClient gsc;
//    ImageView googleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        mAuth = FirebaseAuth.getInstance();
        currentUser = mAuth.getCurrentUser();

//        googleButton = findViewById(R.id.googleButton);
//
//        gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).requestEmail().build();
//        gsc = GoogleSignIn.getClient(this, gso);
//
//            googleButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                signIn();
//            }
//        });
    }

//    void signIn() {
//        Intent signInIntent = gsc.getSignInIntent();
//        startActivityForResult(signInIntent, 1000);
//    }

//    @Override
//    protected  void  onActivityResult(int requestCode, int resultCode, Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
//        if (requestCode == 1000) {
//            Task<GoogleSignInAccount> task = GoogleSignIn.getSignedInAccountFromIntent(data);
//
//            try {
//                try {
//                    task.getResult(ApiException.class);
//                    navigateToSecondActivity();
//                } catch (ApiException e) {
//                    Toast.makeText(getApplicationContext(), "Algum erro ocorreu!", Toast.LENGTH_SHORT).show();
//                }
//            } finally {
//                Toast.makeText(getApplicationContext(), "Testando!", Toast.LENGTH_SHORT).show();
//            }
//        }
//    }
//    void  navigateToSecondActivity(){
//        finish();
//        Intent intent = new Intent ( getApplicationContext(), MainActivity.class);
//        startActivity(intent);
//    }

    public void gotosigninpage(View view) {
        Intent intent = new Intent(getApplicationContext(), EmailAndPasswordLoginActivity.class);
        startActivity(intent);
    }
}
