/**
 * 
 */
package in.housemeet.geoloc;

/**
 * @author THEBAULT-85823
 *
 */
public class LocalAddressLookup {
	private final String address;
	private final String numero;
	private final String nomVoie;
	private final String codePost;
	private final String commune;
	
	public LocalAddressLookup(String address, String numero, String nomVoie, String codePost, String commune){
		this.address = address;
		this.numero = numero;
		this.nomVoie = nomVoie;
		this.codePost = codePost;
		this.commune = commune;
		
		public String getAddress(){
			return numero+" "+nomVoie+","+codePost+" "+commune;
		}
		public String getNumero(){
			return numero;
		}
		public String getNomVoie(){
			return nomVoie;
		}
		public String getCodePost(){
			return codePost;
		}
		public String getCommune(){
			return commune;
		}
	}

}
