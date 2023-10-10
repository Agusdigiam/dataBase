package dataBase.dataBase.Repository;

import dataBase.dataBase.Model.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<Empleado, Long> {

}
