/*******************************************************************************
 * Copyright 2016 Kaito Ii, Akira Funahashi
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB)
// Reference Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source
// schema.
// Generated on: 2016.05.30 at 07:47:34 PM JST
//
package org.sbml._2001.ns.celldesigner;

import java.math.BigInteger;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

// TODO: Auto-generated Javadoc
/**
 * Species inside complexes.
 * <p>
 * Java class for species complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="species">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="notes" type="{http://www.sbml.org/2001/ns/celldesigner}notes" minOccurs="0"/>
 *         &lt;element name="annotation">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;choice>
 *                     &lt;element ref="{http://www.sbml.org/2001/ns/celldesigner}positionToCompartment"/>
 *                     &lt;element ref="{http://www.sbml.org/2001/ns/celldesigner}complexSpecies"/>
 *                   &lt;/choice>
 *                   &lt;element name="speciesIdentity" type="{http://www.sbml.org/2001/ns/celldesigner}speciesIdentity"/>
 *                   &lt;element name="listOfCatalyzedReactions" type="{http://www.sbml.org/2001/ns/celldesigner}listOfCatalyzedReactions" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.sbml.org/2001/ns/celldesigner}SId" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="compartment" type="{http://www.sbml.org/2001/ns/celldesigner}SId" />
 *       &lt;attribute name="initialAmount" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="initialConcentration" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="substanceUnits" type="{http://www.sbml.org/2001/ns/celldesigner}SId" />
 *       &lt;attribute name="spatialSizeUnits" type="{http://www.sbml.org/2001/ns/celldesigner}SId" />
 *       &lt;attribute name="hasOnlySubstanceUnits" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="boundaryCondition" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="charge" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="constant" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "species", propOrder = {"notes", "annotation"})
public class Species {

  /** The notes. */
  protected Notes              notes;
  /** The annotation. */
  @XmlElement(required = true)
  protected Species.Annotation annotation;
  /** The id. */
  @XmlAttribute(name = "id", required = true)
  protected String             id;
  /** The name. */
  @XmlAttribute(name = "name")
  protected String             name;
  /** The compartment. */
  @XmlAttribute(name = "compartment")
  protected String             compartment;
  /** The initial amount. */
  @XmlAttribute(name = "initialAmount")
  protected Double             initialAmount;
  /** The initial concentration. */
  @XmlAttribute(name = "initialConcentration")
  protected Double             initialConcentration;
  /** The substance units. */
  @XmlAttribute(name = "substanceUnits")
  protected String             substanceUnits;
  /** The spatial size units. */
  @XmlAttribute(name = "spatialSizeUnits")
  protected String             spatialSizeUnits;
  /** The has only substance units. */
  @XmlAttribute(name = "hasOnlySubstanceUnits")
  protected Boolean            hasOnlySubstanceUnits;
  /** The boundary condition. */
  @XmlAttribute(name = "boundaryCondition")
  protected Boolean            boundaryCondition;
  /** The charge. */
  @XmlAttribute(name = "charge")
  protected BigInteger         charge;
  /** The constant. */
  @XmlAttribute(name = "constant")
  protected Boolean            constant;


  /**
   * Gets the value of the notes property.
   * 
   * @return
   *         possible object is {@link Notes }
   */
  public Notes getNotes() {
    return notes;
  }


  /**
   * Sets the value of the notes property.
   * 
   * @param value
   *        allowed object is {@link Notes }
   */
  public void setNotes(Notes value) {
    this.notes = value;
  }


  /**
   * Gets the value of the annotation property.
   * 
   * @return
   *         possible object is {@link Species.Annotation }
   */
  public Species.Annotation getAnnotation() {
    return annotation;
  }


  /**
   * Sets the value of the annotation property.
   * 
   * @param value
   *        allowed object is {@link Species.Annotation }
   */
  public void setAnnotation(Species.Annotation value) {
    this.annotation = value;
  }


  /**
   * Gets the value of the id property.
   * 
   * @return
   *         possible object is {@link String }
   */
  public String getId() {
    return id;
  }


  /**
   * Sets the value of the id property.
   * 
   * @param value
   *        allowed object is {@link String }
   */
  public void setId(String value) {
    this.id = value;
  }


  /**
   * Gets the value of the name property.
   * 
   * @return
   *         possible object is {@link String }
   */
  public String getName() {
    return name;
  }


  /**
   * Sets the value of the name property.
   * 
   * @param value
   *        allowed object is {@link String }
   */
  public void setName(String value) {
    this.name = value;
  }


  /**
   * Gets the value of the compartment property.
   * 
   * @return
   *         possible object is {@link String }
   */
  public String getCompartment() {
    return compartment;
  }


  /**
   * Sets the value of the compartment property.
   * 
   * @param value
   *        allowed object is {@link String }
   */
  public void setCompartment(String value) {
    this.compartment = value;
  }


  /**
   * Gets the value of the initialAmount property.
   * 
   * @return
   *         possible object is {@link Double }
   */
  public Double getInitialAmount() {
    return initialAmount;
  }


  /**
   * Sets the value of the initialAmount property.
   * 
   * @param value
   *        allowed object is {@link Double }
   */
  public void setInitialAmount(Double value) {
    this.initialAmount = value;
  }


  /**
   * Gets the value of the initialConcentration property.
   * 
   * @return
   *         possible object is {@link Double }
   */
  public Double getInitialConcentration() {
    return initialConcentration;
  }


  /**
   * Sets the value of the initialConcentration property.
   * 
   * @param value
   *        allowed object is {@link Double }
   */
  public void setInitialConcentration(Double value) {
    this.initialConcentration = value;
  }


  /**
   * Gets the value of the substanceUnits property.
   * 
   * @return
   *         possible object is {@link String }
   */
  public String getSubstanceUnits() {
    return substanceUnits;
  }


  /**
   * Sets the value of the substanceUnits property.
   * 
   * @param value
   *        allowed object is {@link String }
   */
  public void setSubstanceUnits(String value) {
    this.substanceUnits = value;
  }


  /**
   * Gets the value of the spatialSizeUnits property.
   * 
   * @return
   *         possible object is {@link String }
   */
  public String getSpatialSizeUnits() {
    return spatialSizeUnits;
  }


  /**
   * Sets the value of the spatialSizeUnits property.
   * 
   * @param value
   *        allowed object is {@link String }
   */
  public void setSpatialSizeUnits(String value) {
    this.spatialSizeUnits = value;
  }


  /**
   * Gets the value of the hasOnlySubstanceUnits property.
   * 
   * @return
   *         possible object is {@link Boolean }
   */
  public boolean isHasOnlySubstanceUnits() {
    if (hasOnlySubstanceUnits == null) {
      return false;
    } else {
      return hasOnlySubstanceUnits;
    }
  }


  /**
   * Sets the value of the hasOnlySubstanceUnits property.
   * 
   * @param value
   *        allowed object is {@link Boolean }
   */
  public void setHasOnlySubstanceUnits(Boolean value) {
    this.hasOnlySubstanceUnits = value;
  }


  /**
   * Gets the value of the boundaryCondition property.
   * 
   * @return
   *         possible object is {@link Boolean }
   */
  public boolean isBoundaryCondition() {
    if (boundaryCondition == null) {
      return false;
    } else {
      return boundaryCondition;
    }
  }


  /**
   * Sets the value of the boundaryCondition property.
   * 
   * @param value
   *        allowed object is {@link Boolean }
   */
  public void setBoundaryCondition(Boolean value) {
    this.boundaryCondition = value;
  }


  /**
   * Gets the value of the charge property.
   * 
   * @return
   *         possible object is {@link BigInteger }
   */
  public BigInteger getCharge() {
    return charge;
  }


  /**
   * Sets the value of the charge property.
   * 
   * @param value
   *        allowed object is {@link BigInteger }
   */
  public void setCharge(BigInteger value) {
    this.charge = value;
  }


  /**
   * Gets the value of the constant property.
   * 
   * @return
   *         possible object is {@link Boolean }
   */
  public boolean isConstant() {
    if (constant == null) {
      return false;
    } else {
      return constant;
    }
  }


  /**
   * Sets the value of the constant property.
   * 
   * @param value
   *        allowed object is {@link Boolean }
   */
  public void setConstant(Boolean value) {
    this.constant = value;
  }

  /**
   * <p>
   * Java class for anonymous complex type.
   * <p>
   * The following schema fragment specifies the expected content contained
   * within this class.
   * 
   * <pre>
   * &lt;complexType>
   *   &lt;complexContent>
   *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *       &lt;sequence>
   *         &lt;choice>
   *           &lt;element ref="{http://www.sbml.org/2001/ns/celldesigner}positionToCompartment"/>
   *           &lt;element ref="{http://www.sbml.org/2001/ns/celldesigner}complexSpecies"/>
   *         &lt;/choice>
   *         &lt;element name="speciesIdentity" type="{http://www.sbml.org/2001/ns/celldesigner}speciesIdentity"/>
   *         &lt;element name="listOfCatalyzedReactions" type="{http://www.sbml.org/2001/ns/celldesigner}listOfCatalyzedReactions" minOccurs="0"/>
   *       &lt;/sequence>
   *     &lt;/restriction>
   *   &lt;/complexContent>
   * &lt;/complexType>
   * </pre>
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(name = "", propOrder = {"positionToCompartment", "complexSpecies",
    "speciesIdentity", "listOfCatalyzedReactions"})
  public static class Annotation {

    /** The position to compartment. */
    protected String                   positionToCompartment;
    /** The complex species. */
    protected String                   complexSpecies;
    /** The species identity. */
    @XmlElement(required = true)
    protected SpeciesIdentity          speciesIdentity;
    /** The list of catalyzed reactions. */
    protected ListOfCatalyzedReactions listOfCatalyzedReactions;


    /**
     * Gets the value of the positionToCompartment property.
     * 
     * @return
     *         possible object is {@link String }
     */
    public String getPositionToCompartment() {
      return positionToCompartment;
    }


    /**
     * Sets the value of the positionToCompartment property.
     * 
     * @param value
     *        allowed object is {@link String }
     */
    public void setPositionToCompartment(String value) {
      this.positionToCompartment = value;
    }


    /**
     * Gets the value of the complexSpecies property.
     * 
     * @return
     *         possible object is {@link String }
     */
    public String getComplexSpecies() {
      return complexSpecies;
    }


    /**
     * Sets the value of the complexSpecies property.
     * 
     * @param value
     *        allowed object is {@link String }
     */
    public void setComplexSpecies(String value) {
      this.complexSpecies = value;
    }


    /**
     * Gets the value of the speciesIdentity property.
     * 
     * @return
     *         possible object is {@link SpeciesIdentity }
     */
    public SpeciesIdentity getSpeciesIdentity() {
      return speciesIdentity;
    }


    /**
     * Sets the value of the speciesIdentity property.
     * 
     * @param value
     *        allowed object is {@link SpeciesIdentity }
     */
    public void setSpeciesIdentity(SpeciesIdentity value) {
      this.speciesIdentity = value;
    }


    /**
     * Gets the value of the listOfCatalyzedReactions property.
     * 
     * @return
     *         possible object is {@link ListOfCatalyzedReactions }
     */
    public ListOfCatalyzedReactions getListOfCatalyzedReactions() {
      return listOfCatalyzedReactions;
    }


    /**
     * Sets the value of the listOfCatalyzedReactions property.
     * 
     * @param value
     *        allowed object is {@link ListOfCatalyzedReactions }
     */
    public void setListOfCatalyzedReactions(ListOfCatalyzedReactions value) {
      this.listOfCatalyzedReactions = value;
    }
  }
}
