/**
 * 
 */
package in.housemeet.geoloc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.housemeet.geoloc.dao.IBanoDAO;
import in.housemeet.geoloc.entity.Bano;

/**
 * @author THEBAULT-85823
 *
 */
@Service
public class BanoService implements IBanoService {
	@Autowired
	private IBanoDAO banoDAO;
	@Override
	public Bano getBanoById(String id){
		Bano obj = banoDAO.getBanoById(id);
		return obj;
	}
	@Override
	public List<Bano> getAllBano(){
		return banoDAO.getAllBano();
	}
	@Override
	public Bano getGeoByAddress(String numero, String nomVoie, String codePost, String commune){
		return banoDAO.getGeoByAddress(numero, nomVoie, codePost, commune);
	}
	@Override
	public synchronized boolean addBano(Bano bano){
                if (banoDAO.banoExists(bano.getNumero(),bano.getNomVoie(),bano.getCodePost(),bano.getCommune())) {
    	            return false;
                } else {
    	            banoDAO.addBano(bano);
    	            return true;
                }
	}
	@Override
	public void updateBano(Bano bano) {
		banoDAO.updateBano(bano);
	}
	@Override
	public List<Bano> getAddressesByGeo(float lat, float lon) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Bano> getGeoByStreet(String numero, String nomVoie) {
		// TODO Auto-generated method stub
		return null;
	}

}
