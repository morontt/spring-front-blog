package info.morontt.spring_blog.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {

    @RequestMapping("/")
    String home() {
        return "New Hello World!";
    }
}
