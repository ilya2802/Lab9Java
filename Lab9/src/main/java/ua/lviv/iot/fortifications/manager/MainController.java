package ua.lviv.iot.fortifications.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.fortifications.models.Fortifications;
import ua.lviv.iot.fortifications.models.Trench;


@RestController
@RequestMapping(path = "/demo")
public class MainController {
    @Autowired
    private FortificationRepository fortificationRepository;

    @GetMapping("/athletics")
    public Iterable<Fortifications> find() {
        return fortificationRepository.findAll();
    }

    @GetMapping("/athletics/{id}")
    public Fortifications findById(@PathVariable Integer id) {
        return fortificationRepository.findById(id).orElseThrow();
    }

    @PostMapping("/athletics")
    public Trench add(@RequestBody Trench newTrench) {
        return fortificationRepository.save(newTrench);
    }

    @PutMapping("/athletics/{id}")
    public Fortifications edit(@RequestBody Fortifications newFortifications, @PathVariable Integer id) {

        return fortificationRepository.findById(id).map(fortifications -> {
            fortifications.setLenght(newFortifications.getLenght());
            fortifications.setDepth(newFortifications.getDepth());
            fortifications.setTimeToBuild(newFortifications.getTimeToBuild());
            fortifications.setId(id);
            return fortificationRepository.save(newFortifications);
        }).orElseThrow();
    }

    @DeleteMapping("/athletics/{id}")
    public String delete(@PathVariable Integer id) {
        fortificationRepository.deleteById(id);
        return "Delete";
    }
}
