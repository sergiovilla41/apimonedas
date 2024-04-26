package apimonedas.apimonedas.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import apimonedas.apimonedas.core.entidades.pais;

@Repository
public interface IPaisRepository extends JpaRepository<pais, Long> {

}
