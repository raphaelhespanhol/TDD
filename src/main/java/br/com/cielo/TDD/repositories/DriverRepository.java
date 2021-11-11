package br.com.cielo.TDD.repositories;

import br.com.cielo.TDD.entities.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;

@Repository
public interface DriverRepository extends JpaRepository<Driver, Long> {

    List<Driver> findAllByWashingDateBetween(final Timestamp start, final Timestamp end);

    Optional<Driver> findByNameIgnoreCase(String name);
}
