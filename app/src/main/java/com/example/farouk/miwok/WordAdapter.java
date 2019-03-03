package com.example.farouk.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class WordAdapter extends ArrayAdapter<Word> {

    private int mColorResourceId;


    public WordAdapter(Context context, ArrayList<Word> pWords,int ColorResourceId) {
        super(context,0, pWords);
        mColorResourceId=ColorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Word my_word= getItem(position);
        TextView miwokTextView =  listItemView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(my_word.getmMiwokTrnslation());
        TextView defaultTextView =  listItemView.findViewById(R.id.defult_text_view);
        defaultTextView.setText(my_word.getmDefultTrnslation());
        ImageView imageView = listItemView.findViewById(R.id.image_resource_id);
        if (my_word.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(my_word.getmImageResourceId());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }
        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);
        return listItemView;



    }
}
