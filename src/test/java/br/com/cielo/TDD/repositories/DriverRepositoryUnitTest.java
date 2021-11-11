package br.com.cielo.TDD.repositories;

import br.com.cielo.TDD.entities.Driver;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DriverRepositoryUnitTest {

    @Autowired
    private DriverRepository driverRepository;

    @Test
    public void shouldFindDriverByName() {
        Optional<Driver> driver = driverRepository.findByNameIgnoreCase("vALenTiNA");

        assertTrue(driver.isPresent());
        assertEquals("Valentina", driver.get().getName());
        assertEquals(10L, driver.get().getId().longValue());
    }

}
