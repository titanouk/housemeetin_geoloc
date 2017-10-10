/**
 * 
 */
package in.housemeet.geoloc;

/**
 * @author THEBAULT-85823
 *
 */
public class LocalGeoLookup {
	private final float lat;
	private final float lon;
	
	public LocalGeoLookup(float lat, float lon){
		this.lat = lat;
		this.lon = lon;
	}
	
	public float getLat(){
		return lat;
	}
	
	public float getLon(){
		return lon;
	}

}
