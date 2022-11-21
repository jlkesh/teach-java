package uz.jl.teach.util;

import uz.jl.teach.models.Todo;

public class Utils {
    public static final String RED = "\033[1;91m";
    public static final String GREEN = "\033[1;92m";
    public static final String RESET = "\033[0m";


    public static String coloredTitle(Todo todo) {
        return (todo.isCompleted() ? RED : GREEN) + todo.getTitle() + RESET;
    }

}
