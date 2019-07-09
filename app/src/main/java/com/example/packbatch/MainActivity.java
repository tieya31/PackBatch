package com.example.packbatch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private String[] OrderID = new String[]{"123", "444", "565", "778", "888","123","588"};
    private String[] Status = new String[]{"3", "4", "2", "1", "5","8","2"};
    private String[] PickBy = new String []{"A", "B", "C", "D", "E", "h", "n"};
    private String[] Packed = new String[] {"","","","","","",""};
    private ArrayList<PackModel> packModelArrayList;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        packModelArrayList = populateList();

        PackAdapter packAdapter = new PackAdapter(this,packModelArrayList);
        listView.setAdapter(packAdapter);

    }

    private ArrayList<PackModel> populateList(){

        ArrayList<PackModel> list = new ArrayList<>();

        for(int i = 0; i < 7; i++){
            PackModel packModel = new PackModel();
            packModel.setOrderID(OrderID[i]);
            packModel.setStatus(Status[i]);
            packModel.setPickby(PickBy[i]);
            packModel.setPacked(Packed[i]);
            list.add(packModel);
        }

        return list;
    }
}