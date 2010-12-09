//Written by repat, Nov 2010, http://repat.de
package de.repat.ccc2010;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

public class ccc2010main extends TabActivity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	 super.onCreate(savedInstanceState);
    	    setContentView(R.layout.main);

    	    TabHost mTabHost = getTabHost();
    	    
    	    mTabHost.addTab(mTabHost.newTabSpec("tab_days").setIndicator("Days").setContent(new Intent(this, ccc2010days.class)));
    	    mTabHost.addTab(mTabHost.newTabSpec("tab_events").setIndicator("Events").setContent(new Intent(this, ccc2010events.class)));
    	    mTabHost.addTab(mTabHost.newTabSpec("tab_speaker").setIndicator("Speakers").setContent(new Intent(this, ccc2010speakers.class)));
    	    
    	    mTabHost.setCurrentTab(0);
    }   
}