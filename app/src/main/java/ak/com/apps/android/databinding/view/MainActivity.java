package ak.com.apps.android.databinding.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import ak.com.apps.android.databinding.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button simpleDataBindingBtn = (Button) findViewById(R.id.simple_data_binding_btn);
        simpleDataBindingBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.simple_data_binding_btn) {
            startActivity(new Intent(this, SimpleDataBindingActivity.class));
        }
    }
}
