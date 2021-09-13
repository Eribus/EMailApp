package com.example.email;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        RecyclerView mainRV;

        setContentView(R.layout.activity_main);                                                     // setzt die aktive activity xml

        MailListAdapter mailListAdapter = new MailListAdapter(createArrayList());                   // MailListAdapter Objekt wird erzeugt und die Arraylist wird erzeugt (createArrayList())

        mainRV = findViewById(R.id.mainRV);                                                         // RecylerView ID aus activity_main.xml wird mit RecylerView Java verbunden

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());// LayoutManager wird angelegt
        mainRV.setLayoutManager(layoutManager);                                                     // LayoutManger wird auf RecylerView gesetzt

        mainRV.setAdapter(mailListAdapter);                                                         // mailListAdapter wird auf RecylerView gsetzt

                                                                                                    // ListItem trenner wird angelegt
        RecyclerView.ItemDecoration itemDecoration = new DividerItemDecoration(getApplicationContext(), DividerItemDecoration.VERTICAL);
        mainRV.addItemDecoration(itemDecoration);
    }

    private ArrayList<ListItem> createArrayList() {                                                 // Methode zum füllen der ArrayList
        ArrayList<ListItem> mailItem = new ArrayList<>();
        for(int i = 1; i < 20; i++) {
            mailItem.add(new ListItem("Musterman"+i+"@hotmail.de","News","Nachricht "+i, Calendar.getInstance()));
        }
        return mailItem;
    }
}