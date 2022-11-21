package uz.jl.teach.tables;

import uz.jl.teach.enums.Category;
import uz.jl.teach.enums.Priority;
import uz.jl.teach.models.Todo;

public class TodoTable {
    public static final Todo[] todos = new Todo[100];

    static {
        todos[0] = new Todo("Read a Book");
        todos[1] = new Todo("Watch a Movie", Category.ENTERTAINMENT, Priority.MEDIUM);
        todos[2] = new Todo("Google social", Category.STUDY, Priority.HIGH);
        todos[3] = new Todo("Learn Java", Category.STUDY, Priority.HIGH);
        todos[4] = new Todo("Read Oracle Official guid", Category.STUDY, Priority.HIGH);
        todos[5] = new Todo("Watch Witcher season 2", Category.STUDY, Priority.LOW);
        todos[6] = new Todo("Read Spring in action", Category.STUDY, Priority.MEDIUM);
    }

}
