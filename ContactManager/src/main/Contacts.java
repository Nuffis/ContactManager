package main;

public class Contacts {
    private String id;
    private String name;
    private String phone;
    private String email;

    public Contacts(String id, String name, String phone, String email) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }
    
    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Phone: " + phone + ", Email: " + email;
    }
}