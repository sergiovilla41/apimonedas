package apimonedas.apimonedas.presentation;

import apimonedas.apimonedas.core.entidades.pais;
import apimonedas.apimonedas.core.service.IPaisService;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/paises")
public class PaisController {

    private IPaisService servicio;

    public PaisController(IPaisService servicio) {
        this.servicio = servicio;
    }

    @RequestMapping(value = "/listar", method = RequestMethod.GET)
    public List<pais> listar() {
        return servicio.listar();
    }
}
