package http;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by К on 21.09.2016.
 */

@XmlRootElement
public class Envelope {
    private Body body;

    public Body getBody() {
        return body;
    }

    @XmlElement
    public void setBody(Body body) {
        this.body = body;
    }
}
