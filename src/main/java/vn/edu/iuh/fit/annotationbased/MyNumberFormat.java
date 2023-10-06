package vn.edu.iuh.fit.annotationbased;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.text.NumberFormat;

@Component("abc")
public class MyNumberFormat implements MyFormatter{
    public String format(double number){
        return "after formatted " + NumberFormat.getInstance().format(number);
    }
}
