package nguyenduchung.ndh.ungdungdautien04092019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //1 :Array: xem, sua
        //Khoi tao.
//        String[] mangTens=new String [5];
//        String[] mangten={"Hoa","Hue","Hong","Hang"};
//        //Chinh sua
//        mangTens[0]="Hoa";
//        mangTens[1]="Hang";
//        mangTens[2]="Hue";
//        mangTens[3]="Lan";
//        mangTens[4]="Linh";
//
//        for (int i=0;i<mangTens.length;i++){
//            // Ctrl + P :Xem tham so truyen vao
//            Log.d("BBB",mangTens[i]);
//        }

        //2 : Araylist
        //Khoi tao:
        ArrayList<Integer> mangintegers= new ArrayList<>();
        //Them gia tri
        mangintegers.add(1);
        mangintegers.add(2);
        mangintegers.add(3);
        Log.d("BBB",String.valueOf(mangintegers.size()));
        //Xoa
        mangintegers.remove(0);
        Log.d("BBB",String.valueOf(mangintegers.size()));
        //chinh sua
        mangintegers.set(0,6);
        Log.d("BBB",mangintegers.get(0).toString());
    }
}
