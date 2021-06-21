package service.province;

import model.Province;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface IProvinceService {
    List<Province> findAll();

    Province findById(Long id);

    void save(Province province);

    void remove(Long id);
}
