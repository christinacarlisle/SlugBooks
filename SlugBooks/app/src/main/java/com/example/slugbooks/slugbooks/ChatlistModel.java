package com.example.slugbooks.slugbooks;

public class ChatlistModel {
    public String id;

    public ChatlistModel(String id){
        this.id = id;
    }

    public ChatlistModel(){

    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }
}
