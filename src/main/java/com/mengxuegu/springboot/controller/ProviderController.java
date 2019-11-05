package com.mengxuegu.springboot.controller;

import com.mengxuegu.springboot.entities.Provider;
import com.mengxuegu.springboot.mapper.ProviderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: yaya
 * @Description:
 * @Date: Create in 下午 10:04 2019/11/4
 */
@RestController
public class ProviderController {

    @Autowired
    ProviderMapper providerMapper;
    @GetMapping("/provider/{pid}")
    public Provider getProviderById(@PathVariable(value = "pid")Integer pid){
        Provider provider = providerMapper.getProviderById(pid);
        return provider;
    }

    @GetMapping("/provider")
    public Provider addProvider(Provider provider){
        providerMapper.addProvider(provider);
        return provider;
    }
}
