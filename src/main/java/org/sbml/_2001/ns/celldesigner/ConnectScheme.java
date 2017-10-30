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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Connection scheme.
 * 
 * <p>Java class for connectScheme complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="connectScheme">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listOfLineDirection" type="{http://www.sbml.org/2001/ns/celldesigner}listOfLineDirection"/>
 *       &lt;/sequence>
 *       &lt;attribute name="connectPolicy" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="direct"/>
 *             &lt;enumeration value="square"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="rectangleIndex" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "connectScheme", propOrder = {
    "listOfLineDirection"
})
public class ConnectScheme {

    @XmlElement(required = true)
    protected ListOfLineDirection listOfLineDirection;
    @XmlAttribute(name = "connectPolicy", required = true)
    protected String connectPolicy;
    @XmlAttribute(name = "rectangleIndex")
    @XmlSchemaType(name = "anySimpleType")
    protected String rectangleIndex;

    /**
     * Gets the value of the listOfLineDirection property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfLineDirection }
     *     
     */
    public ListOfLineDirection getListOfLineDirection() {
        return listOfLineDirection;
    }

    /**
     * Sets the value of the listOfLineDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfLineDirection }
     *     
     */
    public void setListOfLineDirection(ListOfLineDirection value) {
        this.listOfLineDirection = value;
    }

    /**
     * Gets the value of the connectPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectPolicy() {
        return connectPolicy;
    }

    /**
     * Sets the value of the connectPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectPolicy(String value) {
        this.connectPolicy = value;
    }

    /**
     * Gets the value of the rectangleIndex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRectangleIndex() {
        return rectangleIndex;
    }

    /**
     * Sets the value of the rectangleIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRectangleIndex(String value) {
        this.rectangleIndex = value;
    }

}
