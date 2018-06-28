package com.example.administrator.listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import org.w3c.dom.Text;

public class YAYAYAActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_yayaya );
        Bundle bundle =getIntent().getExtras();
        String item = bundle.getString( "item" );
        TextView itme_View =findViewById( R.id.itme_View );
        itme_View.setText( item );

        ImageButton imageButton = findViewById( R.id.imageButton );
        imageButton.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(  );
                i.setClass( YAYAYAActivity.this,MainActivity.class );
                startActivity( i );

            }
        } );

    }
}
