package marconi.persistence;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by marconi.junior on 19/08/2016.
 */

@ComponentScan
@EnableAutoConfiguration
@PropertySource(Constants.Properties)
@Configuration
public class AppConfiguration {

}
