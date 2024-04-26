package apimonedas.apimonedas.application;

import java.util.List;

import org.springframework.stereotype.Service;

import apimonedas.apimonedas.core.entidades.pais;
import apimonedas.apimonedas.core.repository.IPaisRepository;
import apimonedas.apimonedas.core.service.IPaisService;

@Service
public class paisServicio implements IPaisService {
    private IPaisRepository repository;

    public paisServicio(IPaisRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<pais> listar() {

        return repository.findAll();
    }

    @Override
    public pais obtener(long id) {

        throw new UnsupportedOperationException("Unimplemented method 'obtener'");
    }

    @Override
    public List<pais> buscar(String nombre) {

        throw new UnsupportedOperationException("Unimplemented method 'buscar'");
    }

    @Override
    public pais agregar(pais Pais) {

        throw new UnsupportedOperationException("Unimplemented method 'agregar'");
    }

    @Override
    public pais modificar(pais Pais) {

        throw new UnsupportedOperationException("Unimplemented method 'modificar'");
    }

    @Override
    public boolean eliminar(Long id) {

        throw new UnsupportedOperationException("Unimplemented method 'eliminar'");
    }

}
