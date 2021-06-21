package service.province;

import model.Province;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.IProVinceRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProvinceService implements IProvinceService{


    @Autowired
    private IProVinceRepository repository;


    @Override
    public List<Province> findAll() {
        return (List<Province>) repository.findAll();
    }

    @Override
    public Province findById(Long id){
        return repository.findOne(id);
    }

    @Override
    public void save(Province province) {
        repository.save(province);

    }

    @Override
    public void remove(Long id) {
        repository.delete(id);
    }
}
