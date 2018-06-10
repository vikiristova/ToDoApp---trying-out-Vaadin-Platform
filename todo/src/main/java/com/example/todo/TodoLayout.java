package com.example.todo;

import com.vaadin.spring.annotation.SpringComponent;
import com.vaadin.ui.VerticalLayout;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import java.util.List;

@SpringComponent
public class TodoLayout extends VerticalLayout{

    @Autowired
    TodoRepository repo;

    @PostConstruct
    void init()
    {
        update();
    }
    public void add(Todo todo){
        repo.save(todo);
        update();
    }

    private void update() {
        setTodos(repo.findAll());
    }

    private void setTodos(List<Todo> all) {
    removeAllComponents();
    all.forEach(todo->addComponent(new TodoItemLayout(todo)));
    }

    public void deleteCompleted() {
        repo.deleteByDone(true);
        update();
    }
}
