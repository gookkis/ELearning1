package kiswanto.heri.e_learning1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void pindahKeActivityPertama(View view) {
        Intent activityPertama = new Intent(this, AcitvityPertama.class);
        activityPertama.putExtra("nama", "HERI KISWANTO");
        activityPertama.putExtra("nim", "18.11.0246");
        startActivity(activityPertama);
        //finish();
    }
}
