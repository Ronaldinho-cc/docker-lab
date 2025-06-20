package pe.edu.vallegrande.institucion.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.vallegrande.institucion.dto.InstitutionDto;

@RestController
@RequestMapping("/prueba")
public class PruebaRest {
    @GetMapping
    public InstitutionDto getAll() {
        InstitutionDto dto = new InstitutionDto();
        dto.setId("20354122001");
        dto.setNombre("Universidad Nacional Mayor de San Marcos");
        dto.setCorreoContacto("ronalCr@unmsm.edu.pe");
        return dto;
    }
}
