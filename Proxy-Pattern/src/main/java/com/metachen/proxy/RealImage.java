package com.metachen.proxy;

public class RealImage implements Image {
    private String imgname;

    public RealImage(String imgname) {
        this.imgname = imgname;
        loadFromDisk();
    }

    public void display() {
        System.out.println("Displaying:"+imgname);
    }

    private void loadFromDisk(){
        System.out.println("Loading:"+imgname);
    }
}
