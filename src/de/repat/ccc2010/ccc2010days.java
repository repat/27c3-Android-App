package de.repat.ccc2010;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class ccc2010days extends ListActivity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	 super.onCreate(savedInstanceState);
    	    setContentView(R.layout.days);
    	    setTitle("27c3 - Days");

    }   
    protected void onListItemClick(ListView liste,View view,int position,long id){
        super.onListItemClick(liste, view, position, id);
        
        switch(position)
        {
        case 0:
        	Intent tag1intent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://events.ccc.de/congress/2010/Fahrplan/day_2010-12-27.en.html"));
        	startActivity(tag1intent);
        break;
        
        case 1:
        	Intent tag2intent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://events.ccc.de/congress/2010/Fahrplan/day_2010-12-28.en.html"));
        	startActivity(tag2intent);
        break;
        
        case 2:
        	Intent tag3intent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://events.ccc.de/congress/2010/Fahrplan/day_2010-12-29.en.html"));
        	startActivity(tag3intent);
        break;
        
        case 3:
        	Intent tag4intent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://events.ccc.de/congress/2010/Fahrplan/day_2010-12-30.en.html"));
        	startActivity(tag4intent);
        break;
        }
    }
}