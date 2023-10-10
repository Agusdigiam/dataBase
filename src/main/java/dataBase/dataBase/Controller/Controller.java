package dataBase.dataBase.Controller;

import dataBase.dataBase.Model.Empleado;
import dataBase.dataBase.Repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    private Repository repository;

    //Para Obtener los empleados usamos el metodo Get

    @GetMapping("/empleados")
    public List<Empleado> getEmpleados(){
        return repository.findAll();
    }


    //Para Guardar un Usuario, usamos el metodo Post
    @PostMapping(value ="/guardarempleados")
    public String guardarEmpleados(@RequestBody Empleado empleado){
        repository.save(empleado);
        return "Empleado Guardado Correctamente en la Base de Datos.";

    }

    //Para Borrar un Usuario, usamos el metodo Delete
    @DeleteMapping(value = "/borrarempleados")
    public String borrarEmpleado(@RequestBody Empleado empleado){
        repository.delete(empleado);
        return "Empleado Borrado Correctamente de la Base de Datos";
    }
}
