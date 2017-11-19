package nyc.c4q.fragment_inclass2;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {

    private EditText editText;

    private View rootView;


    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_main, container, false);
        Button button= rootView.findViewById(R.id.go_to_fragment1);
        editText= rootView.findViewById(R.id.edit_text)
        // Inflate the layout for this fragment

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            Fragment1 fragmentOne= new Fragment1();
            FragmentManager fragmentManager= getActivity().getSupportFragmentManager();
            FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();

            String getText= editText.getText().toString();
            Bundle bundle = getArguments();
            bundle.putString("text", getText);
            fragmentOne.setArguments(bundle);
            fragmentTransaction.replace(R.id.main_container, fragmentOne);
            fragmentTransaction.commit();

            }
        });




        return rootView;
    }

}
