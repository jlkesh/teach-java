package uz.jl.teach;

import uz.jl.teach.dto.TodoPage;
import uz.jl.teach.models.Todo;
import uz.jl.teach.services.TodoService;

import java.util.Scanner;

public class ui {
    static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        TodoPage page = TodoService.getPage(1);

        for (Todo todo : page.getTodos()) {
            System.out.println(todo);
        }
        if (page.isHashPrevious())
            System.out.print("prev\t");
        for (int i = 0; i < page.getPages().length; i++) {
            System.out.print(i + "\t");
        }
        if (page.isHasNext())
            System.out.println("next");
    }
}
