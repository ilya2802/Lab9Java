package ua.lviv.iot.fortifications.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.fortifications.models.*;

import java.util.LinkedList;
import java.util.List;

class FortificationsManagerImplTest {

    private List<Fortifications> fortifications = new LinkedList();// створюється новий лист
    FortificationsManagerImpl manager = new  FortificationsManagerImpl(fortifications);

    @BeforeEach // виконується кожного разу перед виконанням тесту
    void setUp() {
        fortifications.add(new Trench(45, 65, 38, 21));// створюється обєкт для класу
        fortifications.add(new Blindage(47,23, 55,// створюється обєкт для класу
                CoveringType.FERROCONCRETE,3,47));// створюється обєкт для класу
        fortifications.add(new Escarpment(29, 41, 19,4));// створюється обєкт для класу
        fortifications.add(new Aperal(37, 87,16, 3));// створюється обєкт для класу
        fortifications.add(new AntitankNadovb(46,37,31,MaterialType.CONCRETE));// створюється обєкт для класу


    }

    @Test // тест для перевірки за часом
    void findItemsByTime() {
        List<Fortifications> result = manager.findItemsByTime(19);
        Assertions.assertEquals(1, result.size());
        Assertions.assertEquals(19, result.get(0).getTimeToBuild());
    }

    @Test
    void findItemsByLength() {
        List<Fortifications> result = manager.findItemsByLength(46);
        Assertions.assertEquals(1, result.size());
        Assertions.assertEquals(46, result.get(0).getLenght());
    }

    @Test
    void sortByDepth() {
        List<Fortifications> result = manager.sortByDepth(fortifications, true);
        Assertions.assertNotNull(result);
        for (int i = 1; i < result.size(); i++) {
            Assertions.assertTrue(result.get(i-1).getDepth() >= result.get(i).getDepth());
        }

    }

    @Test
    void sortByDepth2() {
        List<Fortifications> result = manager.sortByDepth(
                fortifications, false);
        Assertions.assertNotNull(result);
        for (int i = 1; i < result.size(); i++) {
            Assertions.assertTrue(result.get(i-1).getDepth()
                    <= result.get(i).getDepth());
        }

    }
}
