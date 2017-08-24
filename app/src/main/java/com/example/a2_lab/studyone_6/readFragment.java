package com.example.a2_lab.studyone_6;


import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link readFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class readFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    View myView;
    TextView text;

    public readFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment readFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static readFragment newInstance(String param1, String param2) {
        readFragment fragment = new readFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedIstanceState){
        super.onViewCreated(view,savedIstanceState);
        getActivity().setTitle("read");

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        myView=inflater.inflate(R.layout.fragment_read,container,false);
        text=(TextView) myView.findViewById(R.id.nav_read);
        text.setText("Various hints have been proposed to scaffold students. Such hints can be broadly divided into direct hints and indirect hints. On the other hand, individual differences existed among learners. In particular, cognitive styles greatly affect student learning. However, there is a lack of studies to investigate how cognitive styles affect students’ reactions to the use of hints in the context of academic English. To address this issue, this study aimed to examine the effects of cognitive styles on the use of hints in such a context. To obtain deep understandings, a learning-analytics approach was applied in this study, including quantitative measurement, qualitative evaluation and lag sequential analyses. The results from the quantitative measurement indicated that the frequencies of using Chinese hints and synonym hints were significantly associated with Serialists’ task scores while such significant correlations were not found for Holists. The results from the qualitative evaluation showed that Holists favored to use synonym hints while Serialists preferred to use Chinese hints. The results from the lag sequential analyses suggested that Holists demonstrated iterative behavior while Serialists showed sequential behavior. In summary, cognitive styles have considerable influences on students’ learning patterns in the context of Academic English.\n");
        text = (TextView) myView.findViewById(R.id.nav_read);
        text.setMovementMethod(new ScrollingMovementMethod());

        return myView;
    }

}
