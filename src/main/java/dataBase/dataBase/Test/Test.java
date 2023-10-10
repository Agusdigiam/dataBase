package dataBase.dataBase.Test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class Test {
    @GetMapping("/test")
    List<String> Test(){
        return List.of("Funcionando en puerto 4000" , "Estado: 200 Ok");
    }

}
