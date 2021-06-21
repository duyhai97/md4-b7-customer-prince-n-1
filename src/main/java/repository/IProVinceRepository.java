package repository;

import model.Province;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProVinceRepository extends CrudRepository<Province, Long> {
}
