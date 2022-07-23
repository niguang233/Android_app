package to.msn.wings.widgetscheckbox;

import static android.app.ProgressDialog.show;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CheckedTextView;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import java.sql.Array;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ArrayList<String> data = new ArrayList<>();
        data.add("胡椒0");
        data.add("胡椒1");
        data.add("胡椒2");
        data.add("胡椒3");
        data.add("胡椒4");
        data.add("胡椒5");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, data);
        ListView list = findViewById(R.id.list);
        list.setAdapter(adapter);

        list.setOnScrollListener(new AbsListView.OnScrollListener() {


                                     @Override
                                     public void onScrollStateChanged(AbsListView arg0, int arg1) {

                                     }

                                     @Override
                                     public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
                                         if (firstVisibleItem + visibleItemCount + 3 > totalItemCount) {
                                             adapter.add("新胡椒0");
                                             adapter.add("新胡椒1");
                                             adapter.add("新胡椒2");
                                         }
                                     }
                                 });

//        createSpinner();

//        //Spinnerを取得
//        Spinner sp = findViewById(R.id.spnOs);
//        //Spinnerに対してイベントリスナーを登録
//        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                //選択項目を取得し、その値をトースト表示
//                Spinner sp = (Spinner) parent;
//                Toast.makeText(MainActivity.this,
//                        String.format("選択項目：%s", sp.getSelectedItem()),
//                        Toast.LENGTH_SHORT).show();
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//
//            }
//        });

//        //SeekBarを取得
//        SeekBar seek = findViewById(R.id.seek);
//        //SeekBarに対してイベントリスナーを登録
//        seek.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
//            @Override
//            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
//                int current = (progress - 10) * 10;
//                Toast.makeText(MainActivity.this,
//                        String.format("現在値：%d", current),
//                        Toast.LENGTH_SHORT).show();
//            }
//
//            @Override
//            public void onStartTrackingTouch(SeekBar seekBar) {
//
//            }
//
//            @Override
//            public void onStopTrackingTouch(SeekBar seekBar) {
//
//            }
//        });

//        //RadioGroupを取得
//        RadioGroup rgroup = findViewById(R.id.rgroup);
//        //RadioGroupに対してイベントリスナーを登録
//        rgroup.setOnCheckedChangeListener((group, checkId) -> {
//            RadioButton radio = group.findViewById(checkId);
//            Toast.makeText(MainActivity.this,
//                    String.format("「%s」が選択されました。", radio.getText()),
//                    Toast.LENGTH_SHORT).show();
//        });
//
//        Switch chk = findViewById(R.id.sw);
//        chk.setOnCheckedChangeListener((buttonView, isChecked) ->
//            Toast.makeText(MainActivity.this,
//                isChecked ? "メール送信をオン" : "メール送信をオフ",
//                Toast.LENGTH_SHORT).show()
//        );
    }
    //Spinnerに項目リストを登録するメソッド
//    private void createSpinner() {
//        ArrayList<String> list = new ArrayList<>();
//        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd", Locale.JAPAN);
//        Calendar cal = Calendar.getInstance();
//
//        for (int i = 1; i < 11; i++) {
//            cal.set(Calendar.DAY_OF_MONTH, cal.get(Calendar.DAY_OF_MONTH) + 1);
//            list.add(format.format(cal.getTime()));
//        }
//        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
//                android.R.layout.simple_spinner_dropdown_item, list);
//        Spinner spn = findViewById(R.id.spnOs);
//        spn.setAdapter(adapter);
//        spn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                Spinner sp = (Spinner) parent;
//                Toast.makeText(MainActivity.this,
//                        String.format("選択項目：%s", sp.getSelectedItem()),
//                        Toast.LENGTH_SHORT).show();
//
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//
//            }
//        });
//    }
}