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
import javax.xml.bind.annotation.XmlType;

// TODO: Auto-generated Javadoc
/**
 * <p>
 * Java class for info complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="info">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="prefix" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="label" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="angle" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "info")
public class Info {

  /** The state. */
  @XmlAttribute(name = "state")
  protected String     state;
  /** The prefix. */
  @XmlAttribute(name = "prefix")
  protected String     prefix;
  /** The label. */
  @XmlAttribute(name = "label")
  protected String     label;
  /** The angle. */
  @XmlAttribute(name = "angle", required = true)
  protected BigDecimal angle;


  /**
   * Gets the value of the state property.
   * 
   * @return
   *         possible object is {@link String }
   */
  public String getState() {
    return state;
  }


  /**
   * Sets the value of the state property.
   * 
   * @param value
   *        allowed object is {@link String }
   */
  public void setState(String value) {
    this.state = value;
  }


  /**
   * Gets the value of the prefix property.
   * 
   * @return
   *         possible object is {@link String }
   */
  public String getPrefix() {
    return prefix;
  }


  /**
   * Sets the value of the prefix property.
   * 
   * @param value
   *        allowed object is {@link String }
   */
  public void setPrefix(String value) {
    this.prefix = value;
  }


  /**
   * Gets the value of the label property.
   * 
   * @return
   *         possible object is {@link String }
   */
  public String getLabel() {
    return label;
  }


  /**
   * Sets the value of the label property.
   * 
   * @param value
   *        allowed object is {@link String }
   */
  public void setLabel(String value) {
    this.label = value;
  }


  /**
   * Gets the value of the angle property.
   * 
   * @return
   *         possible object is {@link BigDecimal }
   */
  public BigDecimal getAngle() {
    return angle;
  }


  /**
   * Sets the value of the angle property.
   * 
   * @param value
   *        allowed object is {@link BigDecimal }
   */
  public void setAngle(BigDecimal value) {
    this.angle = value;
  }
}