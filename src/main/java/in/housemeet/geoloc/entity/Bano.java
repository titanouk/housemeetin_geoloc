/**
 * 
 */
package in.housemeet.geoloc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author THEBAULT-85823
 *
 */
@Entity
@Table(name="Bano")
public class Bano {

	@SuppressWarnings("unused")
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="id")
	private String id;
	@Column(name="nom_voie")
	private String nomVoie;
	@Column(name="id_fantoir")
	private String idFantoir;
	@Column(name="numero")
	private String numero;
	@Column(name="rep")
	private String rep;
	@Column(name="code_insee")
	private String codeInsee;
	@Column(name="code_post")
	private String codePost;
	@Column(name="alias")
	private String alias;
	@Column(name="nom_ld")
	private String nomLd;
	@Column(name="x")
	private float x;
	@Column(name="y")
	private float y;
	@Column(name="commune")
	private String commune;
	@Column(name="fant_ld")
	private String fantLd;
	@Column(name="lat")
	private float lat;
	@Column(name="lon")
	private float lon;
	
	public String getId(){
		return id;
	}
	public void setId(String id){
		this.id = id;
	}
	public String getNomVoie(){
		return nomVoie;
	}
	public void setNomVoie(String nomVoie){
		this.nomVoie = nomVoie;
	}
	public String getIdFantoir(){
		return idFantoir;
	}
	public void setIdFantoir(String idFantoir){
		this.idFantoir = idFantoir;
	}
	public String getNumero(){
		return numero;
	}
	public void setNumero(String numero){
		this.numero = numero;
	}
	public String getRep(){
		return rep;
	}
	public void setRep(String rep){
		this.rep = rep;
	}
	public String getCodeInsee(){
		return codeInsee;
	}
	public void setCodeInsee(String codeInsee){
		this.codeInsee = codeInsee;
	}
	public String getCodePost(){
		return codePost;
	}
	public void setCodePost(String codePost){
		this.codePost = codePost;
	}
	public String getAlias(){
		return alias;
	}
	public void setAlias(String alias){
		this.alias = alias;
	}
	public String getNomLd(){
		return nomLd;
	}
	public void setNomLd(String nomLd){
		this.nomLd = nomLd;
	}
	public float getX(){
		return x;
	}
	public void setX(float x){
		this.x = x;
	}
	public float getY(){
		return y;
	}
	public void setY(float y){
		this.y = y;
	}
	public String getCommune(){
		return commune;
	}
	public void setCommune(String commune){
		this.commune = commune;
	}
	public String getFantLd(){
		return fantLd;
	}
	public void setFantLd(String fantLd){
		this.fantLd = fantLd;
	}
	public float getLat(){
		return lat;
	}
	public void setLat(float lat){
		this.lat = lat;
	}
	public float getLon(){
		return lon;
	}
	public void setLon(float lon){
		this.lon = lon;
	}
	/**
	 * @param nomVoie
	 * @param numero
	 * @param rep
	 * @param codePost
	 * @param commune
	 * @param lat
	 * @param lon
	 */
	public Bano(String nomVoie, String numero, String rep, String codePost,
			String commune, float lat, float lon) {
		super();
		this.nomVoie = nomVoie;
		this.numero = numero;
		this.rep = rep;
		this.codePost = codePost;
		this.commune = commune;
		this.lat = lat;
		this.lon = lon;
	}
	
}
