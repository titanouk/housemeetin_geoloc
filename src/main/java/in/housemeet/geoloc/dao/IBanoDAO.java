/**
 * 
 */
package in.housemeet.geoloc.dao;

import java.util.List;
import in.housemeet.geoloc.entity.Bano;

/**
 * @author THEBAULT-85823
 *
 */
public interface IBanoDAO {
	List<Bano> getAllBano();
	Bano getBanoById(String id);
	Bano getGeoByAddress(String numero, String nomVoie, String codePost, String commune);
	List<Bano> getAddressesByGeo(float lat, float lon);
	List<Bano> getGeoByStreet(String numero, String nomVoie);
	
	void addBano(Bano bano);
	void updateBano(Bano bano);
	boolean banoExists(String numero, String nomVoie, String codePost, String commune);

}
