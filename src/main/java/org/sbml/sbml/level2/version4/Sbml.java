//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package org.sbml.sbml.level2.version4;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sbml.org/sbml/level2/version4}SBase">
 *       &lt;sequence>
 *         &lt;element name="model" type="{http://www.sbml.org/sbml/level2/version4}Model"/>
 *       &lt;/sequence>
 *       &lt;attribute name="level" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" fixed="2" />
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" fixed="4" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "model"
})
@XmlRootElement(name = "sbml")
public class Sbml
    extends SBase
{

    @XmlElement(required = true)
    protected Model model;
    @XmlAttribute(name = "level", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger level;
    @XmlAttribute(name = "version", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger version;

    /**
     * Gets the value of the model property.
     * 
     * @return
     *     possible object is
     *     {@link Model }
     *     
     */
    public Model getModel() {
        return model;
    }

    /**
     * Sets the value of the model property.
     * 
     * @param value
     *     allowed object is
     *     {@link Model }
     *     
     */
    public void setModel(Model value) {
        this.model = value;
    }

    /**
     * Gets the value of the level property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLevel() {
        if (level == null) {
            return new BigInteger("2");
        } else {
            return level;
        }
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLevel(BigInteger value) {
        this.level = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVersion() {
        if (version == null) {
            return new BigInteger("4");
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVersion(BigInteger value) {
        this.version = value;
    }

}
