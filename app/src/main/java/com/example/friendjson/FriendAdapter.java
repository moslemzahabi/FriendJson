package com.example.friendjson;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import android.widget.TextView;

import java.util.List;

public class FriendAdapter extends ArrayAdapter<Friend> {


    private final Context context;


    private List<Friend>friendList;//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++


    public FriendAdapter(Context context, List<Friend> friendList) {
        super(context, R.layout.flower_list_item,friendList);//+++++++++++++++++++++++++++++++++++++++++++++باید اول باشد
        this.context=context;
        this.friendList=friendList;
    }

 @NonNull
    @Override
    public View getView(int position,  View convertView, ViewGroup parent) {
     ViewHolder viewholder;
     if (convertView==null){
convertView= LayoutInflater.from(context).inflate(R.layout.flower_list_item,parent,false);//+++++++++++++++++++++
    viewholder =new ViewHolder(convertView);
    convertView.setTag(viewholder);
     }
     else {
         viewholder = (ViewHolder) convertView.getTag();
     }
     viewholder.fill(position);
     return  convertView;
    }

    public class  ViewHolder{

        TextView name,lastname;//+++++++++++++++++++++++++++++++++++++++++++++
        public ViewHolder(View view){

            lastname   =view.findViewById(R.id.tv_lastname_id   );
            name    =view.findViewById   (R.id.tv_name_id    );



        }

public  void  fill(int position){
            Friend friend =friendList.get(position);

            name       .setText(friend.getName()     );
            lastname   .setText(friend.getLastname());





        }

    }









    //..............................................................................................
}
