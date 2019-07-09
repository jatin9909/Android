package com.example.hp.pwd2;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link sign_up.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link sign_up#newInstance} factory method to
 * create an instance of this fragment.
 */
public class sign_up extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    Spinner spinner , spinner2;
    Button b1;
    TextInputEditText Fname,Lname,email,Pass,Cpass;
    EditText Age, cnum,adress;


    private OnFragmentInteractionListener mListener;

    public sign_up() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment sign_up.
     */
    // TODO: Rename and change types and number of parameters
    public static sign_up newInstance(String param1, String param2) {
        sign_up fragment = new sign_up();
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

        View view  = inflater.inflate(R.layout.fragment_sign_up, container, false);

        Fname = (TextInputEditText)view.findViewById(R.id.fname);
        Lname = (TextInputEditText)view.findViewById(R.id.lname);
        email = (TextInputEditText)view.findViewById(R.id.Email);
        Pass = (TextInputEditText)view.findViewById(R.id.pass);
        Cpass = (TextInputEditText)view.findViewById(R.id.cpass);

        Age = (EditText) view.findViewById(R.id.age);
        cnum = (EditText)view.findViewById(R.id.number);
        adress = (EditText)view.findViewById(R.id.address);

        b1 = (Button)view.findViewById(R.id.button);

        final String getfname = Fname.getText().toString();
        final String getlName = Lname.getText().toString();
        final String getemail = email.getText().toString();
        final String getpass =  Pass.getText().toString();
        final String getcpass = Cpass.getText().toString();
        final String getage =   Age.getText().toString();
        final String getnum =   cnum.getText().toString();
        final String getaddress = adress.getText().toString();


        spinner = (Spinner)view.findViewById(R.id.spin);
        String[] SEX = {" Male" , "Female "," Transgender"};
        ArrayAdapter<String>adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_dropdown_item_1line, SEX);
        spinner.setAdapter(adapter);
        final String Gender = spinner.getSelectedItem().toString();

        spinner2 = (Spinner)view.findViewById(R.id.spin2);
        String[] Disability = {"Blindness" , "Low-vision" , "Leprosy-cured" , "Hearing Imapairment" , "Loco motor disability" , "Mental retardation" , "Mental Illness"};
        ArrayAdapter<String>adapter1 = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_dropdown_item_1line,Disability);
        spinner2.setAdapter(adapter1);
        final String disbaility = spinner2.getSelectedItem().toString();


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(getfname.equals("") && getfname.length()==0 && Gender.equals("") && disbaility.equals("") && disbaility.length()==0 && Gender.length()==0 && getlName.equals("") && getlName.length()==0 && getemail.equals("") && getemail.length()==0 && getpass.equals("") && getpass.length()==0 && getcpass.equals("") && getcpass.length()==0 && getage.equals("") && getage.length()==0 && getnum.equals("") && getnum.length()==0 && getaddress.equals("") && getaddress.length()==0) {
                    Toast.makeText(getActivity(), " All fields are requires", Toast.LENGTH_SHORT).show();
                }

                else{
                    Toast.makeText(getActivity(), "Login Successful", Toast.LENGTH_SHORT).show();

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
}
