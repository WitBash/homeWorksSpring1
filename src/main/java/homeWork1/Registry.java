package homeWork1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("registry")
public class Registry implements IRegistry{
    private IDoctor doctor;

    public IDoctor getDoctor() {
        return doctor;
    }
    @Autowired (required = false)
    @Qualifier("Surgeon")
    public void setDoctor(IDoctor doctor) {
        this.doctor = doctor;
    }

    public void whereDoctor(){
        System.out.println("Добрый день");
        doctor.findDoctor();
    }
}
