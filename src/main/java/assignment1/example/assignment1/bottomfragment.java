package assignment1.example.assignment1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link bottomfragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class bottomfragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_bottomfragment, container, false);
    }

    public void display(String message){
        TextView tvDisplay = (TextView)getActivity().findViewById(R.id.textView);
        tvDisplay.setText(message);
    }
}