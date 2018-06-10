package com.example.todo;

import com.vaadin.data.Binder;
import com.vaadin.ui.*;
import com.vaadin.ui.themes.ValoTheme;
import org.h2.index.BaseIndex;

public class TodoItemLayout extends HorizontalLayout {
    private final CheckBox done;
    private final TextField text;
    public TodoItemLayout(Todo todo) {
        done=new CheckBox();
        text=new TextField();
        text.addStyleName(ValoTheme.TEXTFIELD_BORDERLESS);
        addComponents(done);
        addComponentsAndExpand(text);
        setDefaultComponentAlignment(Alignment.MIDDLE_LEFT);

        Binder<Todo> binder=new Binder<>(Todo.class);
        binder.bindInstanceFields(this);
        binder.setBean(todo);
    }

}
