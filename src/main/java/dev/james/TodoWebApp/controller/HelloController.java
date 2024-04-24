package dev.james.TodoWebApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("todoApp/v1/")
public class HelloController {


    @GetMapping("say-hello")
    @ResponseBody()
    public String sayHello(){
        return "Hello! What are you people learning today guys?";
    }

    @GetMapping("say-hello-html")
    @ResponseBody
    public String sayHelloHtml(){
        StringBuffer sb = new StringBuffer();
        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title>My first HTML Page</title>");
        sb.append("</head>");
        sb.append("<body>");
        sb.append("<h1>My first html page with body<h1>");
        sb.append("</body>");
        sb.append("<html>");

        return  sb.toString();
    }

    @GetMapping("say-hello-jsp")
    public String sayHelloJsp(){
        return "sayHello";
    }


    //JSP
    //Java Server Pages



}
