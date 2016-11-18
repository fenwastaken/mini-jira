package controllers;


import models.Project;
import models.Status;
import models.Task;
import models.User;
import play.data.validation.*;
import play.mvc.Controller;

import java.util.List;

public class TaskController extends Controller{
    public static void create(){
        List<Project> listProjects = Project.findAll();
        List<Status> status = Status.findAll();
        render(listProjects, status); }

    //add this back in the params once projects are manageable: @Required int idProject
    public static void save(@Required String name, @Required String content, @Required Boolean urgent, @Required Long projectId){
        if (validation.hasErrors()) {
            params.flash();
            validation.keep();
            create();
        }

        Task task = new Task();
        task.name = name;
        task.content = content;
        task.urgent = urgent;
        task.project = Project.findById(projectId);
        task.save();
        //render(task);
        displayAll();
    }

    public void initTasks(List<Task> listTasks){

    }

    public static void displayAll(){
        List<Task> listTasks = Task.find("ORDER BY urgent").fetch();
        List<User> listUsers = User.findAll();
        render(listTasks, listUsers);
    }

    public static void displayAllTable(){
        List<Task> listTasks = Task.find("ORDER BY urgent").fetch();
        List<User> listUsers = User.findAll();
        //List<Status> listStatus = Status.findAll();
        render(listTasks, listUsers);
    }

    public static void changeUserTask(Long taskId, Long userId){
        Task task = Task.findById(taskId);
        task.user = User.findById(userId);
        task.save();
        displayAll();
        //displayall();
        redirect("/");
    }

    public static void changeStatusTask(Long taskId, Long tasId){
    //public static void afficher(){

    }

}
