package com.example.demo.Service;
import com.example.demo.Model.*;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class ProductServiceImpl implements ProductService{


    public String createUser(User user){
        // 將user帶入資料庫 寫進TB_USER
        return "註冊成功";
    }
    public List<Product> viewAllProduct(){
        List<Product> list = new ArrayList<>();
        // list = 資料庫回傳的產品清單
        return list;
    }
    public String userOder(UserOrder userOrder){
        // 計算預計扣款總金額及總手續費
        int totalAmount;
        int totalFee;
        // 取流水序號
        String orderId;
        // 將userOrder、totalAmount、totalFee帶入資料庫 寫進TB_ORDER
        return "成功";
    }

    public String upDateOder(UpdateOrder updateOrder){
        // 重新計算預計扣款總金額及總手續費
        int totalAmount;
        int totalFee;
        // 將updateOrder、totalAmount、totalFee帶入資料庫 更新TB_ORDER
        return "成功";
    }


    public String deleteOder(DeleteOrder deleteOrder){
        // 將deleteOrder帶入資料庫 刪除使用者order的產品
        return "成功";
    }

}