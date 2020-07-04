package com.example.android.miwok;

public class Word {
    private String mDefaultWord;

    private String mTranslatedWord;

    private int mImageID;

    Word(String defaultWord, String translatedWord) {
        this.mDefaultWord = defaultWord;
        this.mTranslatedWord = translatedWord;

    }

    Word(String defaultWord, String translatedWord, int imageID) {
        this.mDefaultWord = defaultWord;
        this.mTranslatedWord = translatedWord;
        this.mImageID = imageID;
    }

    public String getWordDefault() {
        return mDefaultWord;
    }

    public String getWordTranslated() {
        return mTranslatedWord;
    }

    public int getImageID() {
        return mImageID;
    }

}
