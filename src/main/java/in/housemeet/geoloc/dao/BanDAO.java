/**
 * 
 */
package in.housemeet.geoloc.dao;

import java.util.HashMap;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import in.housemeet.geoloc.entity.Bano;

/**
 * @author THEBAULT-85823
 *
 */
@Transactional
@Repository
public class BanDAO implements IBanoDAO {
	@PersistenceContext
	private EntityManager entityManager;
	@Override
	public Bano getBanoById(String id) {
		return entityManager.find(Bano.class, id);
	}
	@SuppressWarnings("unchecked")
	@Override
	public Bano getGeoByAddress(String numero, String nomVoie, String codePost, String commune){
		HashMap m = new HashMap();
		m.put("numero", numero);
		m.put("nomVoie", nomVoie);
		m.put("codePost", codePost);
		m.put("commune", commune);
		return entityManager.find(Bano.class,m);
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Bano> getAllBano() {
		String hql = "FROM Bano as bano ORDER BY bano.id";
		return (List<Bano>) entityManager.createQuery(hql).getResultList();
	}
	@Override
	public void addBano(Bano bano) {
		entityManager.persist(bano);
	}
	@Override
	public void updateBano(Bano bano) {
		Bano b = getBanoById(bano.getId());
		b.setNumero(bano.getNumero());
		b.setNomVoie(bano.getNomVoie());
		b.setIdFantoir(bano.getIdFantoir());
		b.setRep(bano.getRep());
		b.setCodeInsee(bano.getCodeInsee());
		b.setCodePost(bano.getCodePost());
		b.setAlias(bano.getAlias());
		b.setNomLd(bano.getNomLd());
		b.setX(bano.getX());
		b.setY(bano.getY());
		b.setFantLd(bano.getFantLd());
		b.setLat(bano.getLat());
		b.setLon(bano.getLon());
		entityManager.flush();
	}
	@Override
	public boolean banoExists(String numero, String nomVoie, String codePost, String commune) {
		String hql = "FROM Bano as bano WHERE bano.numero = ? and bano.nom_voie = ? and bano.code_post = ? and bano.commune = ?";
		int count = entityManager.createQuery(hql).setParameter(1, numero)
		              .setParameter(2, nomVoie).setParameter(3,codePost).setParameter(4,commune).getResultList().size();
		return count > 0 ? true : false;
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
