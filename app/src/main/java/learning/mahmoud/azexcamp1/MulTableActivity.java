package learning.mahmoud.azexcamp1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MulTableActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mul_table);

        int mulNum = getIntent().getIntExtra(Constants.MulTableNum , 1);

        MulTableAdapter mulTableAdapter = new MulTableAdapter(mulNum);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        RecyclerView rvMulTable = findViewById(R.id.rvMulTable);

        rvMulTable.setLayoutManager(linearLayoutManager);
        rvMulTable.setAdapter(mulTableAdapter);

    }
}
