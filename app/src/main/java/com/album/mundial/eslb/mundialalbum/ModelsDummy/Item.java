package com.album.mundial.eslb.mundialalbum.ModelsDummy;

public class Item {

    private int mImageId;
    private String mText;

    public Item() {
    }

    public Item(int mImageId, String mText) {
        this.mImageId = mImageId;
        this.mText = mText;
    }

    public Item(String mText) {
        this.mText = mText;
        this.mImageId = 0;
    }

    public int getmImageId() {
        return mImageId;
    }

    public void setmImageId(int mImageId) {
        this.mImageId = mImageId;
    }

    public String getmText() {
        return mText;
    }

    public void setmText(String mText) {
        this.mText = mText;
    }
}
