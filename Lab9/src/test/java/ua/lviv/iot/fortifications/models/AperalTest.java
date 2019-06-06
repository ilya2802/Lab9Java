package ua.lviv.iot.fortifications.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AperalTest {

    @Test
    void getAngleOfInclination() {
            Aperal aperal = new Aperal();
            aperal.setAngleOfInclination(44);
            assertEquals(44, aperal.getAngleOfInclination());
        }
    }