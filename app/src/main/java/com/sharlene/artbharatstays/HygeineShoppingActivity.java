package com.sharlene.artbharatstays;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.sharlene.artbharatstays.adapter.ReviewAdapter;
import com.sharlene.artbharatstays.adapter.RoomAdapter;
import com.sharlene.artbharatstays.adapter.SubCategoryAdapter;

import java.util.ArrayList;

public class HygeineShoppingActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<String> source;
    RecyclerView.LayoutManager RecyclerViewLayoutManager;
    RecyclerView.Adapter adapter;
    LinearLayoutManager HorizontalLayout;

    CardView pic1, pic2, pic3, pic4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.hygiene_shopping_activity);

        pic1=findViewById(R.id.picture1);
        pic2=findViewById(R.id.picture2);
        pic3=findViewById(R.id.picture3);
        pic4=findViewById(R.id.picture4);

        AddItemsToRecyclerViewArrayList();

        RecyclerView recyclerView = findViewById(R.id.shopping_list);
        GridLayoutManager linearLayoutManager =  new GridLayoutManager(getApplicationContext(),2);
        recyclerView.setLayoutManager(linearLayoutManager);
        String[] strings={"jack","max","josh","stuart"};
        SubCategoryAdapter adapter=new SubCategoryAdapter(source);
        recyclerView.setAdapter(adapter);

        pic1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AddItems1();
                RecyclerView recyclerView = findViewById(R.id.shopping_list);
                GridLayoutManager linearLayoutManager =  new GridLayoutManager(getApplicationContext(),2);
                recyclerView.setLayoutManager(linearLayoutManager);
                String[] strings={"jack","max","josh","stuart"};
                SubCategoryAdapter adapter=new SubCategoryAdapter(source);
                recyclerView.setAdapter(adapter);
            }
        });

        pic2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AddItems2();
                RecyclerView recyclerView = findViewById(R.id.shopping_list);
                GridLayoutManager linearLayoutManager =  new GridLayoutManager(getApplicationContext(),2);
                recyclerView.setLayoutManager(linearLayoutManager);
                String[] strings={"cake","toffee","tea","donut"};
                SubCategoryAdapter adapter=new SubCategoryAdapter(source);
                recyclerView.setAdapter(adapter);

            }
        });
        pic3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AddItems3();
                RecyclerView recyclerView = findViewById(R.id.shopping_list);
                GridLayoutManager linearLayoutManager =  new GridLayoutManager(getApplicationContext(),2);
                recyclerView.setLayoutManager(linearLayoutManager);
                SubCategoryAdapter adapter=new SubCategoryAdapter(source);
                recyclerView.setAdapter(adapter);
            }
        });
        pic4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AddItems4();
                RecyclerView recyclerView = findViewById(R.id.shopping_list);
                GridLayoutManager linearLayoutManager =  new GridLayoutManager(getApplicationContext(),2);
                recyclerView.setLayoutManager(linearLayoutManager);
                SubCategoryAdapter adapter=new SubCategoryAdapter(source);
                recyclerView.setAdapter(adapter);
            }
        });
    }
    public void AddItemsToRecyclerViewArrayList()
    {
        // Adding items to ArrayList
        source = new ArrayList<>();
        source.add("Mumbai");
        source.add("Pune");
        source.add("Chennai");
        source.add("Delhi");
        source.add("Bengaluru");
        source.add("Kolkata");
        source.add("Jaipur");
    }
    public void AddItems1()
    {
        // Adding items to ArrayList
        source = new ArrayList<>();
        source.add("Hill");
        source.add("Lake");
        source.add("Boating");
        source.add("Snow");
        source.add("Scuba Diving");
    }
    public void AddItems2()
    {
        // Adding items to ArrayList
        source = new ArrayList<>();
        source.add("max");
        source.add("josh");
        source.add("jacky");
        source.add("maxwell");
        source.add("sprinting");
    }
    public void AddItems3()
    {
        // Adding items to ArrayList
        source = new ArrayList<>();
        source.add("Hill");
        source.add("Lake");
        source.add("Boating");
        source.add("Snow");
        source.add("Scuba Diving");
    }
    public void AddItems4()
    {
        // Adding items to ArrayList
        source = new ArrayList<>();
        source.add("Activity");
        source.add("layout");
        source.add("build");
        source.add("terminal");
        source.add("todo");
    }
}