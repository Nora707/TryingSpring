package SpaceShipCompany.Controllers;

import SpaceShipCompany.Entity.Crew;
import SpaceShipCompany.Repository.CrewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "demo")
public class MainController {

    @Autowired
    private CrewRepository crewRep;

    @GetMapping(path = "/add")
    public @ResponseBody
    String addNewPilot(@RequestParam String name,  @RequestParam int rank,  @RequestParam String photo) {
        Crew p = new Crew();
        p.setName(name);
        p.setRank(rank);
        p.setPhoto(photo);
        crewRep.save(p);
        return "saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Crew> getAllPilot() {
        // This returns a JSON or XML with the users
        return crewRep.findAll();
    }

}
