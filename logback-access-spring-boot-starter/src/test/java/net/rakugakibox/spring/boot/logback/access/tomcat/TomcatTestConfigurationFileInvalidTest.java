package net.rakugakibox.spring.boot.logback.access.tomcat;

import net.rakugakibox.spring.boot.logback.access.AbstractTestConfigurationFileInvalidTest;
import org.springframework.boot.autoconfigure.web.servlet.ServletWebServerFactoryAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * The test in the case where test configuration files is invalid for Tomcat.
 */
public class TomcatTestConfigurationFileInvalidTest extends AbstractTestConfigurationFileInvalidTest {

    /**
     * Constructs an instance.
     */
    public TomcatTestConfigurationFileInvalidTest() {
        super(ContextConfiguration.class);
    }

    /**
     * The context configuration.
     */
    @Configuration
    @Import(ServletWebServerFactoryAutoConfiguration.EmbeddedTomcat.class)
    public static class ContextConfiguration extends AbstractContextConfiguration {
    }

}
