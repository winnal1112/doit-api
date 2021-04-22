package pers.doit.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/*
* @ConfigurationProperties表示从application配置文件中读取配置项
* prefix表示配置项的前缀
* 配置类中的变量名必须要与前缀之后的配置名称一致
* */
// @ConfigurationProperties(prefix = "jdbc")
public class JdbcProperties {

    private String driverClassName;
    private String url;
    private String username;
    private String password;

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
