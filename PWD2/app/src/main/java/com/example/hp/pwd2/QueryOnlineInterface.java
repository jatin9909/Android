package com.example.hp.pwd2;

import android.content.Intent;
import android.util.Log;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

/**
 * Created by hp on 25/3/18.
 */

class QueryOnlineInterface {
    public static String process(String URL, String entity, ArrayList<NameValuePair> postContent, String authorizationKey){
        HttpEntity httpEntity;

        DefaultHttpClient client= new DefaultHttpClient();
        Log.e("Enter",URL);
        Log.e("Enter", String.valueOf(client==null));
        Log.e("Enter", ""+postContent.get(1));
        Log.e("Enter", ""+postContent.get(2));
        //Log.e("Enter", ""+postContent.get(3));
        HttpPost post=new HttpPost(URL);
        Log.e("Enter", String.valueOf(post==null));
        if(postContent!=null)
            try {
                post.setEntity(new UrlEncodedFormEntity(postContent));
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        HttpResponse response=null;
        String json=null;

        try {
            response = client.execute(post);

        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
        if(response!=null) {
             httpEntity = response.getEntity();
            json= EntityUtils.toString(httpEntity);
        }
            else {
            Log.e("Enter","Response is null");
        }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return json;


    }

}
