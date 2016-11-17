package controllers;


import models.Task;
import play.data.validation.*;
import play.mvc.Controller;

import java.util.ArrayList;
import java.util.List;

public class TaskController extends Controller{
    public static void create(){ render(); }

    public static void save(@Required String name, @Required String content, @Required Boolean urgent){
        if (validation.hasErrors()) {
            params.flash();
            validation.keep();
            create();
        }

        Task task = new Task();
        task.name = name;
        task.content = content;
        task.urgent = urgent;
        task.save();
        //render(task);
        displayall();
    }

    public static void displayall(){
        List<Task> listTasks = Task.findAll();
        render(listTasks);
    }

    public static void afficher(){

    }

}
