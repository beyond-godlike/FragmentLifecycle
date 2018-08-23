package com.unava.dia.fragmentlifecycle;

import android.os.Bundle;
import android.app.Fragment;
import android.util.Log;
import android.widget.Toast;


public class SecondFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(getActivity(), "SecondFragment.onCreate()",
                Toast.LENGTH_LONG).show();
        Log.d("Fragment 2", "onCreate");
    }

}