package com.example.mygarden_v3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;


public class MainActivity extends AppCompatActivity {

    FirebaseAuth mAuth;
    FirebaseUser currentUser ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAuth = FirebaseAuth.getInstance();
        currentUser = mAuth.getCurrentUser();

//        userData();
    }

    public void userData() {
//        TextView userName = findViewById(R.id.userName);
//        TextView userEmail = findViewById(R.id.userEmail);
//
//        userName.setText(currentUser.getDisplayName());
//        userEmail.setText(currentUser.getEmail());
    }

    public void logout(View view) {
        FirebaseAuth.getInstance().signOut();
        Intent intent = new Intent(getApplicationContext(), com.example.mygarden_v3.EmailAndPasswordLoginActivity.class);
        startActivity(intent);
        finish();
    }

    public void monitorar(View v){setContentView(R.layout.activity_monitorar);}

    public void cadastrarEndereco(View v){setContentView(R.layout.activity_cadastro_endereco);}

    public void selecionarRegiao(View v){setContentView(R.layout.activity_maps);}

}