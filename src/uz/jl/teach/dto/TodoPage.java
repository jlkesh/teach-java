package uz.jl.teach.dto;

import uz.jl.teach.models.Todo;

import java.util.stream.IntStream;

public class TodoPage {
    private int totalPageCount;
    private boolean hashPrevious;
    private boolean hasNext;
    private int[] pages;
    private int currentPage;
    private Todo[] todos;

    public TodoPage(int totalPageCount, int currentPage, boolean hasNext, boolean hashPrevious, Todo[] todos) {
        this.totalPageCount = totalPageCount;
        this.hashPrevious = hashPrevious;
        this.hasNext = hasNext;
        this.pages = IntStream.range(0, totalPageCount).toArray();
        this.currentPage = currentPage;
        this.todos = todos;
    }

    public int getTotalPageCount() {
        return totalPageCount;
    }

    public void setTotalPageCount(int totalPageCount) {
        this.totalPageCount = totalPageCount;
    }

    public boolean isHashPrevious() {
        return hashPrevious;
    }

    public void setHashPrevious(boolean hashPrevious) {
        this.hashPrevious = hashPrevious;
    }

    public boolean isHasNext() {
        return hasNext;
    }

    public void setHasNext(boolean hasNext) {
        this.hasNext = hasNext;
    }

    public int[] getPages() {
        return pages;
    }

    public void setPages(int[] pages) {
        this.pages = pages;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public Todo[] getTodos() {
        return todos;
    }

    public void setTodos(Todo[] todos) {
        this.todos = todos;
    }
}
