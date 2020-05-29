package com.example.friendjson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class FriendJsonParser {

   // List<Flower>flowerList;

    public static List<Friend>parseJson(InputStream input){
      String content=Utils.convertInputStrimToString(input);

      return parseJson(content);
    }




public static List<Friend>parseJson(String jsonString){

    List<Friend>   friend=new ArrayList<>();

    try {
        JSONArray json=new JSONArray(jsonString);
        for(int i=0;i<json.length();i++){

            JSONObject jsonObject=json.getJSONObject(i);
            Friend friends=new Friend();

            friends.setName        (jsonObject.getString("firstName"));
            friends.setLastname    (jsonObject.getString("lastName" ));


            friend.add(friends);
        }


    } catch (JSONException e) {
        e.printStackTrace();
    }

    return  friend;
}
}
