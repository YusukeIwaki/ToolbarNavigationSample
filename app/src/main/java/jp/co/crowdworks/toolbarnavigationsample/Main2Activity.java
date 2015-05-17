package jp.co.crowdworks.toolbarnavigationsample;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

/**
 * Created by yi01 on 2015/05/17.
 */
public class Main2Activity extends MainActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mDrawerToggle.setDrawerIndicatorEnabled(false);
        mDrawerToggle.setToolbarNavigationClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Main2Activity.this.onBackPressed();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void setupFragment(){
        getSupportFragmentManager().beginTransaction()
                .add(R.id.activity_main_container, new Main2Fragment())
                .commit();
    }
}
