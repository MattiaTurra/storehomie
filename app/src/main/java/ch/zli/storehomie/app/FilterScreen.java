package ch.zli.storehomie.app;

import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class FilterScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter_screen);
    }

    public void onSuggestionClick (View view)
    {
        TextView i = (TextView)findViewById(view.getId());
        EditText t = (EditText)findViewById(R.id.SearchTextbox);
        t.setText(i.getText());
    }

    public void openFilter(View v)
    {
        Intent intent = new Intent(getApplicationContext(), MapScreen.class);
        startActivity(intent);
    }

}
