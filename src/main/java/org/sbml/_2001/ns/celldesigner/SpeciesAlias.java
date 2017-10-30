//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package org.sbml._2001.ns.celldesigner;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * For species aliases not forming complexes.
 * 
 * <p>Java class for speciesAlias complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="speciesAlias">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.sbml.org/2001/ns/celldesigner}activity"/>
 *         &lt;element name="bounds" type="{http://www.sbml.org/2001/ns/celldesigner}bounds"/>
 *         &lt;element name="font">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="size" type="{http://www.w3.org/2001/XMLSchema}int" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="view" type="{http://www.sbml.org/2001/ns/celldesigner}view"/>
 *         &lt;element name="structuralState" type="{http://www.sbml.org/2001/ns/celldesigner}structuralStateAngle" minOccurs="0"/>
 *         &lt;element name="usualView" type="{http://www.sbml.org/2001/ns/celldesigner}usualView"/>
 *         &lt;element name="briefView" type="{http://www.sbml.org/2001/ns/celldesigner}briefView"/>
 *         &lt;element name="listOfSpeciesTag" type="{http://www.sbml.org/2001/ns/celldesigner}listOfSpeciesTag" minOccurs="0"/>
 *         &lt;element name="info" type="{http://www.sbml.org/2001/ns/celldesigner}info"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.sbml.org/2001/ns/celldesigner}SId">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="species" use="required" type="{http://www.sbml.org/2001/ns/celldesigner}SId" />
 *       &lt;attribute name="compartmentAlias">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.sbml.org/2001/ns/celldesigner}SId">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="complexSpeciesAlias">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.sbml.org/2001/ns/celldesigner}SId">
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
@XmlType(name = "speciesAlias", propOrder = {
    "activity",
    "bounds",
    "font",
    "view",
    "structuralState",
    "usualView",
    "briefView",
    "listOfSpeciesTag",
    "info"
})
public class SpeciesAlias {

    @XmlElement(required = true)
    protected String activity;
    @XmlElement(required = true)
    protected Bounds bounds;
    @XmlElement(required = true)
    protected SpeciesAlias.Font font;
    @XmlElement(required = true)
    protected View view;
    protected StructuralStateAngle structuralState;
    @XmlElement(required = true)
    protected UsualView usualView;
    @XmlElement(required = true)
    protected BriefView briefView;
    protected ListOfSpeciesTag listOfSpeciesTag;
    @XmlElement(required = true)
    protected Info info;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "species", required = true)
    protected String species;
    @XmlAttribute(name = "compartmentAlias")
    protected String compartmentAlias;
    @XmlAttribute(name = "complexSpeciesAlias")
    protected String complexSpeciesAlias;

    /**
     * Gets the value of the activity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivity() {
        return activity;
    }

    /**
     * Sets the value of the activity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivity(String value) {
        this.activity = value;
    }

    /**
     * Gets the value of the bounds property.
     * 
     * @return
     *     possible object is
     *     {@link Bounds }
     *     
     */
    public Bounds getBounds() {
        return bounds;
    }

    /**
     * Sets the value of the bounds property.
     * 
     * @param value
     *     allowed object is
     *     {@link Bounds }
     *     
     */
    public void setBounds(Bounds value) {
        this.bounds = value;
    }

    /**
     * Gets the value of the font property.
     * 
     * @return
     *     possible object is
     *     {@link SpeciesAlias.Font }
     *     
     */
    public SpeciesAlias.Font getFont() {
        return font;
    }

    /**
     * Sets the value of the font property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpeciesAlias.Font }
     *     
     */
    public void setFont(SpeciesAlias.Font value) {
        this.font = value;
    }

    /**
     * Gets the value of the view property.
     * 
     * @return
     *     possible object is
     *     {@link View }
     *     
     */
    public View getView() {
        return view;
    }

    /**
     * Sets the value of the view property.
     * 
     * @param value
     *     allowed object is
     *     {@link View }
     *     
     */
    public void setView(View value) {
        this.view = value;
    }

    /**
     * Gets the value of the structuralState property.
     * 
     * @return
     *     possible object is
     *     {@link StructuralStateAngle }
     *     
     */
    public StructuralStateAngle getStructuralState() {
        return structuralState;
    }

    /**
     * Sets the value of the structuralState property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuralStateAngle }
     *     
     */
    public void setStructuralState(StructuralStateAngle value) {
        this.structuralState = value;
    }

    /**
     * Gets the value of the usualView property.
     * 
     * @return
     *     possible object is
     *     {@link UsualView }
     *     
     */
    public UsualView getUsualView() {
        return usualView;
    }

    /**
     * Sets the value of the usualView property.
     * 
     * @param value
     *     allowed object is
     *     {@link UsualView }
     *     
     */
    public void setUsualView(UsualView value) {
        this.usualView = value;
    }

    /**
     * Gets the value of the briefView property.
     * 
     * @return
     *     possible object is
     *     {@link BriefView }
     *     
     */
    public BriefView getBriefView() {
        return briefView;
    }

    /**
     * Sets the value of the briefView property.
     * 
     * @param value
     *     allowed object is
     *     {@link BriefView }
     *     
     */
    public void setBriefView(BriefView value) {
        this.briefView = value;
    }

    /**
     * Gets the value of the listOfSpeciesTag property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfSpeciesTag }
     *     
     */
    public ListOfSpeciesTag getListOfSpeciesTag() {
        return listOfSpeciesTag;
    }

    /**
     * Sets the value of the listOfSpeciesTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfSpeciesTag }
     *     
     */
    public void setListOfSpeciesTag(ListOfSpeciesTag value) {
        this.listOfSpeciesTag = value;
    }

    /**
     * Gets the value of the info property.
     * 
     * @return
     *     possible object is
     *     {@link Info }
     *     
     */
    public Info getInfo() {
        return info;
    }

    /**
     * Sets the value of the info property.
     * 
     * @param value
     *     allowed object is
     *     {@link Info }
     *     
     */
    public void setInfo(Info value) {
        this.info = value;
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

    /**
     * Gets the value of the compartmentAlias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompartmentAlias() {
        return compartmentAlias;
    }

    /**
     * Sets the value of the compartmentAlias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompartmentAlias(String value) {
        this.compartmentAlias = value;
    }

    /**
     * Gets the value of the complexSpeciesAlias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplexSpeciesAlias() {
        return complexSpeciesAlias;
    }

    /**
     * Sets the value of the complexSpeciesAlias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplexSpeciesAlias(String value) {
        this.complexSpeciesAlias = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="size" type="{http://www.w3.org/2001/XMLSchema}int" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Font {

        @XmlAttribute(name = "size")
        protected Integer size;

        /**
         * Gets the value of the size property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getSize() {
            return size;
        }

        /**
         * Sets the value of the size property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setSize(Integer value) {
            this.size = value;
        }

    }

}
