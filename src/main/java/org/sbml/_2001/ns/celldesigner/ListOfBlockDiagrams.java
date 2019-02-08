//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package org.sbml._2001.ns.celldesigner;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * List of block diagrams.
 * 
 * <p>Java class for listOfBlockDiagrams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listOfBlockDiagrams">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="blockDiagram" type="{http://www.sbml.org/2001/ns/celldesigner}blockDiagram" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listOfBlockDiagrams", propOrder = {
    "blockDiagram"
})
public class ListOfBlockDiagrams {

    protected List<BlockDiagram> blockDiagram;

    /**
     * Gets the value of the blockDiagram property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the blockDiagram property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBlockDiagram().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BlockDiagram }
     * 
     * 
     */
    public List<BlockDiagram> getBlockDiagram() {
        if (blockDiagram == null) {
            blockDiagram = new ArrayList<BlockDiagram>();
        }
        return this.blockDiagram;
    }

}
