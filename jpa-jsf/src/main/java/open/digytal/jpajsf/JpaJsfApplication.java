package open.digytal.jpajsf;

import java.util.Collections;

import javax.faces.webapp.FacesServlet;

import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import open.digytal.jpajsf.jsf.FacesViewScope;

@Configuration
@ComponentScan(basePackages={""})
@EnableAutoConfiguration
public class JpaJsfApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(JpaJsfApplication.class, args);
	}
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(JpaJsfApplication.class);
    }

    @Bean
    public ServletRegistrationBean servletRegistrationBean() {
        FacesServlet servlet = new FacesServlet();
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(servlet, "*.xhtml", "*.jsf");
		return servletRegistrationBean;
    }
	@Bean
	public static CustomScopeConfigurer customScopeConfigurer() {
		CustomScopeConfigurer configurer = new CustomScopeConfigurer();
		configurer.setScopes(Collections.<String, Object>singletonMap(FacesViewScope.NAME, new FacesViewScope()));
		return configurer;
	}
	@Bean
	public com.sun.faces.config.ConfigureListener mojarraConfigureListener() {
	    return new com.sun.faces.config.ConfigureListener();
	}

}
