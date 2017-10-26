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
 * Assigned value to the operator.
 * <p>
 * Java class for internalOperatorValueInBlockDiagram complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="internalOperatorValueInBlockDiagram">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="value" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="offsetX" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="offsetY" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "internalOperatorValueInBlockDiagram")
public class InternalOperatorValueInBlockDiagram {

  /** The value. */
  @XmlAttribute(name = "value", required = true)
  protected BigDecimal value;
  /** The offset X. */
  @XmlAttribute(name = "offsetX", required = true)
  protected BigDecimal offsetX;
  /** The offset Y. */
  @XmlAttribute(name = "offsetY", required = true)
  protected BigDecimal offsetY;


  /**
   * Gets the value of the value property.
   * 
   * @return
   *         possible object is {@link BigDecimal }
   */
  public BigDecimal getValue() {
    return value;
  }


  /**
   * Sets the value of the value property.
   * 
   * @param value
   *        allowed object is {@link BigDecimal }
   */
  public void setValue(BigDecimal value) {
    this.value = value;
  }


  /**
   * Gets the value of the offsetX property.
   * 
   * @return
   *         possible object is {@link BigDecimal }
   */
  public BigDecimal getOffsetX() {
    return offsetX;
  }


  /**
   * Sets the value of the offsetX property.
   * 
   * @param value
   *        allowed object is {@link BigDecimal }
   */
  public void setOffsetX(BigDecimal value) {
    this.offsetX = value;
  }


  /**
   * Gets the value of the offsetY property.
   * 
   * @return
   *         possible object is {@link BigDecimal }
   */
  public BigDecimal getOffsetY() {
    return offsetY;
  }


  /**
   * Sets the value of the offsetY property.
   * 
   * @param value
   *        allowed object is {@link BigDecimal }
   */
  public void setOffsetY(BigDecimal value) {
    this.offsetY = value;
  }
}
