package NotificationCenter;

public class NotificationMain {
    public static void main(String[] args){
        Notification[] notifications = new Notification[3];
        notifications[0] = new EmailNotification();
        notifications[1] = new SmsNotification();
        notifications[2] = new PushNotification();

        for(Notification notification : notifications){
            notification.send("Helloooii");
        }
    }
}
