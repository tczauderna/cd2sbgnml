//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package org.sbml._2001.ns.celldesigner;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * For protein.
 * 
 * <p>Java class for protein complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="protein">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="notes" type="{http://www.sbml.org/2001/ns/celldesigner}notes" minOccurs="0"/>
 *         &lt;element name="listOfBindingRegions" type="{http://www.sbml.org/2001/ns/celldesigner}listOfBindingRegions" minOccurs="0"/>
 *         &lt;element name="listOfModificationResidues" type="{http://www.sbml.org/2001/ns/celldesigner}listOfModificationResidues" minOccurs="0"/>
 *         &lt;element name="listOfStructuralStates" type="{http://www.sbml.org/2001/ns/celldesigner}listOfStructuralStates" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.sbml.org/2001/ns/celldesigner}SId">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="name" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="type" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="GENERIC"/>
 *             &lt;enumeration value="ION_CHANNEL"/>
 *             &lt;enumeration value="RECEPTOR"/>
 *             &lt;enumeration value="TRUNCATED"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "protein", propOrder = {
    "notes",
    "listOfBindingRegions",
    "listOfModificationResidues",
    "listOfStructuralStates"
})
public class Protein {

    protected Notes notes;
    protected ListOfBindingRegions listOfBindingRegions;
    protected ListOfModificationResidues listOfModificationResidues;
    protected ListOfStructuralStates listOfStructuralStates;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "type", required = true)
    protected String type;

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link Notes }
     *     
     */
    public Notes getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Notes }
     *     
     */
    public void setNotes(Notes value) {
        this.notes = value;
    }

    /**
     * Gets the value of the listOfBindingRegions property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfBindingRegions }
     *     
     */
    public ListOfBindingRegions getListOfBindingRegions() {
        return listOfBindingRegions;
    }

    /**
     * Sets the value of the listOfBindingRegions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfBindingRegions }
     *     
     */
    public void setListOfBindingRegions(ListOfBindingRegions value) {
        this.listOfBindingRegions = value;
    }

    /**
     * Gets the value of the listOfModificationResidues property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfModificationResidues }
     *     
     */
    public ListOfModificationResidues getListOfModificationResidues() {
        return listOfModificationResidues;
    }

    /**
     * Sets the value of the listOfModificationResidues property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfModificationResidues }
     *     
     */
    public void setListOfModificationResidues(ListOfModificationResidues value) {
        this.listOfModificationResidues = value;
    }

    /**
     * Gets the value of the listOfStructuralStates property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfStructuralStates }
     *     
     */
    public ListOfStructuralStates getListOfStructuralStates() {
        return listOfStructuralStates;
    }

    /**
     * Sets the value of the listOfStructuralStates property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfStructuralStates }
     *     
     */
    public void setListOfStructuralStates(ListOfStructuralStates value) {
        this.listOfStructuralStates = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}
