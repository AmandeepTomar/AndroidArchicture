package com.aman.mvvmexample.view.InnerRecDataBinding;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.aman.mvvmexample.R;
import com.aman.mvvmexample.databinding.Item1Binding;
import com.aman.mvvmexample.databinding.RevItem2Binding;

/**
 * Created by amandeep on 3/2/18.
 */

public class RvMainAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private ListViewModel viewModel;
    private Context contex;
    public final int VIEW1=1;
    public final int VIEW2=2;

    public RvMainAdapter(Context context,ListViewModel viewModel) {
        this.contex=context;
        this.viewModel=viewModel;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater;
        if (viewType==VIEW1){
            inflater = LayoutInflater.from(parent.getContext());
            Item1Binding dataBinding= DataBindingUtil.inflate(inflater, R.layout.main_rec_item_1,parent,false);
            return new Item1ViewHolder(dataBinding);

        }else if (viewType==VIEW2){
            inflater = LayoutInflater.from(parent.getContext());
            RevItem2Binding revItem2Binding=DataBindingUtil.inflate(inflater,R.layout.rev_item_2,parent,false);
            return new Item2ViewHolder(revItem2Binding);
        }
            return null;


    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof Item1ViewHolder){
            Item1ViewHolder item1ViewHolder= (Item1ViewHolder) holder;
            item1ViewHolder.setOnBinding(position);
        }else if (holder instanceof Item2ViewHolder){
            Item2ViewHolder item2ViewHolder= (Item2ViewHolder) holder;
            item2ViewHolder.setItem2Bind(position);
        }
    }

    @Override
    public int getItemCount() {
        return 10;
    }

    @Override
    public int getItemViewType(int position) {
        if (position==0){
            return VIEW1;
        }else {
            return VIEW2;
        }


    }

    class Item1ViewHolder extends RecyclerView.ViewHolder {
        Item1Binding item1Binding;
        public Item1ViewHolder(Item1Binding item1Binding) {
            super(item1Binding.getRoot());
            this.item1Binding=item1Binding;
        }

        public void setOnBinding(int position) {
            item1Binding.setItemViewModel(viewModel);
            item1Binding.executePendingBindings();
        }
    }

    class Item2ViewHolder extends RecyclerView.ViewHolder {
        RevItem2Binding revItem2Binding;
        public Item2ViewHolder(RevItem2Binding revItem2Binding) {
            super(revItem2Binding.getRoot());
            this.revItem2Binding=revItem2Binding;
        }

        public void setItem2Bind(int position) {
            revItem2Binding.setItem2ViewModel(viewModel);
            revItem2Binding.executePendingBindings();

        }
    }
}
