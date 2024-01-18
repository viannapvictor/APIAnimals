package br.com.victor.animalservice.repositorios;

import br.com.victor.animalservice.entidades.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.sql.Date;
import java.util.List;
import java.util.Objects;

public interface AnimalRepository extends JpaRepository<Animal, Integer> {
    @Query("SELECT a FROM Animal a WHERE a.dataAdocao is NULL order by a.dataEntrada asc ")
    List<Animal> findNotAdopted();

    @Query("SELECT a FROM Animal a WHERE a.dataAdocao is Not NULL")
    List<Animal> findAdopted();

    @Query("SELECT a.nomeRecebedor, COUNT(a.id) " +
            "FROM Animal a " +
            "WHERE a.dataEntrada BETWEEN DATE_SUB(CURRENT_DATE, 1, 'YEAR') AND CURRENT_DATE " +
            "GROUP BY a.nomeRecebedor")
    List<Object[]> countRescuedAnimalsByPerson();
}
