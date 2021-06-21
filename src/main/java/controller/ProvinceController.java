package controller;

import model.Customer;
import model.Province;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import service.province.IProvinceService;
import service.province.ProvinceService;

import java.util.List;

@Controller
public class ProvinceController {

//    private final IProvinceService provinceService;
//
//    public ProvinceController(IProvinceService provinceService) {
//        this.provinceService = provinceService;
//    }

//    @ModelAttribute("provinceList")
//    public List<Province> provinceList(){
//        return (List<Province>) provinceService.findAll();
//    }

//    @GetMapping("/province")
//    public ModelAndView showList(){
//        ModelAndView modelAndView = new ModelAndView("/province/list");
//        List<Province> provinceList = (List<Province>) this.provinceService.findAll();
//        modelAndView.addObject("provinces", provinceList);
//        return modelAndView;
//    }


}
