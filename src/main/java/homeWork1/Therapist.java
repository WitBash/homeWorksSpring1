package homeWork1;

import org.springframework.stereotype.Component;

@Component("doctor")
public class Therapist implements IDoctor {
    public void findDoctor () {
        System.out.println("Терапевт находится в 501 кабинете");
    }
}