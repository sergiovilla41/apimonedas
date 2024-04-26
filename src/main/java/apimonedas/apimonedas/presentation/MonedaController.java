package apimonedas.apimonedas.presentation;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import apimonedas.apimonedas.core.entidades.moneda;
import apimonedas.apimonedas.core.service.IMonedaService;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping("/api/monedas")
public class MonedaController {
    private IMonedaService servicio;

    public MonedaController(IMonedaService servicio) {
        this.servicio = servicio;
    }

    @RequestMapping(value = "/listar", method = RequestMethod.GET)
    public List<moneda> listar() {
        return servicio.listar();
    }
}
