package uz.jl.teach.services;

import uz.jl.teach.dto.TodoPage;
import uz.jl.teach.models.Todo;
import uz.jl.teach.tables.TodoTable;

import java.util.Objects;

public class TodoService {
    public static TodoPage getPage(Integer pageNumber) {

        int size = 3;
        int totalSize = 6;
        int totalPageCount = totalSize / size;
        int currentPage = Objects.requireNonNullElse(pageNumber, 0);
        Todo[] todos = new Todo[size];

        todos[0] = TodoTable.todos[currentPage * size];
        todos[1] = TodoTable.todos[currentPage * size + 1];
        todos[2] = TodoTable.todos[currentPage * size + 2];

        return new TodoPage(totalPageCount,
                currentPage,
                currentPage != totalPageCount,
                currentPage != 0,
                todos
        );

    }
}
