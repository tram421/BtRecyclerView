package com.tram.btrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView mRecycleFoody;
    List<FoodyItem> mArrFoody;
    FoodyAdapter mAdapterFoody;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecycleFoody=findViewById(R.id.layoutRecyclerFoody);
//
//
        mArrFoody=FoodyItem.getmock();
//        mArrFoody=new ArrayList<>(Arrays.asList(
//
//                new FoodyItem("123","aaaa","asdaffsdfsdfsdfsfsef",R.drawable.hinhmon1,R.drawable.avt,12,22),
//                new FoodyItem("123","aaaa","asdaffsdfsdfsdfsfsef",R.drawable.hinhmon1,R.drawable.avt,12,22),
//                new FoodyItem("123","aaaa","asdaffsdfsdfsdfsfsef",R.drawable.hinhmon1,R.drawable.avt,12,22),
//                new FoodyItem("123","aaaa","asdaffsdfsdfsdfsfsef",R.drawable.hinhmon1,R.drawable.avt,12,22)
//        ));
        mAdapterFoody=new FoodyAdapter(mArrFoody);
        mRecycleFoody.setAdapter(mAdapterFoody);




    }
}