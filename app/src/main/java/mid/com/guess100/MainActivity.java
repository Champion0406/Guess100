package mid.com.guess100;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    Random r = new Random();
    int i = r.nextInt(100) + 1;
    int min = 1;
    int max = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void test(View view) {
        EditText ednumber = (EditText) findViewById(R.id.number);
        int n = Integer.parseInt(ednumber.getText().toString());
        if (i == n) {
            new AlertDialog.Builder(this)
                    .setMessage("答對了")
                    .setPositiveButton("ok", null)
                    .show();
        }
        if (i > n) {
            min = n;
            Toast.makeText(this, min + "to" + max, Toast.LENGTH_LONG).show();
        }
        if (i < n) {
            max = n;
            Toast.makeText(this,  min + "to" + max, Toast.LENGTH_LONG).show();

        }
    }
}
