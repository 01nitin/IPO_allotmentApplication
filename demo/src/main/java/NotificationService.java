import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {
    @Autowired
    private JavaMailSender mailSender;

    public void sendNotification(String email, String message) {
        SimpleMailMessage mail = new SimpleMailMessage();
        mail.setTo(email);
        mail.setSubject("IPO Allotment Update");
        mail.setText(message);
        mailSender.send(mail);
    }
}