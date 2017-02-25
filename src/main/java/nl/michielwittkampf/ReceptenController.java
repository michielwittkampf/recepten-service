package nl.michielwittkampf;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReceptenController {

    private final Logger logger = LoggerFactory.getLogger(ReceptenController.class);

    @Autowired
    ReceptenService receptenService;

    @RequestMapping(value = "/", method = RequestMethod.GET, produces = "application/json")
    Iterable<Recept> getAllRecepten() {
        logger.info("Received request to get all recipes");
        return receptenService.getAll();
    }

    @RequestMapping(value = "/", method = RequestMethod.POST, consumes = "application/json")
    void add(@RequestBody Recept recept) {
        logger.info("Received request to add a recipe");
        receptenService.add(recept);
    }
}

