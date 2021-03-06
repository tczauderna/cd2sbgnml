//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package org.sbml._2001.ns.celldesigner;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Base product.
 * 
 * <p>Java class for baseProduct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="baseProduct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="linkAnchor" type="{http://www.sbml.org/2001/ns/celldesigner}linkAnchor" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="alias" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.sbml.org/2001/ns/celldesigner}SId">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="species" use="required" type="{http://www.sbml.org/2001/ns/celldesigner}SId" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "baseProduct", propOrder = {
    "linkAnchor"
})
public class BaseProduct {

    protected LinkAnchor linkAnchor;
    @XmlAttribute(name = "alias", required = true)
    protected String alias;
    @XmlAttribute(name = "species", required = true)
    protected String species;

    /**
     * Gets the value of the linkAnchor property.
     * 
     * @return
     *     possible object is
     *     {@link LinkAnchor }
     *     
     */
    public LinkAnchor getLinkAnchor() {
        return linkAnchor;
    }

    /**
     * Sets the value of the linkAnchor property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkAnchor }
     *     
     */
    public void setLinkAnchor(LinkAnchor value) {
        this.linkAnchor = value;
    }

    /**
     * Gets the value of the alias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlias() {
        return alias;
    }

    /**
     * Sets the value of the alias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlias(String value) {
        this.alias = value;
    }

    /**
     * Gets the value of the species property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecies() {
        return species;
    }

    /**
     * Sets the value of the species property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecies(String value) {
        this.species = value;
    }

}
