package com.example.radha.loginapp;

/**
 * Created by radha on 3/14/2018.
 */

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by radha on 3/12/2018.
 */

public class TextAdapter extends RecyclerView.Adapter {

    private List<String> mItems = new ArrayList<>();

    public void setItems(List<String> items) {
        mItems = items;
        notifyDataSetChanged();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType == 0)
            return TextViewHolder.inflate(parent);
        else
            return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof TextViewHolder) {
            ((TextViewHolder) holder).bind(mItems.get(position));
        }

    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }

    @Override
    public int getItemViewType(int position) {
        return 0;
    }


    static class TextViewHolder extends RecyclerView.ViewHolder {

        private TextView mTextView;

        public TextViewHolder(View itemView) {
            super(itemView);

            mTextView = itemView.findViewById(R.id.lst_text);
        }

        public static TextViewHolder inflate(ViewGroup parent) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_txt, parent, false);
            return new TextViewHolder(view);
        }

        public void bind(String text) {
            mTextView.setText(text);

        }
    }

}
