package gnomes.spring.gnomesv01.controllers;

import gnomes.spring.gnomesv01.services.interfaces.LocationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LocationsController {

    private final LocationService locationService;

    public LocationsController(LocationService locationService) {
        this.locationService = locationService;
    }

    @RequestMapping("/listLocations")
    public String getLocationsPage(Model model){
        model.addAttribute("listLocations",locationService.findAll());

        //thyme leaf will lookup a template called locations
        return "locations";
    }
}
