package nl.michielwittkampf;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReceptenServiceController {

    @RequestMapping("/")
    String getAllRecepten() {
        return "Hello World!";
    }
}

