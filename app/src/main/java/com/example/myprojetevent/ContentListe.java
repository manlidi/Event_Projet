package com.example.myprojetevent;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

public class ContentListe extends RecyclerView.Adapter<ContentListe.ViewHolder> {

    private Context context;
    private List<Event> events;

    public ContentListe(Context context, List<Event> events){
        this.context = context;
        this.events = events;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater inflater= LayoutInflater.from(context);
        view = inflater.inflate(R.layout.activity_content_liste, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.eventTitle.setText(events.get(position).getTitle());
        holder.eventDescription.setText(events.get(position).getDescription());
        Glide.with(context)
                .load(events.get(position).getCoverImage())
                .into(holder.CoverImage);    }

    @Override
    public int getItemCount() {
        return events.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView eventTitle,eventDescription;
        ImageView CoverImage;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            eventTitle = itemView.findViewById(R.id.eventTitle);
            eventDescription = itemView.findViewById(R.id.eventDescription);
            CoverImage = itemView.findViewById(R.id.coverImage);

        }
    }
}