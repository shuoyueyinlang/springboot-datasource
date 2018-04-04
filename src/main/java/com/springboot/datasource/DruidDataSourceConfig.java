package com.springboot.datasource;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

/**
 * 数据源配置
 *
 * @author 林锋
 * @email 904303298@qq.com
 * @create 2018-04-04 17:01
 **/
@Configuration
public class DruidDataSourceConfig {

    /**
     * 主数据库
     *
     * @return
     */
    @ConfigurationProperties(prefix = "spring.datasource.master")
    @Bean(name = "masterDataSource")
    @Primary
    public DataSource masterDataSource() {
        return new DruidDataSource();
    }

}
