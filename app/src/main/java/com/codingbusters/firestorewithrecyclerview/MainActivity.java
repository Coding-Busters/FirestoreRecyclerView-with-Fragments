package com.codingbusters.firestorewithrecyclerview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.firebase.ui.firestore.FirestoreRecyclerAdapter;
import com.firebase.ui.firestore.FirestoreRecyclerOptions;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.Query;

public class MainActivity extends AppCompatActivity {

//    private RecyclerView mFirestor_list;
//    private FirebaseFirestore firebaseFirestore;
//    private FirestoreRecyclerAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction().replace(R.id.wrapper,new ProductFragment()).commit();
//        firebaseFirestore = FirebaseFirestore.getInstance();
//        mFirestor_list = findViewById(R.id.firestore_list);
//
//        Query query = firebaseFirestore.collection("Products");
//        FirestoreRecyclerOptions<ProductsModel> options = new FirestoreRecyclerOptions.Builder<ProductsModel>()
//                .setQuery(query,ProductsModel.class)
//                .build();
//         adapter = new FirestoreRecyclerAdapter<ProductsModel, ProductsViewHolder>(options) {
//            @NonNull
//            @Override
//            public ProductsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_single,parent,false);
//                return new ProductsViewHolder(view);
//            }
//
//            @Override
//            protected void onBindViewHolder(@NonNull ProductsViewHolder holder, int position, @NonNull ProductsModel model) {
//                holder.list_name.setText(model.getName());
//                holder.list_desc.setText(model.getPrice()+"");
//            }
//        };
//
//         mFirestor_list.setHasFixedSize(true);
//         mFirestor_list.setLayoutManager(new LinearLayoutManager(this));
//         mFirestor_list.setAdapter(adapter);

    }
//    private class ProductsViewHolder extends RecyclerView.ViewHolder{
//
//        private TextView list_name , list_desc;
//        public ProductsViewHolder(@NonNull View itemView) {
//            super(itemView);
//            list_name = itemView.findViewById(R.id.list_name);
//            list_desc = itemView.findViewById(R.id.list_price);
//        }
//    }
//
//    @Override
//    protected void onStart() {
//        super.onStart();
//        adapter.startListening();
//    }
//
//    @Override
//    protected void onStop() {
//        super.onStop();
//        adapter.stopListening();
//    }
}