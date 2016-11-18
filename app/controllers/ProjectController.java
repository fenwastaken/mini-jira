package controllers;

import java.util.List;

import models.Project;
import models.Task;
import play.data.validation.Required;
import play.mvc.Controller;

public class ProjectController extends Controller {
	public static void create(){ render(); }

    //add this back in the params once projects are manageable: @Required int idProject
    public static void save(@Required String name){
        if (validation.hasErrors()) {
            params.flash();
            validation.keep();
            create();
        }

        Task task = new Task();
        task.name = name;
        task.save();
        //render(Project);
        displayall();
    }

	public static void displayall(){
        List<Project> listProjects = Project.findAll();
        render(listProjects);
    }

    public static void changeProjectTask(){
        displayall();

    }
	
}
