package com.example.someimagestuff;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class MyFragment extends DialogFragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        MainActivity activity = (MainActivity) getActivity();
        Drawable papajowo = activity.getMyDrawable();
         ImageView papajFrag = null;
         papajFrag = papajFrag.findViewById(R.id.imageView2);
        return inflater.inflate(R.layout.dialog_fragment,container,false);
    }
}
