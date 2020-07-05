package com.example.android.miwok;


public class Word {
    private String mDefaultWord;

    private String mTranslatedWord;

    private int mImageID;

    private int mAudioID;


    /**
     * Create a new Word object with a Image and Audio file
     *
     * @param mDefaultWord    is the word in a language that the user is already familiar with (such as English)
     * @param mTranslatedWord is the word in a language that the user is trying to learn
     * @param mImageID        is the location of the image (R.drawable.whatever)
     * @param mAudioID        is the lcoation of the audio file (R.raw.whatever)
     */
    public Word(String mDefaultWord, String mTranslatedWord, int mImageID, int mAudioID) {
        this.mDefaultWord = mDefaultWord;
        this.mTranslatedWord = mTranslatedWord;
        this.mImageID = mImageID;
        this.mAudioID = mAudioID;
    }

    /**
     * Create a new Word object with a Audio file
     *
     * @param mDefaultWord    is the word in a language that the user is already familiar with (such as English)
     * @param mTranslatedWord is the word in a language that the user is trying to learn
     * @param mAudioID        is the lcoation of the audio file (R.raw.whatever)
     */
    Word(String mDefaultWord, String mTranslatedWord, int mAudioID) {
        this.mDefaultWord = mDefaultWord;
        this.mTranslatedWord = mTranslatedWord;
        this.mAudioID = mAudioID;
    }

    /**
     * Create a new Word object
     *
     * @param mDefaultWord    is the word in a language that the user is already familiar with (such as English)
     * @param mTranslatedWord is the word in a language that the user is trying to learn
     */
    public Word(String mDefaultWord, String mTranslatedWord) {
        this.mDefaultWord = mDefaultWord;
        this.mTranslatedWord = mTranslatedWord;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultWord='" + mDefaultWord + '\'' +
                ", mTranslatedWord='" + mTranslatedWord + '\'' +
                ", mImageID=" + mImageID +
                ", mAudioID=" + mAudioID +
                '}';
    }

    /**
     * Get the location of where the audio file for the current word is stored.
     *
     * @return R.raw.whatever
     */
    public int getAudioID() {
        return mAudioID;
    }

    /**
     * Get the location of where the image file for the current word is stored.
     *
     * @return R.drawable.whatever
     */
    public int getImageID() {
        return mImageID;
    }

    /**
     * Get the String of the current word in the default language
     *
     * @return "One"
     */
    public String getWordDefault() {
        return mDefaultWord;
    }

    /**
     * Get the String of the current word in the language you're trying to learn.
     *
     * @return "lutti"
     */
    public String getWordTranslated() {
        return mTranslatedWord;
    }


}
