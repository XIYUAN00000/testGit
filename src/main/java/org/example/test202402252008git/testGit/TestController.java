package org.example.test202402252008git.testGit;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping("/GitTest")
    public String GitTest(){
        return "Git";
    }
}
