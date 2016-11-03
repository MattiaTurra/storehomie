package ch.zli.storehomie.app;

import android.content.Intent;
import android.net.Uri;
import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.location.places.PlaceLikelihood;
import com.google.android.gms.location.places.PlaceLikelihoodBuffer;
import com.google.android.gms.location.places.Places;
import com.google.android.gms.location.places.ui.PlaceAutocomplete;

public class FilterScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter_screen);
    }

    public void onSuggestionClick (View view)
    {
        TextView SuggestionLabel = (TextView)findViewById(view.getId());
        EditText searchTextbox = (EditText)findViewById(R.id.SearchTextbox);
        //Sets Textbox-Text to Suggestion-Label-Text
        searchTextbox.setText(SuggestionLabel .getText());
    }

    public void findShops(String Name) throws SecurityException {

}


    public void sendRequest(View view)
    {
        EditText searchTextbox = (EditText)findViewById(R.id.SearchTextbox);
        findShops(searchTextbox.getText().toString());

    }




    public void openFilter(View v)
    {
        Intent intent = new Intent(getApplicationContext(), MapScreen.class);
        startActivity(intent);
    }

}
