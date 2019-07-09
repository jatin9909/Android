package com.example.hp.pwd2;

import android.app.Activity;
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
import android.widget.Spinner;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Course_Basic_computing.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Course_Basic_computing#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Course_Basic_computing extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    Spinner spinner , spinner1 , spinner2 , spinner3;

    public Course_Basic_computing() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Course_Basic_computing.
     */
    // TODO: Rename and change types and number of parameters
    public static Course_Basic_computing newInstance(String param1, String param2) {
        Course_Basic_computing fragment = new Course_Basic_computing();
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
        View view = inflater.inflate(R.layout.fragment_course__basic_computing, container, false);

        spinner = (Spinner)view.findViewById(R.id.spin);
        String[] content = {" Week 1: Microsoft Word" , "Microsoft Word pt 1 Enter , Edit , Backspace , Save , Print" , "Microsoft Word pt 2 Fonts , Alignment, Borders, Bullets, Tab stop",
        "Microsoft Word pt 3 Insert picture, Table , Clip art , Header footer, Date, Samrt Art, Chart" ,
        "Microsoft Word pt 4 Insert Cover page, Table, Picture, Clip art, Smart Art" , "Microsoft Word pt 5 Hyperlink, Bookmark, Header Fooder, Page number, Drop cap",
        "Microsoft Word pt 6 Page Setup, Orientation, Margins, Breaks, Line number", "Microsoft Word 7 Table of Content, Bibliography, Footnote, Index" ,
        " Microsoft Word pt 8 Create Mail Merge Letter, Envelopes and Labels",  "MS Word Book" , "MS Word Tutorial" , "Week 1 : MS Word Assessment"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_dropdown_item_1line, content);
        spinner.setAdapter(adapter);


        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                spinner.setSelection( 0 );

                switch (i){
                    case 11:
                        Intent intent = new Intent(getActivity(), msword_assesment.class);
                        startActivity(intent);
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });





        spinner1 = (Spinner)view.findViewById(R.id.spin1);
        String[] content1 = { "Week 2: Microsoft PowerPoint " , "Add slides, picture, chart, transition, Design" , "Animation, Rehearse timings, Add Sound Video "
                , "Rehearse Timings, Insert Sound, slide master & more" , "How To Insert Embed Video In PowerPoint" , "How to make Portfolio Layout in PowerPoint"
                , "PowerPoint Animation Tutorial" , "MS PowerPoint Book" , "Ms PowerPoint Tutorial", "Week 2: MS PowerPoint Final Assessment"};

        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_dropdown_item_1line, content1);
        spinner1.setAdapter(adapter1);

        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                spinner1.setSelection( 0 );

                switch (i){
                    case 9:
                        Intent intent = new Intent(getActivity(), mspowerpoint_assesment.class);
                        startActivity(intent);
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });




        spinner2 = (Spinner)view.findViewById(R.id.spin2);
        String[] content2 ={ " Week 3: Microsoft Excel", "Microsoft Excel Part 1" , "Microsoft Excel Part 2", "Microsoft Excel Part 3", "Microsoft Excel part 4 Charts",
        "Microsoft Excel part 5 Name ranges, Absolute reference, Conditional format" , "Microsoft Excel pt 6 If Function, Sub Total, Vlookup 1" , "Microsoft Excel pt 7 Sort Filter, Freeze, Pivot Table" , "MS Excel" , "MS Excel Tutorial" , "Week 3: Ms Excel Final Assessment"};

        ArrayAdapter<String>adapter2 = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_dropdown_item_1line, content2);
        spinner2.setAdapter(adapter2);

        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                spinner2.setSelection( 0 );

                switch (i){
                    case 10:
                        Intent intent = new Intent(getActivity(), msexcel_assesment.class);
                        startActivity(intent);
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


        spinner3 = (Spinner)view.findViewById(R.id.spin3);
        String [] content3 = {"Week 4: Microsoft Access" , "Microsoft Access Part 1: Tables, Forms" , "Microsoft Access Part 2: Tables, Query, Reports",
                "Table Relationships" ,"Query Expression Builder" , "Create Tab, Navigation Form, Calculate Fields" , "Microsoft Access pt 6 Report Invoice, Macro Find, Email, Print, Search",
                "Microsoft Access pt 7 Auto Complete & input box on form" , "Cascading Combo Box" ,"Invoice PAyments & Dlookups" , "Adding Buttons on Form" ,"MS Access Book" , "Ms Access Tutorial Point" , "week 4: Ms Access Final Assessment" };

        ArrayAdapter<String>adapter3 = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_dropdown_item_1line,content3);
        spinner3.setAdapter(adapter3);

        spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                spinner3.setSelection( 0 );

                switch (i){
                    case 13:
                        Intent intent = new Intent(getActivity(), mspowerpoint_assesment.class);
                        startActivity(intent);
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

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
