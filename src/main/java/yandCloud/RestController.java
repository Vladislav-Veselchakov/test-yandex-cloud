package yandCloud;

import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestControllerж

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("/admin")
    public String mainPage() {

        return "Hello admin";
    }
}
