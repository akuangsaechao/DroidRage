package droidrage.yarddog;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class Profile extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        this.addListenerOnButtonProfileYou();
        this.addListenerOnButtonProfileYourYard();
        this.addListenerOnButtonProfileYourDogs();
    }

    public void addListenerOnButtonProfileYou() {

        Button button;
        final Context context = this;
        button = (Button) findViewById(R.id.yourProfile);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, ProfileYou.class);
                startActivity(intent);
            }
        });
    }

    public void addListenerOnButtonProfileYourYard() {

        Button button;
        final Context context = this;
        button = (Button) findViewById(R.id.yourYard);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, ProfileYard.class);
                startActivity(intent);
            }
        });
    }

    public void addListenerOnButtonProfileYourDogs() {

        Button button;
        final Context context = this;
        button = (Button) findViewById(R.id.yourDogs);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, ProfileDog.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_profile, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
