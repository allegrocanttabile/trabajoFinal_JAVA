
package ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ReadTransporteResponse_QNAME = new QName("http://ws/", "readTransporteResponse");
    private final static QName _CreateTransporte_QNAME = new QName("http://ws/", "createTransporte");
    private final static QName _CreateTransporteResponse_QNAME = new QName("http://ws/", "createTransporteResponse");
    private final static QName _ReadTransporte_QNAME = new QName("http://ws/", "readTransporte");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ReadTransporteResponse }
     * 
     */
    public ReadTransporteResponse createReadTransporteResponse() {
        return new ReadTransporteResponse();
    }

    /**
     * Create an instance of {@link CreateTransporte }
     * 
     */
    public CreateTransporte createCreateTransporte() {
        return new CreateTransporte();
    }

    /**
     * Create an instance of {@link CreateTransporteResponse }
     * 
     */
    public CreateTransporteResponse createCreateTransporteResponse() {
        return new CreateTransporteResponse();
    }

    /**
     * Create an instance of {@link ReadTransporte }
     * 
     */
    public ReadTransporte createReadTransporte() {
        return new ReadTransporte();
    }

    /**
     * Create an instance of {@link TransporteBean }
     * 
     */
    public TransporteBean createTransporteBean() {
        return new TransporteBean();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadTransporteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "readTransporteResponse")
    public JAXBElement<ReadTransporteResponse> createReadTransporteResponse(ReadTransporteResponse value) {
        return new JAXBElement<ReadTransporteResponse>(_ReadTransporteResponse_QNAME, ReadTransporteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateTransporte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "createTransporte")
    public JAXBElement<CreateTransporte> createCreateTransporte(CreateTransporte value) {
        return new JAXBElement<CreateTransporte>(_CreateTransporte_QNAME, CreateTransporte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateTransporteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "createTransporteResponse")
    public JAXBElement<CreateTransporteResponse> createCreateTransporteResponse(CreateTransporteResponse value) {
        return new JAXBElement<CreateTransporteResponse>(_CreateTransporteResponse_QNAME, CreateTransporteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadTransporte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "readTransporte")
    public JAXBElement<ReadTransporte> createReadTransporte(ReadTransporte value) {
        return new JAXBElement<ReadTransporte>(_ReadTransporte_QNAME, ReadTransporte.class, null, value);
    }

}
