package com.aman.mvvmexample.view.InnerRecDataBinding;


import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.aman.mvvmexample.R;
import com.aman.mvvmexample.databinding.FragmentItemBinding;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ImageAdapterItem#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ImageAdapterItem extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private ListViewModel mParam2;
    private FragmentItemBinding binding;



    public ImageAdapterItem() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ImageAdapterItem.
     */
    // TODO: Rename and change types and number of parameters
    public static ImageAdapterItem newInstance(String param1, ListViewModel param2) {
        ImageAdapterItem fragment = new ImageAdapterItem();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putSerializable(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = (ListViewModel) getArguments().getSerializable(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding= DataBindingUtil.inflate(inflater,R.layout.fragment_image_adapter_item, container, false);
        //return inflater.inflate(R.layout.fragment_image_adapter_item, container, false);
        binding.setFragViewModel(mParam2);
        return binding.getRoot();
    }

}
