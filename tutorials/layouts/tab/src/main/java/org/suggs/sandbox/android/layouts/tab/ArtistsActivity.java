package org.suggs.sandbox.android.layouts.tab;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class ArtistsActivity extends Activity {

    @Override
    public void onCreate( Bundle savedInstanceState ) {
        super.onCreate( savedInstanceState );

        TextView textView = new TextView( this );
        textView.setText( "This is the artists tab" );
        setContentView( textView );
    }
}
