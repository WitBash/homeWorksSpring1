package homeWork1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("homeWork1")
public class AppConfig {
//    @Bean (name = "doctor")
//    public IDoctor doctor() {
//        return new Surgeon();
//    }

//    @Bean (name = "registry")
//    public IRegistry registry(IDoctor doctor) {
//        Registry registry = new Registry();
//        registry.setDoctor(doctor);
//        return registry;
//    }
}
