package ua.lviv.iot.fortifications.manager;

import ua.lviv.iot.fortifications.models.Fortifications;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FortificationsManagerImpl implements FortificationManager {

    private List<Fortifications> fortifications; // створюється новий список

    public void setFortifications(final List<Fortifications> fortifications) { // функція
        this.fortifications = fortifications; // вказівник на список в 12 рядку
    }

    public FortificationsManagerImpl(
            final List<Fortifications> fortifications) {
        this.fortifications = fortifications;
    }

    @Override// вказує на те що ми хочемо перевизначити метод базового класу
    public List<Fortifications> findItemsByTime(final double timeToBuild) {
        List<Fortifications> result = new ArrayList<>(); // це список який дуже похожий на масив але має цілий ряд методів
        fortifications.stream().filter(fortifications1 ->// один з методів .stream().filter приймає лямда вираз відомий як предикат.
                // Фільтр () є проміжною операцією, яка зчитує дані з потоку і повертає новий потік
                fortifications1.getTimeToBuild()// отримується кількість часу
                == timeToBuild).forEach(fortifications1 ->// For each використовується для того щоб перебрати елементи масива або колекції
                //лямда ділить функію на дві частини скорочений запис функції
                result.add(fortifications1));
        return result; // повертає результат
    }

    @Override
    public List<Fortifications> findItemsByLength(final double lenght) {
        List<Fortifications> result = new ArrayList<>();
        fortifications.stream().filter(fortifications1 ->
                fortifications1.getLenght()
                == lenght).forEach(fortifications1 -> // Лямда
                result.add(fortifications1));// в лист додаються відфільтровані значення
        return result;
    }

    @Override
    public List<Fortifications> sortByDepth(final List<Fortifications> fortifications,
                            final boolean reverse) {

        if (reverse) {
            Collections.sort(fortifications, Comparator.
                    comparing(Fortifications::getDepth).
                    reversed());
        } else {
            Collections.sort(fortifications, Comparator.
                    comparing(Fortifications::getDepth));
        }

        return fortifications;
    }

}
