package ua.lviv.iot.fortifications.manager;

import org.springframework.data.repository.CrudRepository;
import ua.lviv.iot.fortifications.models.Fortifications;

public interface FortificationRepository extends CrudRepository<Fortifications, Integer> {
}
