package controllers;


import models.Task;
import models.User;
import play.data.validation.*;
import play.mvc.Controller;

import java.sql.Timestamp;
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
        task.project.id = Long.valueOf(1); //cheat line
        task.save();
        //render(task);
        displayall();
    }

    public static void displayall(){
        List<Task> listTasks = Task.find("ORDER BY urgent").fetch();
        List<User> listUsers = User.findAll();
        render(listTasks, listUsers);
    }

    public static void displayAllTable(){
        List<Task> listTasks = Task.find("ORDER BY urgent").fetch();

        render(listTasks);
    }

    public static void changeUserTask(Long taskId, Long userId){
        Task task = Task.findById(taskId);
        task.user = User.findById(userId);
        task.save();
        //displayall();
        redirect("/");
    }

    public static void changeStatusTask(Long taskId, Long tasId){
    //public static void afficher(){

    }

}
