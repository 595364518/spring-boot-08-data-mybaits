package com.mengxuegu.springboot.mapper;

import com.mengxuegu.springboot.entities.Provider;
import org.apache.ibatis.annotations.*;
import org.springframework.web.bind.annotation.DeleteMapping;

/**
 * @Author: yaya
 * @Description:
 * @Date: Create in 下午 09:58 2019/11/4
 */
//可直接在主类中配置@MapperScan注解
//@Mapper//指定这是操作数据的Mapper
public interface ProviderMapper {

    @Select("select * from provider where pid = #{pid}")
    Provider getProviderById(Integer pid);

    @Delete("select * from provider where pid = #{pid}")
    int deleteProviderById(Integer pid);

    @Update("update provider set providerName = #{providerName} where pid = #{pid}")
    int updateProvider(Provider provider);

    //useGeneratedKeys是否使用自增主键,keyProperty制定是哪一个属性自增
    @Options(useGeneratedKeys = true,keyProperty = "pid")
    @Insert("insert into provider(providerName) values(#{providerName})")
    int addProvider(Provider provider);
}
