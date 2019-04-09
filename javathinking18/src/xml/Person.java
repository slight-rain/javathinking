package xml;


import org.w3c.dom.Element;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.FileWriter;
import java.io.IOException;
@XmlRootElement
public class Person {
    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    private String first,last;
    public Person(){};
    public Person(String f,String l){
        first=f;
        last=l;
    }
    public void getXml() throws JAXBException {
        JAXBContext jaxbContext=JAXBContext.newInstance(this.getClass());
        Marshaller marshaller=jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,Boolean.TRUE);
        FileWriter fw = null;
        try {
            fw = new FileWriter("test.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        marshaller.marshal(this, fw);
    }
    public static void main(String[] args) throws JAXBException {
        Person p=new Person();
        p.setFirst("12345");
        p.setLast("ssdlh");
        p.getXml();
    }

}
