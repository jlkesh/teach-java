package uz.jl.teach.models;

import uz.jl.teach.util.Generator;

public class User {
    private String id;
    private String username;
    private String password;

    public User(String username, String password) {
        this(Generator.generateId(), username, password);
    }

    public User(String id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }
}
