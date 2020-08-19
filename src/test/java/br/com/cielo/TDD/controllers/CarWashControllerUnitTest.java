package br.com.cielo.TDD.controllers;

import br.com.cielo.TDD.usecases.CreateDriver;
import br.com.cielo.TDD.usecases.GetDriversWithHisOwnVehicle;
import br.com.cielo.TDD.usecases.GetGroupedVehicles;
import br.com.cielo.TDD.usecases.GetGroupedVehiclesByDate;
import br.com.cielo.TDD.usecases.GetGroupedWashesByDate;
import br.com.cielo.TDD.usecases.GetUberDrivers;
import br.com.cielo.TDD.usecases.UpdateDriver;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CarWashControllerUnitTest extends AbstractControllerTest {

    @InjectMocks
    private CarWashController carWashController;

    @Mock
    private CreateDriver createDriver;

    @Mock
    private GetDriversWithHisOwnVehicle driversWithHisOwnVehicle;

    @Mock
    private GetGroupedVehiclesByDate getGroupedVehiclesByDate;

    @Mock
    private GetGroupedVehicles getGroupedVehicles;

    @Mock
    private GetGroupedWashesByDate getGroupedWashesByDate;

    @Mock
    private GetUberDrivers getUberDrivers;

    @Mock
    private UpdateDriver updateDriver;

    @Test
    public void shouldCreateDriver() {

    }

    @Test
    public void shouldGetDriversWithHisOwnVehicle() {

    }

    @Test
    public void shouldGetGroupedVehiclesByDate() {

    }

    @Test
    public void shouldGetGroupedVehicles() {

    }

    @Test
    public void shouldGetGroupedWashesByDate() {

    }

    @Test
    public void shouldGetUberDrivers() {

    }

    @Test
    public void shouldUpdateDriver() {

    }
}
