package lt.vln.aj.aihackathon;

import com.vaadin.flow.component.dependency.NpmPackage;
import com.vaadin.flow.component.page.AppShellConfigurator;
import com.vaadin.flow.theme.Theme;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;

/**
 * The entry point of the Spring Boot application.
 * <p>
 * Use the @PWA annotation make the application installable on phones, tablets
 * and some desktop browsers.
 */
@SpringBootApplication(exclude = ErrorMvcAutoConfiguration.class)
@Theme(value = "thelibrary")
@NpmPackage(value = "lumo-css-framework", version = "^4.0.10")
public class App implements AppShellConfigurator /*extends SpringBootServletInitializer*/ {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
        //This, together with 'spring.flyway.enabled=false' allows Flyway migration to be performed AFTER tables are created by Hibernate based on @Entity classes
        //Flyway.configure().baselineOnMigrate(true).dataSource("jdbc:mysql://localhost:3306/thelibrary", "root", "root").load().migrate();
    }

}
