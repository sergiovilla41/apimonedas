package apimonedas.apimonedas.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import apimonedas.apimonedas.core.entidades.moneda;

@Repository
public interface IMonedaRepository extends JpaRepository<moneda, Long> {

}
