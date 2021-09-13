package com.example.email;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Calendar;


public class MailListAdapter extends RecyclerView.Adapter<MailListAdapter.MailViewHolder> {

    private ArrayList<ListItem> mainList;

    public MailListAdapter(ArrayList<ListItem> mainList) {
        this.mainList = mainList;                                                                                          // Konstruktor wird die ItemList ArrayList übergeben
    }

    @NonNull
    @Override
    public MailListAdapter.MailViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_list,parent,false);         // it takes an XML file as input and builds the View objects from it.
        return new MailViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MailListAdapter.MailViewHolder holder, int position) {                            // Füllt die Daten aus der arrayList in den ViewHolder
        ListItem listItem = mainList.get(position);                                                                         // aktuelle ListItem holen aus der ArrayList
        String time = "" + listItem.getCalendar().get(Calendar.HOUR) + ":" + listItem.getCalendar().get(Calendar.MINUTE) + ":" + listItem.getCalendar().get(Calendar.SECOND);
        String date = "" + listItem.getCalendar().get(Calendar.DAY_OF_MONTH) + "." + (listItem.getCalendar().get(Calendar.MONTH)+1) + "." + listItem.getCalendar().get(Calendar.YEAR);
        String count = "" + listItem.getCount();
        String betreff = "" + listItem.getBetreff();
        String sender = "" + listItem.getSender();

        holder.timeTV.setText(time);
        holder.dateTV.setText(date);
        holder.count_outputTV.setText(count);
        holder.betreff_outputTV.setText(betreff);
        holder.senderTV.setText(sender);
    }

    @Override
    public int getItemCount() {                                                                                             // Gibt die Anzahl der Datensätze zurück
        return mainList.size();
    }

    public class MailViewHolder extends RecyclerView.ViewHolder {

        public TextView senderTV,betreff_outputTV,count_outputTV, timeTV, dateTV;                                           // Java TextView's deklarieren

        public MailViewHolder(@NonNull View itemView) {
            super(itemView);                                                                                                // Konstruktor von RecyclerView.ViewHolder aufrufen

            senderTV = itemView.findViewById(R.id.tv_sender);                                                               // verbinden der Java TextViews mit den XML TextViews
            betreff_outputTV = itemView.findViewById(R.id.tv_betreff_output);
            count_outputTV = itemView.findViewById(R.id.tv_count_output);
            timeTV = itemView.findViewById(R.id.tv_time);
            dateTV = itemView.findViewById(R.id.tv_date);
        }
    }
}
