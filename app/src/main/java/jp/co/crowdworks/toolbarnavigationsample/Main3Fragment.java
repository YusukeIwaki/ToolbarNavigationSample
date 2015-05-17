package jp.co.crowdworks.toolbarnavigationsample;

import android.view.View;
import android.widget.ImageView;

/**
 * Created by yi01 on 2015/05/18.
 */
public class Main3Fragment extends MainFragment {
    public Main3Fragment(){}

    @Override
    protected void setupView(View root){
        ImageView img = (ImageView)root.findViewById(R.id.fragment_main_image);
        img.setImageResource(R.drawable.fig3);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction()
                        .add(R.id.activity_main_container, new Main4Fragment())
                        .addToBackStack(null)
                        .commit();
            }
        });
    }
}
