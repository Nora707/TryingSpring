package SpaceShipCompany.config;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class DataSourceConfig {
//    @Value("${datasource.name}")
//    private String name;
//    @Value("${datasource.url}")
//    private String url;
//
//    @ConfigurationProperties(prefix = "spring.datasource")
//    @Bean
//    @Primary
//    public javax.sql.DataSource getDataSource() {
//        return DataSourceBuilder.create().build();
//    }

}
