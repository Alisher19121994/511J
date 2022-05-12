package com.example.a511j;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.airbnb.lottie.LottieAnimationView;

import java.util.ArrayList;

public class Adapters extends RecyclerView.Adapter<Adapters.MyViews> {
    Context context;
    ArrayList<Integer> list;

    public Adapters(Context context, ArrayList<Integer> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public Adapters.MyViews onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recyclerview_adapter, parent, false);
        return new MyViews(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapters.MyViews holder, int position) {
        holder.lottieAnimationView.setAnimation(list.get(position));

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViews extends RecyclerView.ViewHolder {
        LottieAnimationView lottieAnimationView;

        public MyViews(@NonNull View itemView) {
            super(itemView);
            lottieAnimationView = itemView.findViewById(R.id.lotti_id);
        }
    }
}
