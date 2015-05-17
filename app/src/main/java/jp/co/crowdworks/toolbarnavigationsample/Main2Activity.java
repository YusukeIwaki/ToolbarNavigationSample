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
    public Intent getParentActivityIntent(){
        Intent intent = super.getParentActivityIntent();
        if(intent==null) intent = createParentIntent();
        return intent;
    }

    @Override
    public Intent getSupportParentActivityIntent(){
        Intent intent = super.getSupportParentActivityIntent();
        if(intent==null) intent = createParentIntent();
        return intent;
    }

    private Intent createParentIntent(){
        Intent intent = new Intent(this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
        return intent;
    }

    @Override
    protected void setupFragment(){
        getSupportFragmentManager().beginTransaction()
                .add(R.id.activity_main_container, new Main2Fragment())
                .commit();
    }
}
