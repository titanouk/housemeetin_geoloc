/**
 * 
 */
package in.housemeet.geoloc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import in.housemeet.geoloc.entity.Bano;
import in.housemeet.geoloc.service.IBanoService;

/**
 * @author THEBAULT-85823
 *
 */
@RestController
@RequestMapping("/LocalGeoLookup")
public class LocalGeoLookupController {
	@Autowired
	private IBanoService banoService;

	@GetMapping("address")
	public Bano LocalGeoLookup(@PathVariable("numero") String numero, @PathVariable("nom_voie") String nomVoie, @PathVariable("commune") String commune, @PathVariable("code_post") String codePost) {
		Bano bano = banoService.getGeoByAddress(numero,nomVoie,codePost,commune);
		return bano;
	}
}
