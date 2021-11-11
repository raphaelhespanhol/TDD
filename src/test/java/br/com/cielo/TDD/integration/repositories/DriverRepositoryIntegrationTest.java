package br.com.cielo.TDD.integration.repositories;

import br.com.cielo.TDD.entities.Driver;
import br.com.cielo.TDD.repositories.DriverRepository;
import br.com.cielo.TDD.unit.fixtures.DriverFixture;
import br.com.cielo.TDD.utils.DateUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityManager;
import javax.sql.DataSource;
import java.util.List;

@RunWith(SpringRunner.class)
@DataJpaTest
public class DriverRepositoryIntegrationTest {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private EntityManager entityManager;

    @Autowired
    private DriverRepository driverRepository;

    @Before
    public void injectedComponentsAreNotNull(){
        Assert.assertNotNull(dataSource);
        Assert.assertNotNull(jdbcTemplate);
        Assert.assertNotNull(entityManager);
        Assert.assertNotNull(driverRepository);
    }

    @Test
    public void whenSaved_thenVerifyIfExists() {
        driverRepository.save(DriverFixture.defaultValues());
        Assert.assertNotNull(driverRepository.findAll());
    }

    @Test
    public void whenSaved_thenFindsByName() {
        driverRepository.save(DriverFixture.defaultValues());
        final List<Driver> driverList = driverRepository.findAllByName("Raphael Hespanhol");

        Assert.assertNotNull(driverList);
        Assert.assertTrue(driverList.size() > 0);
        Assert.assertEquals(DriverFixture.defaultValues().getName(), driverList.get(0).getName());
    }

    @Test
    public void whenSaved_thenFindsByCustomName() {
        driverRepository.save(DriverFixture.defaultValues());
        final Driver driver = driverRepository.findByNameCustomQuery("Hespanhol");

        Assert.assertNotNull(driver);
        Assert.assertEquals(DriverFixture.defaultValues().getName(), driver.getName());
    }

    @Test
    public void whenSaved_thenFindAllByWashingDateBetweenCustomQuery() {
        driverRepository.save(DriverFixture.defaultValues());
        final List<Driver> driverList = driverRepository.findAllByWashingDateBetweenCustomQuery(
                DateUtils.getDateFirstDayOfTheMonth(),
                DateUtils.getDateNowToday());

        Assert.assertNotNull(driverList);
        Assert.assertTrue(driverList.size() > 0);
    }

    @Test
    public void whenSaved_thenFindAllByWashingDateBetween() {
        driverRepository.save(DriverFixture.defaultValues());
        final List<Driver> driverList = driverRepository.findAllByWashingDateBetween(
                DateUtils.getDateFirstDayOfTheMonth(),
                DateUtils.getDateNowToday());

        Assert.assertNotNull(driverList);
        Assert.assertTrue(driverList.size() > 0);
    }
}
