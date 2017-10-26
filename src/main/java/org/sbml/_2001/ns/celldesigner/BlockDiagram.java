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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

// TODO: Auto-generated Javadoc
/**
 * Block diagram for a protein.
 * <p>
 * Java class for blockDiagram complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="blockDiagram">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="canvas" type="{http://www.sbml.org/2001/ns/celldesigner}canvas"/>
 *         &lt;element name="block" type="{http://www.sbml.org/2001/ns/celldesigner}block"/>
 *         &lt;element name="halo" type="{http://www.sbml.org/2001/ns/celldesigner}halo"/>
 *         &lt;element name="listOfResiduesInBlockDiagram" type="{http://www.sbml.org/2001/ns/celldesigner}listOfResiduesInBlockDiagram"/>
 *         &lt;element name="listOfExternalNamesForResidue" type="{http://www.sbml.org/2001/ns/celldesigner}listOfExternalNamesForResidue"/>
 *         &lt;element name="listOfBindingSitesInBlockDiagram" type="{http://www.sbml.org/2001/ns/celldesigner}listOfBindingSitesInBlockDiagram"/>
 *         &lt;element name="listOfEffectSitesInBlockDiagram" type="{http://www.sbml.org/2001/ns/celldesigner}listOfEffectSitesInBlockDiagram"/>
 *         &lt;element name="degradedInBlockDiagram" type="{http://www.sbml.org/2001/ns/celldesigner}degradedInBlockDiagram" minOccurs="0"/>
 *         &lt;element name="listOfInternalOperatorsInBlockDiagram" type="{http://www.sbml.org/2001/ns/celldesigner}listOfInternalOperatorsInBlockDiagram"/>
 *         &lt;element name="listOfInternalLinksInBlockDiagram" type="{http://www.sbml.org/2001/ns/celldesigner}listOfInternalLinksInBlockDiagram"/>
 *       &lt;/sequence>
 *       &lt;attribute name="protein" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.sbml.org/2001/ns/celldesigner}SId">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "blockDiagram", propOrder = {"canvas", "block", "halo",
  "listOfResiduesInBlockDiagram", "listOfExternalNamesForResidue",
  "listOfBindingSitesInBlockDiagram", "listOfEffectSitesInBlockDiagram",
  "degradedInBlockDiagram", "listOfInternalOperatorsInBlockDiagram",
  "listOfInternalLinksInBlockDiagram"})
public class BlockDiagram {

  /** The canvas. */
  @XmlElement(required = true)
  protected Canvas                                canvas;
  /** The block. */
  @XmlElement(required = true)
  protected Block                                 block;
  /** The halo. */
  @XmlElement(required = true)
  protected Halo                                  halo;
  /** The list of residues in block diagram. */
  @XmlElement(required = true)
  protected ListOfResiduesInBlockDiagram          listOfResiduesInBlockDiagram;
  /** The list of external names for residue. */
  @XmlElement(required = true)
  protected ListOfExternalNamesForResidue         listOfExternalNamesForResidue;
  /** The list of binding sites in block diagram. */
  @XmlElement(required = true)
  protected ListOfBindingSitesInBlockDiagram      listOfBindingSitesInBlockDiagram;
  /** The list of effect sites in block diagram. */
  @XmlElement(required = true)
  protected ListOfEffectSitesInBlockDiagram       listOfEffectSitesInBlockDiagram;
  /** The degraded in block diagram. */
  protected DegradedInBlockDiagram                degradedInBlockDiagram;
  /** The list of internal operators in block diagram. */
  @XmlElement(required = true)
  protected ListOfInternalOperatorsInBlockDiagram listOfInternalOperatorsInBlockDiagram;
  /** The list of internal links in block diagram. */
  @XmlElement(required = true)
  protected ListOfInternalLinksInBlockDiagram     listOfInternalLinksInBlockDiagram;
  /** The protein. */
  @XmlAttribute(name = "protein", required = true)
  protected String                                protein;


  /**
   * Gets the value of the canvas property.
   * 
   * @return
   *         possible object is {@link Canvas }
   */
  public Canvas getCanvas() {
    return canvas;
  }


  /**
   * Sets the value of the canvas property.
   * 
   * @param value
   *        allowed object is {@link Canvas }
   */
  public void setCanvas(Canvas value) {
    this.canvas = value;
  }


  /**
   * Gets the value of the block property.
   * 
   * @return
   *         possible object is {@link Block }
   */
  public Block getBlock() {
    return block;
  }


  /**
   * Sets the value of the block property.
   * 
   * @param value
   *        allowed object is {@link Block }
   */
  public void setBlock(Block value) {
    this.block = value;
  }


  /**
   * Gets the value of the halo property.
   * 
   * @return
   *         possible object is {@link Halo }
   */
  public Halo getHalo() {
    return halo;
  }


  /**
   * Sets the value of the halo property.
   * 
   * @param value
   *        allowed object is {@link Halo }
   */
  public void setHalo(Halo value) {
    this.halo = value;
  }


  /**
   * Gets the value of the listOfResiduesInBlockDiagram property.
   * 
   * @return
   *         possible object is {@link ListOfResiduesInBlockDiagram }
   */
  public ListOfResiduesInBlockDiagram getListOfResiduesInBlockDiagram() {
    return listOfResiduesInBlockDiagram;
  }


  /**
   * Sets the value of the listOfResiduesInBlockDiagram property.
   * 
   * @param value
   *        allowed object is {@link ListOfResiduesInBlockDiagram }
   */
  public void setListOfResiduesInBlockDiagram(ListOfResiduesInBlockDiagram value) {
    this.listOfResiduesInBlockDiagram = value;
  }


  /**
   * Gets the value of the listOfExternalNamesForResidue property.
   * 
   * @return
   *         possible object is {@link ListOfExternalNamesForResidue }
   */
  public ListOfExternalNamesForResidue getListOfExternalNamesForResidue() {
    return listOfExternalNamesForResidue;
  }


  /**
   * Sets the value of the listOfExternalNamesForResidue property.
   * 
   * @param value
   *        allowed object is {@link ListOfExternalNamesForResidue }
   */
  public void setListOfExternalNamesForResidue(
    ListOfExternalNamesForResidue value) {
    this.listOfExternalNamesForResidue = value;
  }


  /**
   * Gets the value of the listOfBindingSitesInBlockDiagram property.
   * 
   * @return
   *         possible object is {@link ListOfBindingSitesInBlockDiagram }
   */
  public ListOfBindingSitesInBlockDiagram getListOfBindingSitesInBlockDiagram() {
    return listOfBindingSitesInBlockDiagram;
  }


  /**
   * Sets the value of the listOfBindingSitesInBlockDiagram property.
   * 
   * @param value
   *        allowed object is {@link ListOfBindingSitesInBlockDiagram }
   */
  public void setListOfBindingSitesInBlockDiagram(
    ListOfBindingSitesInBlockDiagram value) {
    this.listOfBindingSitesInBlockDiagram = value;
  }


  /**
   * Gets the value of the listOfEffectSitesInBlockDiagram property.
   * 
   * @return
   *         possible object is {@link ListOfEffectSitesInBlockDiagram }
   */
  public ListOfEffectSitesInBlockDiagram getListOfEffectSitesInBlockDiagram() {
    return listOfEffectSitesInBlockDiagram;
  }


  /**
   * Sets the value of the listOfEffectSitesInBlockDiagram property.
   * 
   * @param value
   *        allowed object is {@link ListOfEffectSitesInBlockDiagram }
   */
  public void setListOfEffectSitesInBlockDiagram(
    ListOfEffectSitesInBlockDiagram value) {
    this.listOfEffectSitesInBlockDiagram = value;
  }


  /**
   * Gets the value of the degradedInBlockDiagram property.
   * 
   * @return
   *         possible object is {@link DegradedInBlockDiagram }
   */
  public DegradedInBlockDiagram getDegradedInBlockDiagram() {
    return degradedInBlockDiagram;
  }


  /**
   * Sets the value of the degradedInBlockDiagram property.
   * 
   * @param value
   *        allowed object is {@link DegradedInBlockDiagram }
   */
  public void setDegradedInBlockDiagram(DegradedInBlockDiagram value) {
    this.degradedInBlockDiagram = value;
  }


  /**
   * Gets the value of the listOfInternalOperatorsInBlockDiagram property.
   * 
   * @return
   *         possible object is {@link ListOfInternalOperatorsInBlockDiagram }
   */
  public ListOfInternalOperatorsInBlockDiagram getListOfInternalOperatorsInBlockDiagram() {
    return listOfInternalOperatorsInBlockDiagram;
  }


  /**
   * Sets the value of the listOfInternalOperatorsInBlockDiagram property.
   * 
   * @param value
   *        allowed object is {@link ListOfInternalOperatorsInBlockDiagram }
   */
  public void setListOfInternalOperatorsInBlockDiagram(
    ListOfInternalOperatorsInBlockDiagram value) {
    this.listOfInternalOperatorsInBlockDiagram = value;
  }


  /**
   * Gets the value of the listOfInternalLinksInBlockDiagram property.
   * 
   * @return
   *         possible object is {@link ListOfInternalLinksInBlockDiagram }
   */
  public ListOfInternalLinksInBlockDiagram getListOfInternalLinksInBlockDiagram() {
    return listOfInternalLinksInBlockDiagram;
  }


  /**
   * Sets the value of the listOfInternalLinksInBlockDiagram property.
   * 
   * @param value
   *        allowed object is {@link ListOfInternalLinksInBlockDiagram }
   */
  public void setListOfInternalLinksInBlockDiagram(
    ListOfInternalLinksInBlockDiagram value) {
    this.listOfInternalLinksInBlockDiagram = value;
  }


  /**
   * Gets the value of the protein property.
   * 
   * @return
   *         possible object is {@link String }
   */
  public String getProtein() {
    return protein;
  }


  /**
   * Sets the value of the protein property.
   * 
   * @param value
   *        allowed object is {@link String }
   */
  public void setProtein(String value) {
    this.protein = value;
  }
}