package br.com.cielo.TDD.unit.usecases;

import br.com.cielo.TDD.repositories.DriverRepository;
import br.com.cielo.TDD.usecases.GetGroupedVehicles;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GetGroupedVehiclesUnitTest {

    @InjectMocks
    private GetGroupedVehicles getGroupedVehicles;

    @Mock
    private DriverRepository driverRepository;

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void shouldGetGroupedVehicles() {

    }
}
