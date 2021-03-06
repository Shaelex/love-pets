package pl.sedzimierz.lovepets.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.sedzimierz.lovepets.model.PetType;

import java.util.List;
import java.util.Optional;

@Repository
public interface PetTypeRepository extends JpaRepository<PetType, Long> {

    List<PetType> findAllByOrderById();

    Optional<PetType> findOneByName(String name);
}
