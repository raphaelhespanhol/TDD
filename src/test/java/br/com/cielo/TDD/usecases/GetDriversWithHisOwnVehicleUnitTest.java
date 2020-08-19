package br.com.cielo.TDD.usecases;

import br.com.cielo.TDD.repositories.DriverRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GetDriversWithHisOwnVehicleUnitTest {

    @InjectMocks
    private GetDriversWithHisOwnVehicle getDriversWithHisOwnVehicle;

    @Mock
    private DriverRepository driverRepository;

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void shouldGetDriversWithHisOwnVehicle() {

    }
}
