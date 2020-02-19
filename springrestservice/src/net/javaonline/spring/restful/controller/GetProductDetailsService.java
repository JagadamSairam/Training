package net.javaonline.spring.restful.controller;


import net.javaonline.spring.restful.dao.GetProductDetailsDAO;
import net.javaonline.spring.restful.model.ProductDetails;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;

//import java.util.List;
//import java.util.Map;
//
//import javax.activation.MimeType;
//import javax.xml.ws.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;


@RestController
public class GetProductDetailsService {
	
	@Autowired
	GetProductDetailsDAO pdDao;
	

    @RequestMapping(value = "/getProduct",produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<ProductDetails> getProductMethod1() //@RequestParam(value="itemcode", defaultValue="1") String itemcode
    {
//    	Class.forName("com.mysql.jdbc.Driver");
//    	String url="jdbc:mysql://localhost:3306/cts";
//    	String username="root";
//    	String password="admin";
//    	Connection conn = DriverManager.getConnection(url, username, password);
//    	String query = "insert into employee values(?,?)";
//    	PreparedStatement ps = conn.prepareStatement(query);
//    	ps.setInt(1, id);
//    	ps.setString(2, name);
    	  return  pdDao.getAllProductDetails();
    }
    
    
    @RequestMapping(value = "/getProduct/{itemcode}",method = RequestMethod.GET,produces =MediaType.APPLICATION_XML_VALUE)  //@PathVariable(value="itemcode"
    public ResponseEntity<ProductDetails> getProductMethod2(@PathVariable String itemcode)
    {
    	ProductDetails pd;
    	try {
    	//GetProductDetailsDAO pdDao=new GetProductDetailsDAO();
    	 pd= pdDao.getProductDetails(itemcode);
    	}catch (Exception e) {
    		return new ResponseEntity<ProductDetails>(HttpStatus.NOT_FOUND);
		}
    	return new ResponseEntity<ProductDetails>(pd,HttpStatus.OK);
    }
    
    @RequestMapping(value = "/addProduct",method = RequestMethod.POST)
    public ResponseEntity<ProductDetails> addProductMethod(@RequestBody ProductDetails pdetails,UriComponentsBuilder ucBuilder)
    {
    		System.out.println("called....");
    	  //GetProductDetailsDAO pdDao=new GetProductDetailsDAO();
    	 ProductDetails pd= pdDao.addProductDetails(pdetails.getItemcode(), pdetails);
    	  
    	 return new ResponseEntity<ProductDetails>(pd, HttpStatus.CREATED);
    }
      
    @RequestMapping(value = "/delProduct/{itemcode}",method = RequestMethod.POST)
    public ResponseEntity<Void> deleteProductMethod(@PathVariable String itemcode) 
	{
    	  //GetProductDetailsDAO pdDao=new GetProductDetailsDAO();
    	  pdDao.delProductDetails(itemcode);
    	  //HttpHeaders headers = new HttpHeaders();
    	  return new ResponseEntity<>(null, HttpStatus.MOVED_PERMANENTLY);
    }   
    @RequestMapping(value = "/updateProduct",method = RequestMethod.PUT)
    public ResponseEntity<ProductDetails> updateProductMethod(@RequestBody ProductDetails pdetails,UriComponentsBuilder ucBuilder)
    {
    		System.out.println("called....");
    	  //GetProductDetailsDAO pdDao=new GetProductDetailsDAO();
    	 ProductDetails pd= pdDao.updateProductDetails(pdetails.getItemcode(), pdetails);
    	  
    	 return new ResponseEntity<ProductDetails>(pd, HttpStatus.CREATED);
    }
}