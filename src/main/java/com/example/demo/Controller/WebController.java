package com.example.demo.Controller;


import com.example.demo.Model.*;
import com.example.demo.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WebController {

    @Autowired
    ProductService productService;

    @PostMapping("/createUser")
    String createUser(@RequestBody User user){
        return productService.createUser(user);
    }

    @PostMapping("/viewProduct")
    public List<Product> viewAllProduct(){
        return productService.viewAllProduct();
    }

    @PostMapping("/userOrder")
    public String userOder(@RequestBody UserOrder userOrder){
        return productService.userOder(userOrder);
    }

    @PostMapping("/updateOrder")
    public String upDateOder(@RequestBody UpdateOrder updateOrder){
        return productService.upDateOder(updateOrder);
    }

    @PostMapping("/delete")
    public String deleteOder(@RequestBody DeleteOrder deleteOrder){
        return productService.deleteOder(deleteOrder);
    }
}
