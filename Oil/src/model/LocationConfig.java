package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.primefaces.PrimeFaces;

@Entity
@Table(name = "LocationConfig")
public class LocationConfig implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "locationId")
	private String locationId;

	@Column(name = "locationIp")
	private String locationIp;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLocationId() {
		return locationId;
	}

	public void setLocationId(String locationId) {
		this.locationId = locationId;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getLocationIp() {
		return locationIp;
	}

	public void setLocationIp(String locationIp) {
		this.locationIp = locationIp;
	}

}
