package com.bill.config;

import com.github.pagehelper.PageHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

/**
 * @author LiuYang
 * @version 1.0
 * @package: com.bill.config
 * @description: PageHelper配置文件
 * @date 2018-06-26 19:15
 */
@Configuration
public class PageHelperConfig {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Bean
    public PageHelper pageHelper() {
        PageHelper pageHelper = new PageHelper();
        Properties p = new Properties();
        p.setProperty("offsetAsPageNum", "true");
        p.setProperty("rowBoundsWithCount", "true");
        p.setProperty("reasonable", "true");
        p.setProperty("dialect", "mysql");
        p.setProperty("supportMethodsArguments", "false");
        p.setProperty("pageSizeZero", "true");
        pageHelper.setProperties(p);
        return pageHelper;
    }
}
