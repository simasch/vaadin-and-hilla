package ch.martinelli.demo;

import com.vaadin.flow.component.page.AppShellConfigurator;
import com.vaadin.flow.server.PWA;
import com.vaadin.flow.theme.Theme;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The entry point of the Spring Boot application.
 *
 * Use the @PWA annotation make the application installable on phones, tablets
 * and some desktop browsers.
 *
 */
@SpringBootApplication
@Theme(value = "hilla")
@PWA(name = "Hilla", shortName = "Hilla", offlineResources = {})
public class HillaApplication implements AppShellConfigurator {

    public static void main(String[] args) {
        SpringApplication.run(HillaApplication.class, args);
    }

}
