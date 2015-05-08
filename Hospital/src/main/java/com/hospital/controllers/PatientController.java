package com.hospital.controllers;

import com.hospital.models.Drug;
import com.hospital.models.Patient;
import com.hospital.services.DrugService;
import com.hospital.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by kinyua on 5/5/15.
 */

@Controller
public class PatientController {
    @Autowired
    PatientService patientService;
    @Autowired
    DrugService drugService;

    @RequestMapping("/welcome")
    public String hello(Model model){

        model.addAttribute("message","HELLO WORLD");
        return "hello";
    }

    @RequestMapping("/index")
    public ModelAndView hello1(){

        ModelAndView model = new ModelAndView();
        model.addObject("msg","heey you are welcome");
        model.setViewName("hello");

        return model;
    }
    @RequestMapping("/drugs")
    public ModelAndView drugs(){

        ModelAndView model = new ModelAndView();
        model.addObject("msg", "heeeey you are welcome");
        model.setViewName("drugs");

        return model;
    }
    @RequestMapping("/create")
    public ModelAndView create(@RequestParam(value = "fname", required = false) String fname,
                       @RequestParam(value = "lname", required = false) String lname,
                       @RequestParam(value = "dob", required = false) String DoB){
        ModelAndView model = new ModelAndView();



            Patient patient = new Patient();
            patient.setFname(fname);
            patient.setLast_name(lname);
            patient.setDob(DoB);
            patientService.insertRow(patient);

        model.setViewName("hello");
        return model;
    }

    @RequestMapping("/enterDrug")
    public ModelAndView enterDrug(@RequestParam(value = "dname", required = false) String drugname){
        ModelAndView model = new ModelAndView();

        Drug drug = new Drug();
        drug.setDname(drugname);
        drugService.insertRowD(drug);
        model.setViewName("drugs");
        return model;
    }


    @RequestMapping("/list")
    public ModelAndView list()
    {
        ModelAndView model = new ModelAndView();
        model.addObject("msg", "Hello You Can enter the Drug details here");
        List<Patient> patientList =  patientService.getList();
        model.addObject("patientList", patientList);
        model.setViewName("drugs");
        return model;

    }
}
