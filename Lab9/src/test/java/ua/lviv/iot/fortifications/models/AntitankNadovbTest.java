package ua.lviv.iot.fortifications.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AntitankNadovbTest {

    @Test
    void getKindOfMaterial() {
        AntitankNadovb antitankNadovb = new AntitankNadovb();
        antitankNadovb.setKindOfMaterial(MaterialType.TREE);
        assertEquals(MaterialType.TREE, antitankNadovb.getKindOfMaterial());
    }
}