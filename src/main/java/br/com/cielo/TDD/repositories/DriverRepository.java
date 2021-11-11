package br.com.cielo.TDD.repositories;

import br.com.cielo.TDD.entities.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.List;

@Repository
public interface DriverRepository extends JpaRepository<Driver, Long> {

    List<Driver> findAllByName(final String name);

    @Query(value = "FROM Driver WHERE washingDate BETWEEN :start AND :end", nativeQuery = false)
    List<Driver> findAllByWashingDateBetweenCustomQuery(final Timestamp start, final Timestamp end);

    @Query(value = "SELECT * FROM DRIVER WHERE NAME LIKE %:name%", nativeQuery = true)
    Driver findByNameCustomQuery(final String name);

    List<Driver> findAllByWashingDateBetween(final Timestamp start, final Timestamp end);
}
