package com.example.android.miwok;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {
    private static final String LOG_TAG = WordAdapter.class.getSimpleName();
    int textAreaColor;

    public WordAdapter(Activity context, ArrayList<Word> words, int textAreaColor) {
        super(context, 0, words);
        this.textAreaColor = textAreaColor;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);

        TextView tvDefaultWord = listItemView.findViewById(R.id.default_text_view);
        TextView tvTranslatedWord = listItemView.findViewById(R.id.translated_text_view);
        ImageView ivImage = listItemView.findViewById(R.id.image_image_view);
        LinearLayout llTextArea = listItemView.findViewById(R.id.text_container);

        if (currentWord != null) {
            tvDefaultWord.setText(currentWord.getWordDefault());
            tvTranslatedWord.setText(currentWord.getWordTranslated());
            if (currentWord.getImageID() != 0)
                ivImage.setImageResource(currentWord.getImageID());
            else
                ivImage.setVisibility(View.GONE);
        }
        llTextArea.setBackgroundColor(llTextArea.getResources().getColor(textAreaColor));
        return listItemView;
    }
}
