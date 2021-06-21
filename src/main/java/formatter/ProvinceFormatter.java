package formatter;

import model.Province;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;
import service.province.IProvinceService;

import java.text.ParseException;
import java.util.Locale;

@Component
public class ProvinceFormatter implements Formatter<Province> {

    private IProvinceService service;

    public ProvinceFormatter() {
    }

    public ProvinceFormatter(IProvinceService service){
        this.service = service;
    }

    @Override
    public Province parse(String text, Locale locale) throws ParseException {
       Province province = service.findById(Long.parseLong(text));
        return province;
    }

    @Override
    public String print(Province object, Locale locale) {
        return null;
    }
}
