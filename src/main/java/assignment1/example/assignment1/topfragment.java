package assignment1.example.assignment1;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link topfragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class topfragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_topfragment, container, false);

        String[] menu = {"AIActivity", "VRActivity"};
        ListView listView = (ListView) view.findViewById(R.id.listview);

        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_activated_1,menu);
        listView.setAdapter(listViewAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0){
                    Intent intent = new Intent(getActivity(),AiActivity.class);
                    startActivity(intent);

                }
                if(position == 1){
                    Intent intent = new Intent(getActivity(),VrActivity.class);
                    startActivity(intent);
                }
            }
        });

        Toast.makeText(getActivity(), "onCreate", Toast.LENGTH_SHORT).show();
        return view;
    }
    public void onStart()
    {
        super.onStart();

        Toast.makeText(getActivity(), "onStart", Toast.LENGTH_SHORT).show();
    }
}