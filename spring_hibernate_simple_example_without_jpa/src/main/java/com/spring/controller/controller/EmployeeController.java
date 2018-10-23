package com.spring.controller.controller;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.spring.entity.Employee;
import com.spring.service.EmployeeCurdService;


@Controller
public class EmployeeController {

	@RequestMapping("/employeehomecurd")
	public ModelAndView test() throws IOException{
		return new ModelAndView("home", "message" , "this is message all");
	}
	
	
	 
    //@RequestMapping("/save")  
    @RequestMapping(value = "/save", method = { RequestMethod.POST })
    public @ResponseBody HashMap save(@RequestBody String json, HttpServletRequest request) { 
    	System.out.println(json);
    	Gson gson =new Gson();
    	Employee emp =gson.fromJson(json, Employee.class);
    	
    	Resource r=new ClassPathResource("applicationContext.xml");  
    	BeanFactory factory=new XmlBeanFactory(r);
    	EmployeeCurdService dao=(EmployeeCurdService)factory.getBean("hibernatetemplate");  
    	
    	HashMap<String, String > map = new HashMap<String, String>();
  
        dao.saveEmployee(emp); 
       // map.put(arg0, arg1);
        map.put("list", "success");
        return map;
    }  
    
    
    
/*    @RequestMapping("/update")  
    public ModelAndView update() {  
    	Resource r=new ClassPathResource("applicationContext.xml");  
    	BeanFactory factory=new XmlBeanFactory(r);
    	EmployeeCurdService dao=(EmployeeCurdService)factory.getBean("hibernatetemplate");  
      
    	
    	
        return new ModelAndView("home", "message", "successfully updated");  
    }  
    
    
    @RequestMapping("/delete")  
    public ModelAndView delete() { 
    	Resource r=new ClassPathResource("applicationContext.xml");  
    	BeanFactory factory=new XmlBeanFactory(r);
    	EmployeeCurdService dao=(EmployeeCurdService)factory.getBean("hibernatetemplate"); 
        
    	
    	
        return new ModelAndView("home", "message", "successfully deleted");  
    }  
    */
    
  
    
    //@RequestMapping("/save")  
    @RequestMapping(value = "/list", method = { RequestMethod.GET }, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<HashMap<String, Object>>  list() { 
    	Resource r=new ClassPathResource("applicationContext.xml");  
    	BeanFactory factory=new XmlBeanFactory(r);
    	EmployeeCurdService dao=(EmployeeCurdService)factory.getBean("hibernatetemplate");  
    	
    	List<HashMap<String, Object>> maplist = new ArrayList<HashMap<String, Object>>();
     
        List<Employee>  listall =dao.getEmployees(); 
        
        for(Employee e: listall ) {
        	HashMap<String, Object> map =new HashMap<String, Object>();
        	map.put("id", e.getId());
        	map.put("name", e.getName());
        	map.put("salary", e.getSalary());
        	maplist.add(map);
        }
        
       // map.put(arg0, arg1); 
        return maplist;
    }  
    
    
	
	
	
}
