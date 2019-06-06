package ua.lviv.iot.fortifications.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.fortifications.models.*;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class WriterTest {
    private List<Fortifications> fortifications = new LinkedList<>();

    @BeforeEach
    void setUp() {
        fortifications.add(new Trench(45, 65, 38, 21));
        fortifications.add(new Blindage(47.8,23, 55,
                CoveringType.FERROCONCRETE,3,47));
        fortifications.add(new Escarpment(29, 41, 19,4));
        fortifications.add(new Aperal(37, 87,16, 3));
        fortifications.add(new AntitankNadovb(46,37,31,MaterialType.CONCRETE));
    }

    @Test
    void testWriteToFile() {

        Writer writer = new Writer();
        try {
            writer.writeToFile(fortifications);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
