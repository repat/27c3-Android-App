package de.repat.ccc2010;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class ccc2010speakers extends ListActivity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	 super.onCreate(savedInstanceState);
    	    setContentView(R.layout.speakers);
    }   
    protected void onListItemClick(ListView liste,View view,int position,long id){
        super.onListItemClick(liste, view, position, id);
        
        switch(position)
        {
        default:
        	Intent speakersintent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://events.ccc.de/congress/2010/Fahrplan/speakers.en.html"));
        	startActivity(speakersintent);
        break;
        }
    }
}