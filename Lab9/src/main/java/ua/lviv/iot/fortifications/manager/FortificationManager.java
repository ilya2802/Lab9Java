package ua.lviv.iot.fortifications.manager;

import ua.lviv.iot.fortifications.models.Fortifications;

import java.util.List;

public interface FortificationManager {
    List<Fortifications> findItemsByTime(double timeToBuild);

    List<Fortifications> findItemsByLength(double lenght);

    List<Fortifications> sortByDepth(List<Fortifications> fortifications, boolean reverse);

}
