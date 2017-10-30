//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package org.w3._1998.math.mathml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Lambda complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Lambda">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.w3.org/1998/Math/MathML}MathBase">
 *       &lt;sequence>
 *         &lt;element name="bvar" type="{http://www.w3.org/1998/Math/MathML}Bvar" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.w3.org/1998/Math/MathML}Node"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Lambda", propOrder = {
    "bvar",
    "apply",
    "cn",
    "ci",
    "csymbol",
    "_true",
    "_false",
    "notanumber",
    "pi",
    "infinity",
    "exponentiale",
    "semantics",
    "piecewise"
})
public class Lambda
    extends MathBase
{

    protected List<Bvar> bvar;
    protected Apply apply;
    protected Cn cn;
    protected Ci ci;
    protected Csymbol csymbol;
    @XmlElement(name = "true")
    protected MathBase _true;
    @XmlElement(name = "false")
    protected MathBase _false;
    protected MathBase notanumber;
    protected MathBase pi;
    protected MathBase infinity;
    protected MathBase exponentiale;
    protected Semantics semantics;
    protected Piecewise piecewise;

    /**
     * Gets the value of the bvar property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bvar property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBvar().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Bvar }
     * 
     * 
     */
    public List<Bvar> getBvar() {
        if (bvar == null) {
            bvar = new ArrayList<Bvar>();
        }
        return this.bvar;
    }

    /**
     * Gets the value of the apply property.
     * 
     * @return
     *     possible object is
     *     {@link Apply }
     *     
     */
    public Apply getApply() {
        return apply;
    }

    /**
     * Sets the value of the apply property.
     * 
     * @param value
     *     allowed object is
     *     {@link Apply }
     *     
     */
    public void setApply(Apply value) {
        this.apply = value;
    }

    /**
     * Gets the value of the cn property.
     * 
     * @return
     *     possible object is
     *     {@link Cn }
     *     
     */
    public Cn getCn() {
        return cn;
    }

    /**
     * Sets the value of the cn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cn }
     *     
     */
    public void setCn(Cn value) {
        this.cn = value;
    }

    /**
     * Gets the value of the ci property.
     * 
     * @return
     *     possible object is
     *     {@link Ci }
     *     
     */
    public Ci getCi() {
        return ci;
    }

    /**
     * Sets the value of the ci property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ci }
     *     
     */
    public void setCi(Ci value) {
        this.ci = value;
    }

    /**
     * Gets the value of the csymbol property.
     * 
     * @return
     *     possible object is
     *     {@link Csymbol }
     *     
     */
    public Csymbol getCsymbol() {
        return csymbol;
    }

    /**
     * Sets the value of the csymbol property.
     * 
     * @param value
     *     allowed object is
     *     {@link Csymbol }
     *     
     */
    public void setCsymbol(Csymbol value) {
        this.csymbol = value;
    }

    /**
     * Gets the value of the true property.
     * 
     * @return
     *     possible object is
     *     {@link MathBase }
     *     
     */
    public MathBase getTrue() {
        return _true;
    }

    /**
     * Sets the value of the true property.
     * 
     * @param value
     *     allowed object is
     *     {@link MathBase }
     *     
     */
    public void setTrue(MathBase value) {
        this._true = value;
    }

    /**
     * Gets the value of the false property.
     * 
     * @return
     *     possible object is
     *     {@link MathBase }
     *     
     */
    public MathBase getFalse() {
        return _false;
    }

    /**
     * Sets the value of the false property.
     * 
     * @param value
     *     allowed object is
     *     {@link MathBase }
     *     
     */
    public void setFalse(MathBase value) {
        this._false = value;
    }

    /**
     * Gets the value of the notanumber property.
     * 
     * @return
     *     possible object is
     *     {@link MathBase }
     *     
     */
    public MathBase getNotanumber() {
        return notanumber;
    }

    /**
     * Sets the value of the notanumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link MathBase }
     *     
     */
    public void setNotanumber(MathBase value) {
        this.notanumber = value;
    }

    /**
     * Gets the value of the pi property.
     * 
     * @return
     *     possible object is
     *     {@link MathBase }
     *     
     */
    public MathBase getPi() {
        return pi;
    }

    /**
     * Sets the value of the pi property.
     * 
     * @param value
     *     allowed object is
     *     {@link MathBase }
     *     
     */
    public void setPi(MathBase value) {
        this.pi = value;
    }

    /**
     * Gets the value of the infinity property.
     * 
     * @return
     *     possible object is
     *     {@link MathBase }
     *     
     */
    public MathBase getInfinity() {
        return infinity;
    }

    /**
     * Sets the value of the infinity property.
     * 
     * @param value
     *     allowed object is
     *     {@link MathBase }
     *     
     */
    public void setInfinity(MathBase value) {
        this.infinity = value;
    }

    /**
     * Gets the value of the exponentiale property.
     * 
     * @return
     *     possible object is
     *     {@link MathBase }
     *     
     */
    public MathBase getExponentiale() {
        return exponentiale;
    }

    /**
     * Sets the value of the exponentiale property.
     * 
     * @param value
     *     allowed object is
     *     {@link MathBase }
     *     
     */
    public void setExponentiale(MathBase value) {
        this.exponentiale = value;
    }

    /**
     * Gets the value of the semantics property.
     * 
     * @return
     *     possible object is
     *     {@link Semantics }
     *     
     */
    public Semantics getSemantics() {
        return semantics;
    }

    /**
     * Sets the value of the semantics property.
     * 
     * @param value
     *     allowed object is
     *     {@link Semantics }
     *     
     */
    public void setSemantics(Semantics value) {
        this.semantics = value;
    }

    /**
     * Gets the value of the piecewise property.
     * 
     * @return
     *     possible object is
     *     {@link Piecewise }
     *     
     */
    public Piecewise getPiecewise() {
        return piecewise;
    }

    /**
     * Sets the value of the piecewise property.
     * 
     * @param value
     *     allowed object is
     *     {@link Piecewise }
     *     
     */
    public void setPiecewise(Piecewise value) {
        this.piecewise = value;
    }

}
