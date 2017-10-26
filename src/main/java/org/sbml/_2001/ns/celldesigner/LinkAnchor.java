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
import javax.xml.bind.annotation.XmlType;

// TODO: Auto-generated Javadoc
/**
 * Link position designator to species alias.
 * <p>
 * Java class for linkAnchor complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="linkAnchor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="position" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="N"/>
 *             &lt;enumeration value="NNE"/>
 *             &lt;enumeration value="NE"/>
 *             &lt;enumeration value="ENE"/>
 *             &lt;enumeration value="E"/>
 *             &lt;enumeration value="ESE"/>
 *             &lt;enumeration value="SE"/>
 *             &lt;enumeration value="SSE"/>
 *             &lt;enumeration value="S"/>
 *             &lt;enumeration value="SSW"/>
 *             &lt;enumeration value="SW"/>
 *             &lt;enumeration value="WSW"/>
 *             &lt;enumeration value="W"/>
 *             &lt;enumeration value="WNW"/>
 *             &lt;enumeration value="NW"/>
 *             &lt;enumeration value="NNW"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "linkAnchor")
public class LinkAnchor {

  /** The position. */
  @XmlAttribute(name = "position", required = true)
  protected String position;


  /**
   * Gets the value of the position property.
   * 
   * @return
   *         possible object is {@link String }
   */
  public String getPosition() {
    return position;
  }


  /**
   * Sets the value of the position property.
   * 
   * @param value
   *        allowed object is {@link String }
   */
  public void setPosition(String value) {
    this.position = value;
  }
}
