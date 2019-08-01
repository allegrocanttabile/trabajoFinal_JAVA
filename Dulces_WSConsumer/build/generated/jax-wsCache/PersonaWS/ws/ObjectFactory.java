
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

    private final static QName _CreateSPersonaResponse_QNAME = new QName("http://ws/", "createSPersonaResponse");
    private final static QName _LoginSPersona_QNAME = new QName("http://ws/", "loginSPersona");
    private final static QName _ReadSPersona_QNAME = new QName("http://ws/", "readSPersona");
    private final static QName _FindSPersonaResponse_QNAME = new QName("http://ws/", "findSPersonaResponse");
    private final static QName _DeleteSPersona_QNAME = new QName("http://ws/", "deleteSPersona");
    private final static QName _ReadSPersonaResponse_QNAME = new QName("http://ws/", "readSPersonaResponse");
    private final static QName _CreateSPersona_QNAME = new QName("http://ws/", "createSPersona");
    private final static QName _UpdateSPersonaResponse_QNAME = new QName("http://ws/", "updateSPersonaResponse");
    private final static QName _DeleteSPersonaResponse_QNAME = new QName("http://ws/", "deleteSPersonaResponse");
    private final static QName _FindSPersona_QNAME = new QName("http://ws/", "findSPersona");
    private final static QName _LoginSPersonaResponse_QNAME = new QName("http://ws/", "loginSPersonaResponse");
    private final static QName _UpdateSPersona_QNAME = new QName("http://ws/", "updateSPersona");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreateSPersonaResponse }
     * 
     */
    public CreateSPersonaResponse createCreateSPersonaResponse() {
        return new CreateSPersonaResponse();
    }

    /**
     * Create an instance of {@link LoginSPersona }
     * 
     */
    public LoginSPersona createLoginSPersona() {
        return new LoginSPersona();
    }

    /**
     * Create an instance of {@link ReadSPersona }
     * 
     */
    public ReadSPersona createReadSPersona() {
        return new ReadSPersona();
    }

    /**
     * Create an instance of {@link FindSPersonaResponse }
     * 
     */
    public FindSPersonaResponse createFindSPersonaResponse() {
        return new FindSPersonaResponse();
    }

    /**
     * Create an instance of {@link DeleteSPersona }
     * 
     */
    public DeleteSPersona createDeleteSPersona() {
        return new DeleteSPersona();
    }

    /**
     * Create an instance of {@link ReadSPersonaResponse }
     * 
     */
    public ReadSPersonaResponse createReadSPersonaResponse() {
        return new ReadSPersonaResponse();
    }

    /**
     * Create an instance of {@link CreateSPersona }
     * 
     */
    public CreateSPersona createCreateSPersona() {
        return new CreateSPersona();
    }

    /**
     * Create an instance of {@link UpdateSPersonaResponse }
     * 
     */
    public UpdateSPersonaResponse createUpdateSPersonaResponse() {
        return new UpdateSPersonaResponse();
    }

    /**
     * Create an instance of {@link DeleteSPersonaResponse }
     * 
     */
    public DeleteSPersonaResponse createDeleteSPersonaResponse() {
        return new DeleteSPersonaResponse();
    }

    /**
     * Create an instance of {@link FindSPersona }
     * 
     */
    public FindSPersona createFindSPersona() {
        return new FindSPersona();
    }

    /**
     * Create an instance of {@link LoginSPersonaResponse }
     * 
     */
    public LoginSPersonaResponse createLoginSPersonaResponse() {
        return new LoginSPersonaResponse();
    }

    /**
     * Create an instance of {@link UpdateSPersona }
     * 
     */
    public UpdateSPersona createUpdateSPersona() {
        return new UpdateSPersona();
    }

    /**
     * Create an instance of {@link PersonaBean }
     * 
     */
    public PersonaBean createPersonaBean() {
        return new PersonaBean();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateSPersonaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "createSPersonaResponse")
    public JAXBElement<CreateSPersonaResponse> createCreateSPersonaResponse(CreateSPersonaResponse value) {
        return new JAXBElement<CreateSPersonaResponse>(_CreateSPersonaResponse_QNAME, CreateSPersonaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginSPersona }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "loginSPersona")
    public JAXBElement<LoginSPersona> createLoginSPersona(LoginSPersona value) {
        return new JAXBElement<LoginSPersona>(_LoginSPersona_QNAME, LoginSPersona.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadSPersona }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "readSPersona")
    public JAXBElement<ReadSPersona> createReadSPersona(ReadSPersona value) {
        return new JAXBElement<ReadSPersona>(_ReadSPersona_QNAME, ReadSPersona.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindSPersonaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "findSPersonaResponse")
    public JAXBElement<FindSPersonaResponse> createFindSPersonaResponse(FindSPersonaResponse value) {
        return new JAXBElement<FindSPersonaResponse>(_FindSPersonaResponse_QNAME, FindSPersonaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteSPersona }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "deleteSPersona")
    public JAXBElement<DeleteSPersona> createDeleteSPersona(DeleteSPersona value) {
        return new JAXBElement<DeleteSPersona>(_DeleteSPersona_QNAME, DeleteSPersona.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadSPersonaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "readSPersonaResponse")
    public JAXBElement<ReadSPersonaResponse> createReadSPersonaResponse(ReadSPersonaResponse value) {
        return new JAXBElement<ReadSPersonaResponse>(_ReadSPersonaResponse_QNAME, ReadSPersonaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateSPersona }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "createSPersona")
    public JAXBElement<CreateSPersona> createCreateSPersona(CreateSPersona value) {
        return new JAXBElement<CreateSPersona>(_CreateSPersona_QNAME, CreateSPersona.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateSPersonaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "updateSPersonaResponse")
    public JAXBElement<UpdateSPersonaResponse> createUpdateSPersonaResponse(UpdateSPersonaResponse value) {
        return new JAXBElement<UpdateSPersonaResponse>(_UpdateSPersonaResponse_QNAME, UpdateSPersonaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteSPersonaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "deleteSPersonaResponse")
    public JAXBElement<DeleteSPersonaResponse> createDeleteSPersonaResponse(DeleteSPersonaResponse value) {
        return new JAXBElement<DeleteSPersonaResponse>(_DeleteSPersonaResponse_QNAME, DeleteSPersonaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindSPersona }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "findSPersona")
    public JAXBElement<FindSPersona> createFindSPersona(FindSPersona value) {
        return new JAXBElement<FindSPersona>(_FindSPersona_QNAME, FindSPersona.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginSPersonaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "loginSPersonaResponse")
    public JAXBElement<LoginSPersonaResponse> createLoginSPersonaResponse(LoginSPersonaResponse value) {
        return new JAXBElement<LoginSPersonaResponse>(_LoginSPersonaResponse_QNAME, LoginSPersonaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateSPersona }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "updateSPersona")
    public JAXBElement<UpdateSPersona> createUpdateSPersona(UpdateSPersona value) {
        return new JAXBElement<UpdateSPersona>(_UpdateSPersona_QNAME, UpdateSPersona.class, null, value);
    }

}
