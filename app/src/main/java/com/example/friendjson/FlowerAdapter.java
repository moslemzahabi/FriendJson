package com.example.friendjson;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class FlowerAdapter {
  //      extends ArrayAdapter<Flower>

//
//    private final Context context;
//    private List<Flower>flowerList;
//
//
//    public FlowerAdapter(Context context, List<Flower> flowerList) {
//        super(context, R.layout.flower_list_item,flowerList);//باید اول باشد
//        this.context=context;
//        this.flowerList=flowerList;
//    }
//
// @NonNull
//    @Override
//    public View getView(int position,  View convertView, ViewGroup parent) {
//     ViewHolder viewholder;
//     if (convertView==null){
//convertView= LayoutInflater.from(context).inflate(R.layout.flower_list_item,parent,false);
//    viewholder =new ViewHolder(convertView);
//    convertView.setTag(viewholder);
//     }
//     else {
//         viewholder = (ViewHolder) convertView.getTag();
//     }
//     viewholder.fill(position);
//     return  convertView;
//    }
//
//    public class  ViewHolder{
//        ImageView flower_image;
//        TextView flower_name,flower_category,flower_price;
//        public ViewHolder(View view){
//flower_image=view.findViewById(R.id.flower_image);
//            flower_name=view.findViewById(R.id.flower_name);
//            flower_category=view.findViewById(R.id.flower_category);
//            flower_price=view.findViewById(R.id.flower_price);
//
//
//        }
//
//public  void  fill(int position){
//            Flower flower =flowerList.get(position);
//
//            flower_name.setText(flower.getName());
//            flower_price.setText(flower.getPrice()+"$");
//            flower_category.setText(flower.getCategory());
////load photo
//    String photoName=flower.getPhoto();
//    if (photoName.contains(".")){
//        photoName=photoName.substring(0,photoName.lastIndexOf('.'));
//    }
//int imageResId=context.getResources().getIdentifier(photoName,"drawable",context.getApplicationContext().getPackageName());
//flower_image.setImageResource(imageResId);
//
//        }
//
//    }
//
//
//
//
//
//
//
//
//
//    //..............................................................................................
}
