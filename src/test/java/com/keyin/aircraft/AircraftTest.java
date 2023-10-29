package com.keyin.aircraft;
import com.keyin.entity.aircraft.Aircraft;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AircraftTest {
    private final Aircraft aircraft1 = new Aircraft();
    private final Aircraft aircraft2 = new Aircraft();

    private void setupAircraft1() {
        aircraft1.setId(1L);
        aircraft1.setType("Test Aircraft 1");
        aircraft1.setAirlineName("Test Airline 1");
        aircraft1.setNumberOfPassengers(50);
    }

    private void setupAircraft2() {
        aircraft2.setId(2L);
        aircraft2.setType("Test Aircraft 2");
        aircraft2.setAirlineName("Test Airline 2");
        aircraft2.setNumberOfPassengers(55);
    }

    @Test
    public void testAircraft1() {
        setupAircraft1();
        Assertions.assertEquals(1L, aircraft1.getId(),
                "1 expected for aircraft.id");
        Assertions.assertEquals("Test Aircraft 1", aircraft1.getType(),
                "Test Aircraft expected for aircraft.type");
        Assertions.assertEquals("Test Airline 1", aircraft1.getAirlineName(),
                "Test Airline expected for aircraft.airlineName");
        Assertions.assertEquals(50, aircraft1.getNumberOfPassengers(),
                "50 expected for aircraft.numberOfPassengers");
    }
    @Test
    public void testAircraft2() {
        setupAircraft2();
        Assertions.assertEquals(2L, aircraft2.getId(),
                "'2' expected for aircraft.id");
        Assertions.assertEquals("Test Aircraft 2", aircraft2.getType(),
                "'Test Aircraft 2' expected for aircraft.type");
        Assertions.assertEquals("Test Airline 2", aircraft2.getAirlineName(),
                "'Test Airline 2' expected for aircraft.airlineName");
        Assertions.assertEquals(55, aircraft2.getNumberOfPassengers(),
                "'55' expected for aircraft.numberOfPassengers");
    }

    @Test
    public void testAircraft1NotEqualAircraft2() {
        setupAircraft1();
        setupAircraft2();
        Assertions.assertNotEquals(aircraft1.getId(), aircraft2.getId());
        Assertions.assertNotEquals(aircraft1.getType(), aircraft2.getType());
        Assertions.assertNotEquals(aircraft1.getAirlineName(), aircraft2.getAirlineName());
        Assertions.assertNotEquals(aircraft1.getNumberOfPassengers(), aircraft2.getNumberOfPassengers());
        Assertions.assertNotEquals(aircraft1, aircraft2);
    }

    @Test
    public void testNegativeAircraftId() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            aircraft1.setId(-1L);
        });

    }
}
