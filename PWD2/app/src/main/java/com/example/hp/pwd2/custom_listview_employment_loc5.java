package com.example.hp.pwd2;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link custom_listview_employment_loc5.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link custom_listview_employment_loc5#newInstance} factory method to
 * create an instance of this fragment.
 */
public class custom_listview_employment_loc5 extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    String[] content = {" Tailor" , " Tally" , " Teacher"  };
    String[] descriptions={" Pune", "Pune", "Pune"};
    String[] salary = {"Rs. 12,000" , "Rs. 12,000" , "Rs. 12,000"  };

    int [] images = {R.drawable.index, R.drawable.tally, R.drawable.teacher};
    ListView lv;


    public custom_listview_employment_loc5() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment custom_listview_employment_loc5.
     */
    // TODO: Rename and change types and number of parameters
    public static custom_listview_employment_loc5 newInstance(String param1, String param2) {
        custom_listview_employment_loc5 fragment = new custom_listview_employment_loc5();
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

        View view = inflater.inflate(R.layout.fragment_custom_listview_employment_loc5, container, false);

        lv = (ListView) view.findViewById(R.id.listview);
        custom_listview_employment.MyAdapter adapter = new custom_listview_employment.MyAdapter(getActivity(), content, descriptions, salary, images);
        lv.setAdapter((ListAdapter) adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0) {

                    Fragment fragment = new employ_tailor2();
                    FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.flcontent, fragment);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                } else if (i == 1) {

                    Fragment fragment = new employ_teacher2();
                    FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.flcontent, fragment);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();

                } else if (i == 2) {

                    Fragment fragment = new employ_tally2();
                    FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.flcontent, fragment);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();

                }
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

    private class MyAdapter extends ArrayAdapter {

        int[]imageArray;
        String[] titleArray;
        String[]descArray;
        String[] salaryarray;

        public MyAdapter(FragmentActivity activity, String[] content1, String[] descriptions1, String[] salary1, int[] images1) {
            super(activity, R.layout.example_cuslistview_row_loc5, R.id.idtitle, content1);
            this.imageArray = images1;
            this.titleArray = content1;
            this.descArray = descriptions1;
            this.salaryarray = salary1;

        }

        @NonNull
        @Override
        public View getView(int position, View convertView, ViewGroup parent){
            LayoutInflater inflater = (LayoutInflater)getContext().getSystemService(getContext().LAYOUT_INFLATER_SERVICE);
            View row = inflater.inflate(R.layout.example_cuslistview_row_loc5,parent,false);

            ImageView myImage = (ImageView)row.findViewById(R.id.idpic);
            TextView myTitle = (TextView)row.findViewById(R.id.idtitle);
            TextView myDescription = (TextView)row.findViewById(R.id.description);
            TextView mysalary = (TextView)row.findViewById(R.id.salary);

            myImage.setImageResource(imageArray[position]);
            myTitle.setText(titleArray[position]);
            myDescription.setText(descArray[position]);
            mysalary.setText(salaryarray[position]);

            return row;
        }
    }
}
