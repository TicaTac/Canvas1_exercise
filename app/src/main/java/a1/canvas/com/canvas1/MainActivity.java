package a1.canvas.com.canvas1;

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

        Float f;



        Button changeTxt= (Button)findViewById(R.id.changeTxtBtn);
        changeTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText et= (EditText) findViewById(R.id.editText);
              String textFromET=   et.getText().toString();

                MyNameView mynameCV= (MyNameView) findViewById(R.id.mynameCV);
                mynameCV.changeName(textFromET);

            }
        });
    }
}
