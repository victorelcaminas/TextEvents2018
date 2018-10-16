package org.ieselcaminas.pmdm.textevents2018;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView resultText1;
    private TextView resultText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultText1 = (TextView) findViewById(R.id.result1);
        resultText2 = (TextView) findViewById(R.id.result2);
        EditText myEditText = (EditText) findViewById(R.id.editText);

        // We register the Event Listener

        myEditText.addTextChangedListener(new TextWatcher() {
            // Method launched before the text changes
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                resultText1.setText("Text before changing: " + s.toString());
            }

            // Method launched when the text changes
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                resultText2.setText("Changed text: " + s.toString());
            }

            // Method launched when the text changes . The difference with respect
            // the previous method is that the variable s can be modified
            public void afterTextChanged(Editable s) {
                // We don't do anything here
            }
        });
    }
}
