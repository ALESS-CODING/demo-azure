package pe.edu.cibertec.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import pe.edu.cibertec.viewmodel.VehiculoModel;

import java.util.List;

@Controller
@RequestMapping("/")
public class VehiculoController {

    @GetMapping
    public ModelAndView obtenerVehiculos (){
        List<VehiculoModel> vehiculoModels = List.of(
                new VehiculoModel(1L, "Toyota", "Corrolla", "Negro", "VEL-345"),
                new VehiculoModel(2L, "Honda", "Civic", "Blanco", "ABC-123"),
                new VehiculoModel(3L, "Ford", "Focus", "Rojo", "XYZ-789"),
                new VehiculoModel(4L, "Chevrolet", "Malibu", "Azul", "DEF-456"),
                new VehiculoModel(5L, "Nissan", "Sentra", "Gris", "GHI-678")
        );
        return new ModelAndView("vehiculo", "listaVehiculo", vehiculoModels);
    }


}
