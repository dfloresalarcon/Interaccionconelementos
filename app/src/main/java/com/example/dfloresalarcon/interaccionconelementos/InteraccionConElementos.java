package com.example.dfloresalarcon.interaccionconelementos;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.EmptyStackException;


public class InteraccionConElementos extends Activity {

    String trato="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interaccion_con_elementos);



        final Button hola = (Button)findViewById(R.id.hello);

        hola.setOnClickListener(new View.OnClickListener() {
        RadioGroup radio = (RadioGroup) findViewById(R.id.RadioGroup01);

            @Override
            public void onClick(View v) {
                if (R.id.rdsr == radio.getCheckedRadioButtonId()) {//RECOGE EL VALOR DE ID QUE ESTA CHECKEADO EN EL RADIOBUTTON
                    trato = getResources().getString(R.string.ssr);
                }else{
                    trato = getResources().getString(R.string.ssra);
                }

                TextView saludoFinal = (TextView)findViewById(R.id.salida);
                EditText entrada = (EditText)findViewById(R.id.txtNombre);

                saludoFinal.setText(hola.getText()+" "+trato+" "+entrada.getText());
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.interaccion_con_elementos, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
