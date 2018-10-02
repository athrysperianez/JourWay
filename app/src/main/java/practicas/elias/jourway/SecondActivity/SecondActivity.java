package practicas.elias.jourway.SecondActivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import practicas.elias.jourway.R;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        String choice = getIntent().getStringExtra("EXTRA_CHOICE");
        Intent in = null;
        switch (choice){
            case "Time":
                in = new Intent(this, TimeFragment.class);
                break;

            case "Money":
                in = new Intent(this, MoneyFragment.class);
                break;
            case  "Place":
                in = new Intent(this, PlaceFragment.class);
                break;

            default:
                break;
        }
        startActivity(in);
    }
}
