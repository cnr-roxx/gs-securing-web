package hello.repository;

import hello.model.Unit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource()
public interface UnitRepository extends JpaRepository<Unit, Long> {

    List<Unit> findByPayload(@Param("payload") String payload);

}