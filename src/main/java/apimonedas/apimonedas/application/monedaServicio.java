package apimonedas.apimonedas.application;

import java.util.List;

import org.springframework.stereotype.Service;

import apimonedas.apimonedas.core.entidades.moneda;
import apimonedas.apimonedas.core.repository.IMonedaRepository;
import apimonedas.apimonedas.core.service.IMonedaService;

@Service
public class monedaServicio implements IMonedaService {
    private IMonedaRepository repository;

    public monedaServicio(IMonedaRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<moneda> listar() {
        return repository.findAll();
    }

    @Override
    public moneda obtener(long id) {
        throw new UnsupportedOperationException("Unimplemented method 'obtener'");
    }

    @Override
    public List<moneda> buscar(String nombre) {
        throw new UnsupportedOperationException("Unimplemented method 'buscar'");
    }

    @Override
    public moneda agregar(moneda Moneda) {
        throw new UnsupportedOperationException("Unimplemented method 'agregar'");
    }

    @Override
    public moneda modificar(moneda Moneda) {
        throw new UnsupportedOperationException("Unimplemented method 'modificar'");
    }

    @Override
    public boolean eliminar(Long id) {
        throw new UnsupportedOperationException("Unimplemented method 'eliminar'");
    }

}
