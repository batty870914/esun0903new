package com.example.demo.Service;

import com.example.demo.Model.*;

import java.util.List;

public interface ProductService {
    String createUser(User user);
    List<Product> viewAllProduct();
    String userOder(UserOrder userOrder);
    String upDateOder(UpdateOrder updateOrder);
    String deleteOder(DeleteOrder deleteOrder);

}
