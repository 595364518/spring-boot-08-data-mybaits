package com.mengxuegu.springboot.mapper;

import com.mengxuegu.springboot.entities.Bill;

/**
 * @Author: yaya
 * @Description:
 * @Date: Create in 下午 07:33 2019/11/5
 */
public interface BillMapper {

    Bill getBillById(Integer bid);

    int addBill(Bill bill);

}
