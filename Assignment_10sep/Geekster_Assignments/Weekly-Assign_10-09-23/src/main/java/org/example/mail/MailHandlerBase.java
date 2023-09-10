package org.example.mail;
import org.example.Billi;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;
public class MailHandlerBase extends Billi {

    public void sendMail() {

        //properties

        //something like a map
        Properties sysPropertiesMap = System.getProperties();

        //System.out.println(sysPropertiesMap);

        //in this map I want to add 4 more key value pairs : mailing

        sysPropertiesMap.put("mail.smtp.host", "smtp.gmail.com"); //smtp server
        sysPropertiesMap.put("mail.smtp.port", "465"); //server port
        sysPropertiesMap.put("mail.smtp.ssl.enable", "true"); //ssl -secure socket layer
        sysPropertiesMap.put("mail.smtp.auth", "true"); //authentication - auth


        Authenticator mailAuthenticator = new MailAuthentication();

        //session
        Session mailSession = Session.getInstance(sysPropertiesMap, mailAuthenticator);

        MimeMessage mailMessage = new MimeMessage(mailSession);

        try {
            mailMessage.setFrom(MailConstants.SENDER);
            mailMessage.setSubject("Weekly Assignment 10-09-2023");
            mailMessage.setRecipient(Message.RecipientType.TO, new InternetAddress("deepak76311@gmail.com"));
            mailMessage.setText("Billi ka color h :" + getColor().toString());

            Transport.send(mailMessage);

            System.out.println("Mail sent !!!");
        } catch (Exception ex) {
            System.out.println("Some error while preparing mail body!!!!");
            System.out.println(ex.getMessage());
        }

    }
}