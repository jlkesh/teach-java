package uz.jl.teach.models;

import uz.jl.teach.enums.Category;
import uz.jl.teach.enums.Priority;
import uz.jl.teach.util.Generator;
import uz.jl.teach.util.Utils;

public class Todo {
    private String id;
    private String title;
    private Category category;
    private Priority priority;
    private boolean completed;


    public Todo(String title) {
        this(Generator.generateId(), title);
    }

    public Todo(String id, String title) {
        this(id, title, Category.DEFAULT, Priority.LOW);
    }

    public Todo(String title, Category category, Priority priority) {
        this(Generator.generateId(), title, category, priority);
    }

    public Todo(String id, String title, Category category, Priority priority) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.priority = priority;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    @Override
    public String toString() {

        return "%s - %30s - %s ".formatted(
                this.category.getEmoji(),
                Utils.coloredTitle(this),
                this.priority.getEmoji());
    }
}
