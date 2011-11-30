package com.taxiride;

import android.app.Activity;
import android.app.ListActivity;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.view.View;
import android.content.Intent;



public class CabDirectory extends ListActivity{
	 
	 final private static String[] FRUITS = { "Yellow Cab", "Luxor Cab","United Cab","DeSoto Cab" };
	
	public void onCreate(Bundle savedInstanceState) {
		 super.onCreate(savedInstanceState);
		setContentView(R.layout.cabdirectory);
		setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, FRUITS));
		
	}
	
	protected void onListItemClick(ListView l, View v, int position, long id) {
		 // TODO Auto-generated method stub
		 //super.onListItemClick(l, v, position, id);
		 String selection = l.getItemAtPosition(position).toString();
		 if (selection == "Yellow Cab"){
			 Intent dialIntent = new Intent(Intent.ACTION_DIAL, Uri
                     .parse("tel:4153333333"));
             startActivity(dialIntent);
		 }
		 if(selection == "Luxor Cab"){
			 Intent dialIntent = new Intent(Intent.ACTION_DIAL, Uri
                     .parse("tel:4152824141"));
             startActivity(dialIntent); 
			 
		 }if(selection == "United Cab"){
			 Intent dialIntent = new Intent(Intent.ACTION_DIAL, Uri
                     .parse("tel:4153869700"));
             startActivity(dialIntent); 
		 }if(selection == "DeSoto Cab"){
			 Intent dialIntent = new Intent(Intent.ACTION_DIAL, Uri
                     .parse("tel:4159701300"));
             startActivity(dialIntent); 
		 }
			 
		 
		}
	

}
