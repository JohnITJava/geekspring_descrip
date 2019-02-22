package com.geekbrains.controllers;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormsController {
    @RequestMapping("/showSimpleForm")
    public String showSimpleForm() {
        return "myform";
    }

    //С myform отправить собранные данные на processform
    //
    @RequestMapping(path="/processForm", method=RequestMethod.GET)
    public String processForm() {
        return "myform-result";
    }

    //Вытащить параметр studentName из запроса
    //Передать в модель в другую вьюху
    @RequestMapping(path="/advProcessForm", method=RequestMethod.GET) 
    public String advProcessForm(@RequestParam("studentName") String studName, Model model) {
        studName = "Student: " + studName;
        model.addAttribute("attrStudName", studName);
        return "myform-result-adv";
    }
    
//    @RequestMapping(path="/advProcessForm", method=RequestMethod.GET)
//    public String advProcessForm(HttpServletRequest request, Model model) {
//        String studName = request.getParameter("studentName");
//        studName = "Student: " + studName;
//        model.addAttribute("attrStudName", studName);
//        return "myform-result-adv";
//    }
}
