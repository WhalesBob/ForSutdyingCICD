package test.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class CICDStudyController {

    @RequestMapping
    public String helloCICD(){
        return "Hello AWS CICD World!";
    }
}
