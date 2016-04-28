package usuario.app.spinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    private Spinner spinner1, spinner2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SetSpinner1();
        spinner1 = (Spinner) findViewById(R.id.spinner1);
        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> arg0, View arg1,
                                       int arg2, long arg3) {
                SetSpinner2(spinner1.getSelectedItem().toString());
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
    }
    private void SetSpinner1() {
        Spinner dropdown = (Spinner)findViewById(R.id.spinner1);
        String[] items = new String[]{"a", "b", "c"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items);
        dropdown.setAdapter(adapter);
    }
    private void SetSpinner2(String s) {
        Spinner dropdown = (Spinner)findViewById(R.id.spinner2);
        String[] items = new String[]{};
        if (s == "a") {
            items = new String[]{"aa", "ae", "ai"};
        }
        if (s == "b") {
            items = new String[]{"ba", "be", "bi"};
        }
        if (s == "c") {
            items = new String[]{"ca", "ce", "ci"};
        }
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items);
        dropdown.setAdapter(adapter);
    }
}
