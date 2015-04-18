package com.jeffjanes.funfacts;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class IKITA extends ActionBarActivity {

    public static final String TAG = IKITA.class.getSimpleName();

    private QuoteList mQuoteList = new QuoteList();
    private ColorWheel mColorWheel = new ColorWheel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ikita);

        // Declare our View variables and assign them the Views from the layout file
        final TextView quoteLabel = (TextView) findViewById(R.id.quoteTextView);
        final Button showQuoteButton = (Button) findViewById(R.id.showQuoteButton);
        final RelativeLayout mColorChange = (RelativeLayout) findViewById(R.id.relativeLayout);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fact = mQuoteList.getQuote();
                // Update the label with our dynamic fact
                quoteLabel.setText(fact);

                int color = mColorWheel.getColor();
                mColorChange.setBackgroundColor(color);
                showQuoteButton.setTextColor(color);

            }
        };
        showQuoteButton.setOnClickListener(listener);

        // Toast.makeText(this, "Yay! Our Activity was created!", Toast.LENGTH_LONG).show();

        Log.d(TAG, "We're logging from the OnCreate() method!");
    }
}
