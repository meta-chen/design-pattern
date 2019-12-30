package com.metachen.proxy;

public class ProxyImage implements Image {

    private RealImage realImage;
    private String imgname;

    public ProxyImage(String imgname) {
        this.imgname = imgname;
    }

    public void display() {
        if(realImage == null){
            realImage = new RealImage(imgname);
        }
        realImage.display();
    }

}
