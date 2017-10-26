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

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

// TODO: Auto-generated Javadoc
/**
 * Specific region on nucleotide.
 * <p>
 * Java class for region complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="region">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="id" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.sbml.org/2001/ns/celldesigner}SId">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="size" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *             &lt;minInclusive value="0.0"/>
 *             &lt;maxInclusive value="1.0"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="pos">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *             &lt;minInclusive value="0.0"/>
 *             &lt;maxInclusive value="1.0"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="type">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="proteinBindingDomain"/>
 *             &lt;enumeration value="Modification Site"/>
 *             &lt;enumeration value="transcriptionStartingSiteL"/>
 *             &lt;enumeration value="transcriptionStartingSiteR"/>
 *             &lt;enumeration value="CodingRegion"/>
 *             &lt;enumeration value="RegulatoryRegion"/>
 *             &lt;enumeration value="empty"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="name">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="active" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "region")
@XmlSeeAlso({org.sbml._2001.ns.celldesigner.ListOfRegions.Region.class})
public class Region {

  /** The id. */
  @XmlAttribute(name = "id", required = true)
  protected String     id;
  /** The size. */
  @XmlAttribute(name = "size", required = true)
  protected BigDecimal size;
  /** The pos. */
  @XmlAttribute(name = "pos")
  protected BigDecimal pos;
  /** The type. */
  @XmlAttribute(name = "type")
  protected String     type;
  /** The name. */
  @XmlAttribute(name = "name")
  protected String     name;
  /** The active. */
  @XmlAttribute(name = "active")
  protected Boolean    active;


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
   * Gets the value of the size property.
   * 
   * @return
   *         possible object is {@link BigDecimal }
   */
  public BigDecimal getSize() {
    return size;
  }


  /**
   * Sets the value of the size property.
   * 
   * @param value
   *        allowed object is {@link BigDecimal }
   */
  public void setSize(BigDecimal value) {
    this.size = value;
  }


  /**
   * Gets the value of the pos property.
   * 
   * @return
   *         possible object is {@link BigDecimal }
   */
  public BigDecimal getPos() {
    return pos;
  }


  /**
   * Sets the value of the pos property.
   * 
   * @param value
   *        allowed object is {@link BigDecimal }
   */
  public void setPos(BigDecimal value) {
    this.pos = value;
  }


  /**
   * Gets the value of the type property.
   * 
   * @return
   *         possible object is {@link String }
   */
  public String getType() {
    return type;
  }


  /**
   * Sets the value of the type property.
   * 
   * @param value
   *        allowed object is {@link String }
   */
  public void setType(String value) {
    this.type = value;
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
   * Gets the value of the active property.
   * 
   * @return
   *         possible object is {@link Boolean }
   */
  public Boolean isActive() {
    return active;
  }


  /**
   * Sets the value of the active property.
   * 
   * @param value
   *        allowed object is {@link Boolean }
   */
  public void setActive(Boolean value) {
    this.active = value;
  }
}