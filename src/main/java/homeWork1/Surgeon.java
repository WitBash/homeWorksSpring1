package homeWork1;

import org.springframework.stereotype.Component;

@Component("Surgeon")
public class Surgeon implements IDoctor{
    public void findDoctor() {
        System.out.println("Хирург находится в 502 кабинете");
    }
}
