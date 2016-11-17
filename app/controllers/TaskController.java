package controllers;


import models.Task;
import play.data.validation.*;
import play.mvc.Controller;

import java.util.ArrayList;
import java.util.List;

public class TaskController extends Controller{
    public static void create(){ render(); }

    //add this back in the params once projects are manageable: @Required int idProject
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
        task.idProject = 1; //cheat line
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
