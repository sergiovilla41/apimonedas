package apimonedas.apimonedas.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import apimonedas.apimonedas.core.entidades.cambioMoneda;

@Repository
public interface ICambioMonedaRepository extends JpaRepository<cambioMoneda, Long> {

}
