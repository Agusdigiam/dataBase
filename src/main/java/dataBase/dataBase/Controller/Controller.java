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

    @GetMapping("/empleados")
    public List<Empleado> getEmpleados(){
        return repository.findAll();
    }
    @PostMapping(value ="/guardarempleados")
    public String guardarEmpleados(@RequestBody Empleado empleado){
        repository.save(empleado);
        return "Empleado Guardado en la Base de Datos.";

    }
    @DeleteMapping(value = "/borrarempleados")
    public String borrarEmpleado(@RequestBody Empleado empleado){
        repository.delete(empleado);
        return "Empleado Borrado Correctamente";
    }
}
