//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.01.15 at 12:19:26 PM CET 
//


package introsde.finalproject.rest.generated;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for measureType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="measureType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idMeasure" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="measureDefinition" type="{}measureDefinitionType"/>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="timestamp" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "measureType", propOrder = {
    "idMeasure",
    "measureDefinition",
    "value",
    "timestamp"
})
public class MeasureType {

    @XmlElement(required = true)
    protected BigInteger idMeasure;
    @XmlElement(required = true)
    protected MeasureDefinitionType measureDefinition;
    @XmlElement(required = true)
    protected String value;
    @XmlElement(required = true)
    protected String timestamp;

    /**
     * Gets the value of the idMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIdMeasure() {
        return idMeasure;
    }

    /**
     * Sets the value of the idMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIdMeasure(BigInteger value) {
        this.idMeasure = value;
    }

    /**
     * Gets the value of the measureDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureDefinitionType }
     *     
     */
    public MeasureDefinitionType getMeasureDefinition() {
        return measureDefinition;
    }

    /**
     * Sets the value of the measureDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureDefinitionType }
     *     
     */
    public void setMeasureDefinition(MeasureDefinitionType value) {
        this.measureDefinition = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimestamp(String value) {
        this.timestamp = value;
    }

}
