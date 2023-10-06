package vn.edu.iuh.fit.annotationbased;

import org.springframework.stereotype.Component;

@Component
public class MyXFormat implements MyFormatter{
    @Override
    public String format(double number) {
        return "X format = " + number;
    }
}
