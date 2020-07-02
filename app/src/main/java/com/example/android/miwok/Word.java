package com.example.android.miwok;

public class Word {
    private String wordsDefault;

    private String wordsTranslated;

    Word(String defaultWord, String translatedWord) {
        wordsDefault = defaultWord;
        wordsTranslated = translatedWord;
    }

    public String getWordDefault() {
        return wordsDefault;
    }

    public String getWordTranslated() {
        return wordsTranslated;
    }


}
