package commision.mvc.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HelloWorldController {

    @RequestMapping(method = RequestMethod.GET)
    public String index(){
        return "index";
    }

    @GetMapping("/products")
    public String products(){
        return "products";
    }

//    @RequestMapping(method = RequestMethod.GET)
//    public String sayHello(ModelMap model) {
//        model.addAttribute("greeting", "Hello World from Spring 4 MVC bla bla bla");
//        return "index";
//    }
//
//    @RequestMapping(value = "/helloagain", method = RequestMethod.GET)
//    public String sayHelloAgain(ModelMap model) {
//        model.addAttribute("greeting", "Hello World Again, from Spring 4 MVC");
//        return "welcome";
//    }
//
//    @RequestMapping(value = "/form", method = RequestMethod.GET)
//    public String uploadPage(){
//        return "form";
//    }
//
//    @RequestMapping(value = "/save", method = RequestMethod.POST)
//    public String getForm(@ModelAttribute Company company){
//        System.out.println("Company info: " + company.toString());
//        return "ok";
//    }
//
//    @RequestMapping(value = "/upload", method = RequestMethod.GET)
//    public String uploadFile(){
//        return "uploadfile";
//    }
}