//package com.four.shopshow.config;
//
//import com.mchange.v2.c3p0.ComboPooledDataSource;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import javax.sql.DataSource;
//import java.beans.PropertyVetoException;
//
//@Configuration
//public class DataSourceConfiguration {
//    @Value("${jdbc.driver}")
//    private String jdbcDriver;
//    @Value("${jdbc.uri}")
//    private String jdbcUrl;
//    @Value("${jdbc.userName}")
//    private String userName;
//    @Value("${jdbc.pwd}")
//    private String jdbcPassword;
//
//    @Bean(name = "dataSource")
//    public DataSource dataSource() throws PropertyVetoException {
//        ComboPooledDataSource dataSource = new ComboPooledDataSource();
//        dataSource.setDriverClass(jdbcDriver);
//        dataSource.setJdbcUrl(jdbcUrl);
//        dataSource.setUser(userName);
//        dataSource.setPassword(jdbcPassword);
//        // 关闭连接后不自动提交
//        dataSource.setAutoCommitOnClose(false);
//        return dataSource;
//    }
//
//}
