package com.mysite.core.bean;

public class ImageEntity {
    private String text;
    private String backgroundImage;

    private  String optionImageForDesktop;


    public ImageEntity(String text, String backgroundImage,String optionImageForDesktop){
        this.text = text;
        this.backgroundImage = backgroundImage;
        this.optionImageForDesktop=optionImageForDesktop;


    }

    public String getText() {
        return text;
    }


    public void setText(String text) {
        this.text = text;
    }

    public String getBackgroundImage() {
        return backgroundImage;
    }

    public void setBackgroundImage(String backgroundImage) {
        this.backgroundImage = backgroundImage;
    }

    public String getOptionImageForDesktop(){
        return optionImageForDesktop;
    }

    public void setOptionImageForDesktop(String optionImageForDesktop){
        this.optionImageForDesktop = optionImageForDesktop;
    }
}
