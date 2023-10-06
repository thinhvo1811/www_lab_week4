package vn.edu.iuh.fit.annotationbased;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class MyNumberFormatService {
    private final MyFormatter myFormatter;

    public MyNumberFormatService(@Qualifier("abc") MyFormatter myFormatter) {
        this.myFormatter = myFormatter;
    }

    public String getFormat(double number){
        return myFormatter.format(number);
    }
}
