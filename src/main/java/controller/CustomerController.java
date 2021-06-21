package controller;

import model.Customer;
import model.Province;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import service.customer.ICustomerService;
import service.province.IProvinceService;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {

   @Autowired
   private ICustomerService customerService;

   @Autowired
   private IProvinceService provinceService;

    @ModelAttribute("provinceList")
    public Iterable<Province> provinceList(){
        return  provinceService.findAll();
    }

    @GetMapping("")
    public ModelAndView showListCustomer(){
        ModelAndView modelAndView = new ModelAndView("/list");
        List<Customer> customerList = this.customerService.findAll();
        modelAndView.addObject("customerList", customerList);
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView showFormCreate(){
        ModelAndView modelAndView = new ModelAndView("/create");
        modelAndView.addObject("customer", new Customer());
        return modelAndView;
    }

    @PostMapping("/create")
    public ModelAndView checkValidation(@Validated @ModelAttribute("customer") Customer customer, BindingResult bindingResult) {
        if (bindingResult.hasFieldErrors()) {

            return new ModelAndView("/create");
        }
        else {
            this.customerService.save(customer);
            return new ModelAndView("redirect:/customer");
        }
    }


}
