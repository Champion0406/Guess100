package mid.com.guess100;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText secrett = (EditText) findViewById((R.id.secret));
        EditText info = (EditText) findViewById((R.id.info));
        EditText ednumber = (EditText) findViewById((R.id.number));
Button send = (Button) findViewById((R.id.send));

    }
    public void findviews(View view){

    }
}
