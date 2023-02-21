package test.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mvc")
public class Hello {
    @RequestMapping("/hello")
    public  String  hello(){
        System.out.println("hello");
        return "hello";
    }

}
