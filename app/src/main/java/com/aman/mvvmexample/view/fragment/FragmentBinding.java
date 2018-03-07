package com.aman.mvvmexample.view.fragment;


import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.aman.mvvmexample.R;
import com.aman.mvvmexample.databinding.FragmentBindingBinding;
import com.aman.mvvmexample.model.FragmentBindingModel;
import com.aman.mvvmexample.view.activity.FragmentBindingActivity;
import com.aman.mvvmexample.viewmodel.FragmentBindingViewModel;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentBinding#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentBinding extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private FragmentBindingBinding fragmentBindingBinding;
    FragmentBindingViewModel model;


    public FragmentBinding() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentBinding.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentBinding newInstance(String param1, String param2) {
        FragmentBinding fragment = new FragmentBinding();
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
        fragmentBindingBinding= DataBindingUtil.inflate(inflater,R.layout.fragment_binding,container,false);
        FragmentBindingModel fragmentBindingModel=new FragmentBindingModel();
        fragmentBindingModel.setText("Amandeep Tomar");
        model=new FragmentBindingViewModel(fragmentBindingModel);
        fragmentBindingBinding.setFragmentBindingView(model);
        fragmentBindingBinding.setFragmentContext((FragmentBindingActivity)getActivity());
        return fragmentBindingBinding.getRoot();
    }

}
