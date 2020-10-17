package com.br.web.view;

import android.app.AlertDialog;
import android.os.Bundle;

import com.br.web.model.Screen;
import com.br.web.model.User;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Main extends AppCompatActivity implements View.OnClickListener {

    private final String TAG = "Main";
    User objUser = new User();
    Screen objScreen = new Screen();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        objUser.setExit((ImageView) (findViewById(R.id.imageViewExit)));
        objUser.setCalculate((ImageView) (findViewById(R.id.imageViewCalculate)));
        objScreen.setViewFinder((EditText)(findViewById(R.id.editTextViewFinder)));
        objScreen.setResult((TextView)(findViewById(R.id.textViewResult)));

        objUser.getExit().setOnClickListener(this);
        objUser.getCalculate().setOnClickListener(this);
    }

    protected void onStart() {
        super.onStart();
        Log.e(TAG, "Ola");
        Toast msg = Toast.makeText(Main.this, "Bem Vindo", Toast.LENGTH_LONG);
        msg.show();
    }

    protected void onDestroy(){
        super.onDestroy();
        Toast msg = Toast.makeText(Main.this, "Você Fechou o App", Toast.LENGTH_LONG);
        msg.show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        switch(id){
            case R.id.menuItemAboutApp:

            AlertDialog.Builder msg = new AlertDialog.Builder(Main.this);
            msg.setMessage("Em Breve");
            msg.show();
            break;

        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {

        if(v == objUser.getExit()){
            finish();
        }else if(v == objUser.getCalculate()){

            int valor, resposta = 1;

            valor = Integer.parseInt(objScreen.getViewFinder().getText().toString());

            /*
            objProgram.setValor(Integer.parseInt(objScreen.getViewFinder().getText().toString()));
            for(int i = 0; objProgram.getValor() >= 1; i --){
                objProgram.setResposta(objProgram.getValor());
            }
            objScreen.getResult().setText(String.valueOf(objProgram.getResposta()));
             */

            for( ; valor >= 1; valor--){
                resposta *= valor;
            }
            objScreen.getResult().setText(String.valueOf(resposta));

            Toast msg = Toast.makeText(Main.this, "Fator", Toast.LENGTH_LONG);
            msg.show();
        }
    }
}