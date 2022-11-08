package ch.martinelli.demo.repository;

import ch.martinelli.demo.entity.SamplePerson;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SamplePersonRepository extends JpaRepository<SamplePerson, UUID> {

}
