package uk.co.aduffy.util.model;

/**
 * Indicates that the implementing class carries a version number.
 * 
 * @author Andrew Duffy
 *
 */
public interface Versioned {

	public Long getVersion();
	
	public void setVersion(Long version);
	
}
