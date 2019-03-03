package com.example.farouk.miwok;

public class Word {
    private String mDefultTrnslation;
    private String mMiwokTrnslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int mAudioResourceId;

    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId) {
        mDefultTrnslation = defaultTranslation;
        mMiwokTrnslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }
    public Word(String defultTrnslation,String miwokTrnslation, int ImageResourceId , int audioResourceId){
        mDefultTrnslation=defultTrnslation;
        mMiwokTrnslation=miwokTrnslation;
        mImageResourceId=ImageResourceId;
        mAudioResourceId = audioResourceId;
    }
    public String getmMiwokTrnslation(){
        return mMiwokTrnslation;
    }
    public String getmDefultTrnslation(){
        return mDefultTrnslation;
    }
    public int getmImageResourceId(){return mImageResourceId;}
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
    public int getAudioResourceId(){return mAudioResourceId;}
}
