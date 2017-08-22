package pl.krzysztof4it.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Krzysztof on 2017-07-28.
 */
@Controller
public class HomeController {



    @GetMapping("/")
    public String index(ModelMap modelMap){
        modelMap.put("text", "Krzysztof");
        return "Hello"; // print Hello
    }



}
