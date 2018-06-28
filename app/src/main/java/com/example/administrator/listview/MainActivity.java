package com.example.administrator.listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        String[] itmes= {"青蘋果","夏木","露西","初音","洛天衣","夏洛特"};
        ArrayAdapter<String> listAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,itmes);
        ListView metdou_list = findViewById( R.id.list_mudou );
        metdou_list.setAdapter( listAdapter );
        metdou_list.setOnItemClickListener( new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item = ((TextView)view).getText().toString();
                //Toast.makeText(getBaseContext(),"你選擇了"+item,Toast.LENGTH_SHORT).show();
                //Toast.makeText( MainActivity.this,"您選擇了"+item,Toast.LENGTH_SHORT).show();
                Intent i=new Intent(  );
                i.setClass(MainActivity.this,YAYAYAActivity.class);
                Bundle bundle = new Bundle(  );
                bundle.putString( "item" , item );
                i.putExtras( bundle );

                startActivity( i );
            }
        } );
    }
}
