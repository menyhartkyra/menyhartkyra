package greenfox.rest.repository;

import greenfox.rest.models.Log;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogRepository extends CrudRepository<Log, Integer> {
  List<Log> findAll();
}
