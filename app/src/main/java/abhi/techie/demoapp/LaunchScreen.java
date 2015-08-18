package abhi.techie.demoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LaunchScreen extends AppCompatActivity {

    boolean serviceStatus = false;
    TextView status;
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch_screen);
        status =  (TextView)findViewById(R.id.status);
        btn=  (Button)findViewById(R.id.btn);
        setDefaultView();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_launch_screen, menu);
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


     public void setDefaultView(){

         status.setText("Service is not Running..");

         btn.setText("Start Service");
     }

    public void manageService(View view){


        String usage = "usage : "+ CpuUsage.readUsage();
        Log.d("info",usage);
        serviceStatus = true;
        status.setText("Service is Running..");
        btn.setText("Stop Service");
    }




}
