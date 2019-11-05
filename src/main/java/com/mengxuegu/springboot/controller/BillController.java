package com.mengxuegu.springboot.controller;

import com.mengxuegu.springboot.entities.Bill;
import com.mengxuegu.springboot.mapper.BillMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: yaya
 * @Description:
 * @Date: Create in 下午 07:40 2019/11/5
 */
@RestController
public class BillController {

    @Autowired
    BillMapper billMapper;

    @GetMapping("/bill/{bid}")
    public Bill getBillById(@PathVariable(value = "bid") Integer bid){

        Bill bill = billMapper.getBillById(bid);

        return bill;
    }

    @GetMapping("/bill")
    public Bill addBill(Bill bill){
        billMapper.addBill(bill);
        return bill;
    }
}
