package br.com.cielo.TDD.unit.utils;

import br.com.cielo.TDD.utils.DateUtils;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertNotNull;

@SpringBootTest
public class DateUtilsUnitTest {

    @Test
    public void shouldGetDateToday() {
        assertNotNull(DateUtils.getDateNowToday());
    }

    @Test
    public void shouldGetFirstDayThisWeek() {
        assertNotNull(DateUtils.getDateFirstDayThisWeek());
    }

    @Test
    public void shouldGetFirstHourThisDay() {
        assertNotNull(DateUtils.getFirstHourThisDay());
    }

    @Test
    public void shouldGetFirstDayThisMonth() {
        assertNotNull(DateUtils.getDateFirstDayOfTheMonth());
    }
}
