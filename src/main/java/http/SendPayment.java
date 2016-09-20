package http;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by К on 21.09.2016.
 */

@XmlRootElement
public class SendPayment {
    private String amount;
    private Field[] field;
    private String token;
    private String requestId;
    private String page;
    private String cardNumber;
    private String currency;
    private Account[] account;

    public String getAmount() {
        return amount;
    }

    @XmlElement
    public void setAmount(String amount) {
        this.amount = amount;
    }

    public Field[] getField() {
        return field;
    }

    @XmlElement
    public void setField(Field[] field) {
        this.field = field;
    }

    public String getToken() {
        return token;
    }

    @XmlElement
    public void setToken(String token) {
        this.token = token;
    }

    public String getRequestId() {
        return requestId;
    }

    @XmlElement
    public void setRequestId(String requestId)
    {
        this.requestId = requestId;
    }

    public String getPage() {
        return page;
    }

    @XmlElement
    public void setPage (String page) {
        this.page = page;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    @XmlElement
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCurrency() {
        return currency;
    }

    @XmlElement
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Account getSrcAccount() {
        Account ac = new Account();
        for(Account acc : account) {
            if (acc.getType().equals("source"))
                ac = acc;
        }
        return ac;
    }

    public Account getDstAccount() {
        Account ac = new Account();
        for(Account acc : account) {
            if (acc.getType().equals("destination"))
                ac = acc;
        }
        return ac;
    }

    @XmlElement
    public void setAccount(Account[] acc) {
        this.account = acc;
    }


}
