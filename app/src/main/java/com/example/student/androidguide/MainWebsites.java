package com.example.student.androidguide;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

/**
 * Created by student on 2/11/15.
 */
public class MainWebsites extends MainActivity {

    @Override
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_websites);
        String[] websites = {getString(R.string.link1), getString(R.string.link2), getString(R.string.link3), getString(R.string.link4), getString(R.string.link5), getString(R.string.link6), getString(R.string.link7), getString(R.string.link8), getString(R.string.link9), getString(R.string.link10), getString(R.string.link11), getString(R.string.link12)};
        ListAdapter webAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, websites);
        ListView webListView = (ListView) findViewById(R.id.listView);
        webListView.setAdapter(webAdapter);

        webListView.setOnItemClickListener(
              new AdapterView.OnItemClickListener() {
                  @Override
                  public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                      String webLink = String.valueOf(parent.getItemAtPosition(position));
                      Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
                      myWebLink.setData(Uri.parse(webLink));
                      startActivity(myWebLink);
                  }
              }

        );

        }

    /*
    @Override
    protected void onListItemClick(ListView l, View view, int position, long id) {
        super.onListItemClick(l, view, position, id);



    }
    */


}