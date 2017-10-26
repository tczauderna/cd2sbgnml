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
package org.w3._1998.math.mathml;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

// TODO: Auto-generated Javadoc
/**
 * <p>
 * Java class for Annotation complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="Annotation">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attGroup ref="{http://www.w3.org/1998/Math/MathML}AnnotationAttributes"/>
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Annotation", propOrder = {"value"})
public class Annotation {

  /** The value. */
  @XmlValue
  protected String       value;
  /** The encoding. */
  @XmlAttribute(name = "encoding", required = true)
  protected String       encoding;
  /** The clazz. */
  @XmlAttribute(name = "class")
  @XmlSchemaType(name = "NMTOKENS")
  protected List<String> clazz;
  /** The style. */
  @XmlAttribute(name = "style")
  protected String       style;
  /** The id. */
  @XmlAttribute(name = "id")
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  @XmlID
  @XmlSchemaType(name = "ID")
  protected String       id;


  /**
   * Gets the value of the value property.
   * 
   * @return
   *         possible object is {@link String }
   */
  public String getValue() {
    return value;
  }


  /**
   * Sets the value of the value property.
   * 
   * @param value
   *        allowed object is {@link String }
   */
  public void setValue(String value) {
    this.value = value;
  }


  /**
   * Gets the value of the encoding property.
   * 
   * @return
   *         possible object is {@link String }
   */
  public String getEncoding() {
    return encoding;
  }


  /**
   * Sets the value of the encoding property.
   * 
   * @param value
   *        allowed object is {@link String }
   */
  public void setEncoding(String value) {
    this.encoding = value;
  }


  /**
   * Gets the value of the clazz property.
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the clazz property.
   * <p>
   * For example, to add a new item, do as follows:
   * 
   * <pre>
   * getClazz().add(newItem);
   * </pre>
   * <p>
   * Objects of the following type(s) are allowed in the list {@link String }
   *
   * @return the clazz
   */
  public List<String> getClazz() {
    if (clazz == null) {
      clazz = new ArrayList<String>();
    }
    return this.clazz;
  }


  /**
   * Gets the value of the style property.
   * 
   * @return
   *         possible object is {@link String }
   */
  public String getStyle() {
    return style;
  }


  /**
   * Sets the value of the style property.
   * 
   * @param value
   *        allowed object is {@link String }
   */
  public void setStyle(String value) {
    this.style = value;
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
}