package de.repat.ccc2010;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class ccc2010events extends ListActivity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	 super.onCreate(savedInstanceState);
    	    setContentView(R.layout.events);
    }   
    protected void onListItemClick(ListView liste,View view,int position,long id){
        super.onListItemClick(liste, view, position, id);
        
        switch(position)
        {
        case 0:
        	Intent communityintent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://events.ccc.de/congress/2010/Fahrplan/track/Community/index.en.html"));
        	startActivity(communityintent);
        break;
        
        case 1:
        	Intent cultureintent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://events.ccc.de/congress/2010/Fahrplan/track/Culture/index.en.html"));
        	startActivity(cultureintent);
        break;
        
        case 2:
        	Intent hackingintent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://events.ccc.de/congress/2010/Fahrplan/track/Hacking/index.en.html"));
        	startActivity(hackingintent);
        break;
        
        case 3:
        	Intent makeintent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://events.ccc.de/congress/2010/Fahrplan/track/Make/index.en.html"));
        	startActivity(makeintent);
        break;
        
        case 4:
        	Intent scienceintent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://events.ccc.de/congress/2010/Fahrplan/track/Science/index.en.html"));
        	startActivity(scienceintent);
        break;
        
        case 5:
        	Intent societyintent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://events.ccc.de/congress/2010/Fahrplan/track/Society/index.en.html"));
        	startActivity(societyintent);
        break;
        
        }
    }
}