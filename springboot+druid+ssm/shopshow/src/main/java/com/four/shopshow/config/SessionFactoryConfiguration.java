//package com.four.shopshow.config;
//
//import org.mybatis.spring.SqlSessionFactoryBean;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
//
//import javax.sql.DataSource;
//import java.io.IOException;
//
//@Configuration
////@EnableTransactionManagement
//public class SessionFactoryConfiguration {
//
//
//    @Value("${mapper.xml.config.path}")
//    private String mapperXMLConfigPath;
//    @Value("${mapper.package.path}")
//    private String modlePackagePath;
//    @Autowired
//    private DataSource dataSource;
//
//    @Bean
//    public SqlSessionFactoryBean createSqlSessionFactory() throws IOException {
//        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
//        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
//        String packageXMLConfigPath = PathMatchingResourcePatternResolver.CLASSPATH_ALL_URL_PREFIX + mapperXMLConfigPath;
//
//        // 设置mapper 对应的XML 文件的路径
//        sqlSessionFactoryBean.setMapperLocations(resolver.getResources(packageXMLConfigPath));
//        // 设置数据源
//        sqlSessionFactoryBean.setDataSource(dataSource);
//        // 设置mapper 接口所在的包
//        sqlSessionFactoryBean.setTypeAliasesPackage(modlePackagePath);
//
//
//        return sqlSessionFactoryBean;
//    }
//
////    @Bean
////    public PlatformTransactionManager txManager (DataSource dataSource) {
////        DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager(dataSource);
////        return new DataSourceTransactionManager(dataSource);
////    }
//
//}
