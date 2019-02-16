package learning.mahmoud.azexcamp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edMulInput;
    Button btnOpenMul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edMulInput = findViewById(R.id.edMulNum);
        btnOpenMul = findViewById(R.id.btnOpenMulTable);


        btnOpenMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mulNumString = edMulInput.getText().toString();
                int mulNum = Integer.parseInt(mulNumString);
                Intent mulTableActivity = new Intent(MainActivity.this,MulTableActivity.class);
                mulTableActivity.putExtra(Constants.MulTableNum , mulNum);
                startActivity(mulTableActivity);
            }
        });

    }
}
