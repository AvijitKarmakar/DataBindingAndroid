package ak.com.apps.android.databinding.view;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import ak.com.apps.android.databinding.R;
import ak.com.apps.android.databinding.databinding.SimpleDataBindingActivityBinding;
import ak.com.apps.android.databinding.model.UserName;

/**
 * Created by USER on 10-07-2016.
 */
public class SimpleDataBindingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Inflating layout
        SimpleDataBindingActivityBinding binding = DataBindingUtil.setContentView(
                this, R.layout.simple_data_binding_activity);
        // Setting data for binding in layout
        binding.setUserName(setUserNameData());
    }

    private UserName setUserNameData() {
        UserName userName = new UserName();
        userName.setFirstName("Avijit");
        userName.setMiddleName("Nobody");
        userName.setLastName("Karmakar");
        return userName;
    }

}
