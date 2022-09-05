//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.09.02 at 05:31:39 PM SAMT 
//


package oao.rzd.trains;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Train complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Train">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="locomotive-type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="form-date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="wagons" type="{http://trains.rzd.oao}Wagons"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Train", propOrder = {
    "id",
    "name",
    "locomotiveType",
    "formDate",
    "wagons"
})
@XmlRootElement
public class Train {

    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(name = "locomotive-type", required = true)
    protected String locomotiveType;
    @XmlElement(name = "form-date", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar formDate;
    @XmlElement(required = true)
    protected Wagons wagons;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the locomotiveType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocomotiveType() {
        return locomotiveType;
    }

    /**
     * Sets the value of the locomotiveType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocomotiveType(String value) {
        this.locomotiveType = value;
    }

    /**
     * Gets the value of the formDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFormDate() {
        return formDate;
    }

    /**
     * Sets the value of the formDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFormDate(XMLGregorianCalendar value) {
        this.formDate = value;
    }

    /**
     * Gets the value of the wagons property.
     * 
     * @return
     *     possible object is
     *     {@link Wagons }
     *     
     */
    public Wagons getWagons() {
        return wagons;
    }

    /**
     * Sets the value of the wagons property.
     * 
     * @param value
     *     allowed object is
     *     {@link Wagons }
     *     
     */
    public void setWagons(Wagons value) {
        this.wagons = value;
    }

}