package severina.navigationviewtask1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Toolbar mToolBar;
    private RecyclerView mRvMenuItem;
    private LinearLayoutManager layoutManager;
    private ArrayList<NavigationMenuModel> modelArrayList = new ArrayList<>();
    private NavigationAdapter navigationAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mToolBar = findViewById(R.id.tbToolBar_main);
        setSupportActionBar(mToolBar);
        mRvMenuItem = findViewById(R.id.rvMenuItems);
        mRvMenuItem.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        mRvMenuItem.setLayoutManager(layoutManager);
        initArrayList();
        navigationAdapter = new NavigationAdapter(this, modelArrayList);
        mRvMenuItem.setAdapter(navigationAdapter);
    }

    private void initArrayList() {
        modelArrayList.add(new NavigationMenuModel(R.drawable.ic_iconfinder_user_check, getString(R.string.registr_or_login_title)));
        modelArrayList.add(new NavigationMenuModel(R.drawable.ic_iconfinder_user_check, getString(R.string.main_titile)));
        modelArrayList.add(new NavigationMenuModel(R.drawable.ic_iconfinder_user_check, getString(R.string.work_shem)));
        modelArrayList.add(new NavigationMenuModel(R.drawable.ic_iconfinder_user_check, getString(R.string.reviews)));
        modelArrayList.add(new NavigationMenuModel(R.drawable.ic_iconfinder_user_check, getString(R.string.about_us)));

    }
}
