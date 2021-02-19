package com.propertyrental.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.format.annotation.DateTimeFormat;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Property {
		
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;

	private String propertyName;
	@ManyToOne
	@JoinColumn(name="propertytypeid", insertable=false, updatable=false)
	private PropertyType propertyType;
	private Integer propertytypeid;	
	
	private String propertyNumber;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date startDate;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date acquisitionDate;
	private String description;
	
	@ManyToOne
	@JoinColumn(name="propertyownershipid", insertable=false, updatable=false)
	private PropertyOwnership propertyOwnership;
	private Integer propertyownershipid;
	
	private Integer size;
	private String maximumOccupancy;
	@ManyToOne
	@JoinColumn(name="propertystatusid", insertable=false, updatable=false)
	private PropertyStatus propertyStatus;
	private Integer propertystatusid;	
	
	private String netRate;

	@ManyToOne
	@JoinColumn(name="employeeid", insertable=false, updatable=false)
	private Employee inCharge;
	private Integer employeeid;
	
	@ManyToOne
	@JoinColumn(name="furniturestylemodelid", insertable=false, updatable=false)
	private FurnitureStyleModel furnitureStyleModel;	
	private Integer furniturestylemodelid;

	@ManyToOne
	@JoinColumn(name="locationid", insertable=false, updatable=false)	
	private Location currentLocation;
	private Integer locationid;
	
	private String remarks;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPropertyName() {
		return propertyName;
	}

	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

	public PropertyType getPropertyType() {
		return propertyType;
	}

	public void setPropertyType(PropertyType propertyType) {
		this.propertyType = propertyType;
	}

	public Integer getPropertytypeid() {
		return propertytypeid;
	}

	public void setPropertytypeid(Integer propertytypeid) {
		this.propertytypeid = propertytypeid;
	}

	public String getPropertyNumber() {
		return propertyNumber;
	}

	public void setPropertyNumber(String propertyNumber) {
		this.propertyNumber = propertyNumber;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getAcquisitionDate() {
		return acquisitionDate;
	}

	public void setAcquisitionDate(Date acquisitionDate) {
		this.acquisitionDate = acquisitionDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public PropertyOwnership getPropertyOwnership() {
		return propertyOwnership;
	}

	public void setPropertyOwnership(PropertyOwnership propertyOwnership) {
		this.propertyOwnership = propertyOwnership;
	}

	public Integer getPropertyownershipid() {
		return propertyownershipid;
	}

	public void setPropertyownershipid(Integer propertyownershipid) {
		this.propertyownershipid = propertyownershipid;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public String getMaximumOccupancy() {
		return maximumOccupancy;
	}

	public void setMaximumOccupancy(String maximumOccupancy) {
		this.maximumOccupancy = maximumOccupancy;
	}

	public PropertyStatus getPropertyStatus() {
		return propertyStatus;
	}

	public void setPropertyStatus(PropertyStatus propertyStatus) {
		this.propertyStatus = propertyStatus;
	}

	public Integer getPropertystatusid() {
		return propertystatusid;
	}

	public void setPropertystatusid(Integer propertystatusid) {
		this.propertystatusid = propertystatusid;
	}

	public String getNetRate() {
		return netRate;
	}

	public void setNetRate(String netRate) {
		this.netRate = netRate;
	}

	public Employee getInCharge() {
		return inCharge;
	}

	public void setInCharge(Employee inCharge) {
		this.inCharge = inCharge;
	}

	public Integer getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(Integer employeeid) {
		this.employeeid = employeeid;
	}

	public FurnitureStyleModel getFurnitureStyleModel() {
		return furnitureStyleModel;
	}

	public void setFurnitureStyleModel(FurnitureStyleModel furnitureStyleModel) {
		this.furnitureStyleModel = furnitureStyleModel;
	}

	public Integer getFurniturestylemodelid() {
		return furniturestylemodelid;
	}

	public void setFurniturestylemodelid(Integer furniturestylemodelid) {
		this.furniturestylemodelid = furniturestylemodelid;
	}

	public Location getCurrentLocation() {
		return currentLocation;
	}

	public void setCurrentLocation(Location currentLocation) {
		this.currentLocation = currentLocation;
	}

	public Integer getLocationid() {
		return locationid;
	}

	public void setLocationid(Integer locationid) {
		this.locationid = locationid;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}	
	
	
	
	
	
	
}
