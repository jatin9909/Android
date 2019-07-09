package com.example.hp.pwd2;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Course_rj1.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Course_rj1#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Course_rj1 extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    Spinner spinner , spinner1 , spinner2;

    public Course_rj1() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Course_rj1.
     */
    // TODO: Rename and change types and number of parameters
    public static Course_rj1 newInstance(String param1, String param2) {
        Course_rj1 fragment = new Course_rj1();
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
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_course_rj1, container, false);

        spinner = (Spinner)view.findViewById(R.id.spin);
        String[] content = {"Week 1: Radio Jockey Training: Basics" , "What is Radio Jockey session 1" , "How To write Radio Shows",
        "Types of radio shows and presentation style" , "How To Become a Radio Jockey" , "Presentation Style of Morning Radio Show" ,
        "Radio Jockey pdf 1" , "Radio Jockey Book" , "Week 1: Assessment" };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_dropdown_item_1line, content);
        spinner.setAdapter(adapter);

        spinner1 = (Spinner)view.findViewById(R.id.spin1);
        String[] content1 = {"Week 2: Radio Jockey Majors" , "Radio Night Show Presentation style" , "7 tips on how to write radio scripts",
        "Radio Jockey Voice Training","Radio Jockey Diaphragmatic Breathing" , "How To improve Voice Quality", "Voice Relaxation Exercises",
        "Radio Jockey Book" , "Week 2: Assessment"};

        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_dropdown_item_1line, content1);
        spinner1.setAdapter(adapter1);

        spinner2 = (Spinner)view.findViewById(R.id.spin2);
        String[] content2 = {"Week 3: Radio Jockey Majors" , "Lip Fluttering: RJ Training" , "Voice Modulation Training"  ,"Expressions And Pronunciation"
        , "Voice Modulation Technique Session 2" , "How To Project Voice", "Radio Jockey Book" ,"Week 3: Assessment" };

        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_dropdown_item_1line, content2);
        spinner2.setAdapter(adapter2);

        return view;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
