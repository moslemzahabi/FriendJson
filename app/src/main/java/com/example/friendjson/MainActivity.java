package com.example.friendjson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView listView;
     List<Friend> friend;


    private ArrayAdapter<Friend> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



      listView =findViewById(R.id.listview);
      //  friend =new ArrayList<>();


        InputStream input=getResources().openRawResource(R.raw.flowers_json);
        friend=FriendJsonParser .parseJson(input);
        Toast.makeText(MainActivity.this, " json parser return "+friend.size()+" items.", Toast.LENGTH_LONG).show();


       refreshDisplay();



    }






    //.........................................................................................
    public  void  refreshDisplay(){
        if(friend==null){
            friend=new ArrayList<>();
        }
        adapter=new FriendAdapter(this,friend);
        listView.setAdapter(adapter);
    }
}
