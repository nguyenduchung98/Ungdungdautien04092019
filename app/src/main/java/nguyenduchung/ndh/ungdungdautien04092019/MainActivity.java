package nguyenduchung.ndh.ungdungdautien04092019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    //Toan cuc: them 'm' trc bien
    //1: khai bao
    TextView mtxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //2: anh xa
        mtxt = findViewById(R.id.textview);
        //3: Viet code
        mtxt.setText("Chào bạn Hằng <3");
    }
}
