package apimonedas.apimonedas.core.service;

import java.util.List;

import apimonedas.apimonedas.core.entidades.moneda;

public interface IMonedaService {
    public List<moneda> listar();

    public moneda obtener(long id);

    public List<moneda> buscar(String nombre);

    public moneda agregar(moneda Moneda);

    public moneda modificar(moneda Moneda);

    public boolean eliminar(Long id);

}
