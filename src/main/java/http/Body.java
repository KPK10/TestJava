package http;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by К on 21.09.2016.
 */

@XmlRootElement
public class Body {
    private SendPayment sendPayment;

    public SendPayment getSendPayment() {
        return sendPayment;
    }

    @XmlElement
    public void setSendPayment(SendPayment sp) {
        this.sendPayment = sp;
    }

}
