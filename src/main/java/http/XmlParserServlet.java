package http;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.IOException;

/**
 * Created by К on 20.09.2016.
 */
public class XmlParserServlet extends HttpServlet {
    public XmlParserServlet() {

    }

//    @Override
//    public void doGet(HttpServletRequest request,
//                      HttpServletResponse response) throws ServletException, IOException {
//
//    }

    @Override
    public void doPost(HttpServletRequest request,
                       HttpServletResponse response) throws ServletException, IOException {
        String formXML = request.getParameter("xmlrq");
        if ((formXML == null) || (formXML.equals("")))
            throw new IllegalArgumentException("XML request is empty!");

        try {

            File requestInFile = new File(request.toString());
            JAXBContext jaxbContext = JAXBContext.newInstance(Envelope.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Envelope envelope = (Envelope) jaxbUnmarshaller.unmarshal(requestInFile);

        } catch (Exception ex) {
            System.err.println(ex);
        }
    }

}
