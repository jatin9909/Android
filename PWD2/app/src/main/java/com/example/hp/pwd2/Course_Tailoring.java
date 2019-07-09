package com.example.hp.pwd2;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Course_Tailoring.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Course_Tailoring#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Course_Tailoring extends Fragment implements YouTubePlayer.OnInitializedListener {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    YouTubePlayerView v1;
    Button b1;
    YouTubePlayer.OnInitializedListener onInitializedListener;


    private OnFragmentInteractionListener mListener;

    Spinner spinner , spinner1;

    public Course_Tailoring() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Course_Tailoring.
     */
    // TODO: Rename and change types and number of parameters
    public static Course_Tailoring newInstance(String param1, String param2) {
        Course_Tailoring fragment = new Course_Tailoring();
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


        View view = inflater.inflate(R.layout.fragment_course__tailoring, container, false);

        b1 = (Button) view.findViewById(R.id.play);
        v1 = (YouTubePlayerView)view.findViewById(R.id.youtube);


            spinner =(Spinner)view.findViewById(R.id.spin);


            String[] content = {"Week 1: Beginners Sewing Course Day1 : The Basics", "Beginners Sewing Course Day2 : Fabric Prepartion"
                    , "How to Measure Yourself", "How to Finish A Seam", "How to Trace DressMaking Pattern", "How to Grade Increase Decrease Dress Making Pattern"
                    , "Cutting and Tailoring", "Machine Embroidery Book", "Indian Garment Design Course Book", " Week 1 : Assessment"};

            ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_dropdown_item_1line, content);
        spinner.setAdapter(adapter);


            spinner1 =(Spinner)view.findViewById(R.id.spin1);
            String[] content1 = {"Week 2: The Detailed Version of Tailoring ", "What is Interlining and UnderLining", " New Model Blouse Cutting and Stiching Pattern"
                    , "Front Slit A line Kurti Salwar Kameez Marking", "Beginners Sewing Course ZigZag stitches", "Mens Shirt Cuttting and stitching"
                    , "Sewing and Design Book", "Practical Sewing and dress Making", "Final Assessment"};

            ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_dropdown_item_1line, content1);
        spinner1.setAdapter(adapter1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                v1.initialize(playerconfig.API_KEY,onInitializedListener);
            }
        });

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



    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {

        youTubePlayer.loadVideo("srH-2pQdKhg");
    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

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
    interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }

}