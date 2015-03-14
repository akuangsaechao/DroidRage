package droidrage.yarddog;

<<<<<<< HEAD

=======
import android.content.Context;
import android.content.Intent;
>>>>>>> josh
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;



public class Home extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
<<<<<<< HEAD
=======
        Intent intent = getIntent();

        this.addListenerOnButtonOpenYard();
        this.addListenerOnButtonProfile();
        this.addListenerOnButtonFilters();
>>>>>>> josh
    }

    public void addListenerOnButtonOpenYard() {

        Button button;
        final Context context = this;
        button = (Button) findViewById(R.id.openYard);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, Yard.class);
                startActivity(intent);
            }
        });
    }

    public void addListenerOnButtonProfile() {

        Button button;
        final Context context = this;
        button = (Button) findViewById(R.id.findAYardButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, FindYard.class);
                startActivity(intent);
            }
        });
    }

    public void addListenerOnButtonFilters() {

        Button button;
        final Context context = this;
        button = (Button) findViewById(R.id.profileButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, Profile.class);
                startActivity(intent);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home, menu);
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
