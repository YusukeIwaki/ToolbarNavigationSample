package jp.co.crowdworks.toolbarnavigationsample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by yi01 on 2015/05/18.
 */
public class Main2Fragment extends MainFragment{

    public Main2Fragment() {}


    @Override
    protected void setupView(View root){
        ImageView img = (ImageView)root.findViewById(R.id.fragment_main_image);
        img.setImageResource(R.drawable.fig2);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction()
                        .replace(R.id.activity_main_container, new Main3Fragment())
                        .commit();
            }
        });
    }

}
