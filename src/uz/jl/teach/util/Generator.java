package uz.jl.teach.util;

import java.util.UUID;

public class Generator {

    public static String generateId() {
        return UUID.randomUUID().toString();
    }

}
