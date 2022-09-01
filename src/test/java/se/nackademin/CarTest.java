package se.nackademin;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    Car car = new Car();

    @BeforeEach
    void init(){
        car.lightFull = true;
        car.regNr = "ABC123";
        car.light = true;
        car.lightOn = true;
        car.backLight = true;
        car.power = true;
        car.speed = 20;
        car.gears = 0;
    }

    @Test
    void checkRegNrTest(){
        assertEquals(6,car.regNr.length());
    }

    @Test
    void checkCarHasLightTest(){
        assertTrue(car.light);
    }

    @Test
    void checkIsLightOnTest(){
        if (car.power){
            assertTrue(car.lightOn);
        } else {
            assertFalse(car.lightOn);
        }
    }

    @Test
    void checkIfLightIsFullTest(){
        assertTrue(car.lightFull);
    }

    @Test
    void checkBackLightTest(){
        assertTrue(car.backLight);
    }

    @Test
    void accelerateTest(){
        car.accelerate();
        assertTrue(car.speed < 181 || car.speed > 0);
    }

    @Test
    void brakingTest(){
        car.braking();
        assertTrue(car.speed < 181 || car.speed > 0);
    }

    @Test
    void checkChangePowerTest(){
        car.onOff();
        assertFalse(car.lightOn);
    }

}