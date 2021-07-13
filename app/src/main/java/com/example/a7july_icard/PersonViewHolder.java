package com.example.a7july_icard;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PersonViewHolder extends RecyclerView.ViewHolder {

    TextView mTvAge,mTvProfession, mTvCompany;
    ImageView mImage;
    //private ItemClickListener itemClickListener;

    public PersonViewHolder(@NonNull View itemView) {
        super(itemView);
        //this.itemClickListener = itemClickListener;
        initViews(itemView);
    }

    private void initViews(View itemView) {
        mTvCompany = itemView.findViewById(R.id.tvCompany);
        mTvAge = itemView.findViewById(R.id.tvAge);
        mTvProfession = itemView.findViewById(R.id.tvProffession);
        mImage = itemView.findViewById(R.id.ivImage);
    }
    public void setData(Person person){
        mTvCompany.setText(person.getCompany());
        mTvAge.setText(person.getAge());
        mTvProfession.setText(person.getProfession());
        mImage.setImageResource(person.getImage());
    }


}
