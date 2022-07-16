package to.msn.wings.widgetscheckbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //RadioGroupを取得
        RadioGroup rgroup = findViewById(R.id.rgroup);
        //RadioGroupに対してイベントリスナーを登録
        rgroup.setOnCheckedChangeListener((group, checkId) -> {
            RadioButton radio = group.findViewById(checkId);
            Toast.makeText(MainActivity.this,
                    String.format("「%s」が選択されました。", radio.getText()),
                    Toast.LENGTH_SHORT).show();
        });
//
//        Switch chk = findViewById(R.id.sw);
//        chk.setOnCheckedChangeListener((buttonView, isChecked) ->
//            Toast.makeText(MainActivity.this,
//                isChecked ? "メール送信をオン" : "メール送信をオフ",
//                Toast.LENGTH_SHORT).show()
//        );
    }
}