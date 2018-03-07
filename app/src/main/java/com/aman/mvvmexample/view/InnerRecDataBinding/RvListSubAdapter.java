package com.aman.mvvmexample.view.InnerRecDataBinding;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.aman.mvvmexample.R;
import com.aman.mvvmexample.databinding.Item3Binding;

/**
 * Created by amandeep on 3/2/18.
 */

public class RvListSubAdapter extends RecyclerView.Adapter<RvListSubAdapter.ItemSubViewHolder> {
    private Context context;
    private ListViewModel viewModel;

    public RvListSubAdapter(Context context, ListViewModel viewModel) {
        this.context = context;
        this.viewModel = viewModel;
    }

    @Override
    public ItemSubViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        Item3Binding binding= DataBindingUtil.inflate(inflater, R.layout.item_3,parent,false);
        return new ItemSubViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(ItemSubViewHolder holder, int position) {
        holder.setBindData(position);
    }

    @Override
    public int getItemCount() {
        return 10;
    }

    class ItemSubViewHolder extends RecyclerView.ViewHolder{
        Item3Binding binding;
        public ItemSubViewHolder(Item3Binding binding) {
            super(binding.getRoot());
            this.binding=binding;
        }

        public void setBindData(int position) {
            binding.setItem3ViewModel(viewModel);
            binding.executePendingBindings();
        }

    }

}
