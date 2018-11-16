package kiswanto.heri.e_learning1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class AcitvityPertama extends AppCompatActivity {

    private TextView tvNama, tvNIM;
    private String nama, nim;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acitvity_pertama);

        Intent intent = getIntent();

        nama = intent.getStringExtra("nama");
        nim = intent.getStringExtra("nim");

        tvNama = findViewById(R.id.tv_nama);
        tvNIM = findViewById(R.id.tv_nim);

        tvNama.setText(nama);
        tvNIM.setText(nim);

    }

    public void balikKanan(View view) {
        finish();
    }
}
