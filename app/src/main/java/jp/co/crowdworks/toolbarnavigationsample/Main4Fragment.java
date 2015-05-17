package jp.co.crowdworks.toolbarnavigationsample;

import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by yi01 on 2015/05/18.
 */
public class Main4Fragment extends MainFragment {
    public Main4Fragment(){}

    @Override
    protected void setupView(View root){
        ImageView img = (ImageView)root.findViewById(R.id.fragment_main_image);
        img.setImageResource(R.drawable.fig4);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"no more fragments.",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
