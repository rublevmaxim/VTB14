package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@RequestMapping("/main")
public class MainController {
    @GetMapping("/index")
    public String doSomething(){
        System.out.println("!!!!!");
        return "index";
    }
//    @GetMapping("/hello")
//    @ResponseBody
//    public Cat helloRequest(){
//        return new Cat(1L,"БАРСИК","ЧЁРНЫЙ");
//    }

    @GetMapping("/hello")
    public String helloRequest(Model model){
        model.addAttribute("name", "Bob");
        return "hello";
    }




//    @GetMapping
//    public String index() {
//        return "index";
//    }
//
//    @GetMapping("/secured")
//    public String secured() {
//        return "index";
//    }
//
//   @GetMapping("/form")
//   public String showForm() {
//       return "simple-form";
//   }

//   @PostMapping("/form")
//   public String saveForm(@RequestParam(value = "name") String name, @RequestParam(value = "email") String email) {
//       System.out.println(name);
//       System.out.println(email);
//       return "redirect:/index";
//   }

//   @GetMapping("/index")
//   public String doSomething() {
//       return "index";
//   }

//   @GetMapping("/hello")
//   public String helloRequest(Model model, @RequestParam(value = "name") String name) {
//       model.addAttribute("name", name);
//       return "hello";
//   }

//   @GetMapping("/addcat")
//   public String showAddCatForm(Model model) {
//       Cat cat = new Cat(1L, null, null);
//       model.addAttribute("cat", cat);
//       return "cat-form";
//   }

//   @PostMapping("/addcat")
//   public String showAddCatForm(@ModelAttribute(value = "cat") Cat cat) {
//       System.out.println(cat.getId() + " " + cat.getName() + " " + cat.getColor());
//       return "redirect:/index";
//   }
}
