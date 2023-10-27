package com.example.jithin.womensafety;



class ContactData {


    private String id, name, contact,type;


    public ContactData(String id, String name, String contact,String type) {
        this.id = id;
        this.name = name;
        this.contact = contact;
        this.type = type;
    }

    public String getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public String getContact() {
        return contact;
    }

    public String getType() {
        return type;
    }


}
