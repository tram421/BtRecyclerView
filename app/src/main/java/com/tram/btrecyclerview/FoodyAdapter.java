package com.tram.btrecyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FoodyAdapter extends RecyclerView.Adapter<FoodyAdapter.FoodyHolder> {
    List<FoodyItem> mArrFoody;

    public FoodyAdapter(List<FoodyItem> mArrFoody) {
        this.mArrFoody = mArrFoody;
    }

    @NonNull
    @Override
    public FoodyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view=layoutInflater.inflate(R.layout.foody_item,parent,false);
        return new FoodyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodyHolder holder, int position) {
        holder.mImg.setImageResource(mArrFoody.get(position).getImage());
        holder.mCmt.setText(mArrFoody.get(position).getComment());
        holder.mAvt.setImageResource(mArrFoody.get(position).getImageAvt());
        holder.mAddress.setText(mArrFoody.get(position).getAddress());
        holder.mName.setText((mArrFoody.get(position).getName()));
        if(mArrFoody.get(position).getCommentCount()>999){
            holder.mCmtCount.setText(mArrFoody.get(position).getCommentCount()/1000+"k");
        }else {
            holder.mCmtCount.setText(mArrFoody.get(position).getCommentCount()+"");
        }
        if(mArrFoody.get(position).getImageCount()>999){
            holder.mImgCount.setText(mArrFoody.get(position).getImageCount()/1000+"k");
        }else {
            holder.mImgCount.setText(mArrFoody.get(position).getImageCount()+"");
        }


    }

    @Override
    public int getItemCount() {
        if(mArrFoody!=null){
            return mArrFoody.size();
        }else {
            return 0;
        }
    }

    public class FoodyHolder extends RecyclerView.ViewHolder {
        ImageView mImg,mAvt;
        TextView mName, mAddress,mCmt, mCmtCount, mImgCount;
        public FoodyHolder(@NonNull View itemView) {
            super(itemView);
            mImg=itemView.findViewById(R.id.idImg);
            mName=itemView.findViewById(R.id.idName);
            mAddress=itemView.findViewById(R.id.idAdress);
            mAvt=itemView.findViewById(R.id.idAvt);
            mCmt=itemView.findViewById(R.id.idCmt);
            mCmtCount=itemView.findViewById(R.id.idCmtCount);
            mImgCount=itemView.findViewById(R.id.idImageCount);

        }
    }
}
