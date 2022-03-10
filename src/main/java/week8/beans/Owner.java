/* ajwinters@dmacc.edu - ajwinters
 * CIS175 - Spring 2022
 * Mar 10, 2022
 */
package week8.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Owner {
	@Id
	@GeneratedValue
	private long id;
	private String name;
	private String pieceDescription;
	private String pieceNotes;
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the pieceDescription
	 */
	public String getPieceDescription() {
		return pieceDescription;
	}
	/**
	 * @param pieceDescription the pieceDescription to set
	 */
	public void setPieceDescription(String pieceDescription) {
		this.pieceDescription = pieceDescription;
	}
	/**
	 * @return the pieceNotes
	 */
	public String getPieceNotes() {
		return pieceNotes;
	}
	/**
	 * @param pieceNotes the pieceNotes to set
	 */
	public void setPieceNotes(String pieceNotes) {
		this.pieceNotes = pieceNotes;
	}
	/**
	 * 
	 */
	public Owner() {
		super();
		this.name = "Anonymous";
		this.pieceDescription = "unknown";
		this.pieceNotes = "none";
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param id
	 * @param name
	 * @param pieceDescription
	 * @param pieceNotes
	 */
	public Owner(long id, String name, String pieceDescription, String pieceNotes) {
		super();
		this.id = id;
		this.name = name;
		this.pieceDescription = pieceDescription;
		this.pieceNotes = pieceNotes;
	}
	
	/**
	 * @param name
	 * @param pieceDescription
	 * @param pieceNotes
	 */
	public Owner(String name, String pieceDescription, String pieceNotes) {
		super();
		this.name = name;
		this.pieceDescription = pieceDescription;
		this.pieceNotes = pieceNotes;
	}
	@Override
	public String toString() {
		return "Owner [id=" + id + ", name=" + name + ", pieceDescription=" + pieceDescription + ", pieceNotes="
				+ pieceNotes + "]";
	}
	
	

}
