package apimonedas.apimonedas.core.service;

import apimonedas.apimonedas.core.entidades.pais;

import java.util.List;

public interface IPaisService {
    List<pais> listar();

    pais obtener(long id);

    List<pais> buscar(String nombre);

    pais agregar(pais Pais);

    pais modificar(pais Pais);

    boolean eliminar(Long id);
}
