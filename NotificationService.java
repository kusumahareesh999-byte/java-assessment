// Main.java

// 1. NotificationService Interface
interface NotificationService
{
    void sendNotification(String message);
}

// 2. Email Notification
class EmailNotification implements NotificationService
{
    @Override
    public void sendNotification(String message)
    {
        System.out.println("Sending EMAIL notification: " + message);
    }
}

// 3. SMS Notification
class SMSNotification implements NotificationService
{
    @Override
    public void sendNotification(String message)
    {
        System.out.println("Sending SMS notification: " + message);
    }
}

// 4. Push Notification
class PushNotification implements NotificationService
{
    @Override
    public void sendNotification(String message)
    {
        System.out.println("Sending PUSH notification: " + message);
    }
}

// 5. NotificationFactory Interface
interface NotificationFactory
{
    NotificationService getNotificationService(String type);
}

// 6. Factory Implementation
class NotificationFactoryImpl implements NotificationFactory
{

    @Override
    public NotificationService getNotificationService(String type)
    {

        switch (type.toLowerCase())
        {
            case "email":
                return new EmailNotification();
            case "sms":
                return new SMSNotification();
            case "push":
                return new PushNotification();
            default:
                throw new IllegalArgumentException
                (
                        "Unsupported notification type: " + type
                );
        }
    }
}

// 7. Main Class
class NotificationMain
{

    public static void main(String[] args)
    {

        NotificationFactory factory = new NotificationFactoryImpl();

        NotificationService email =
                factory.getNotificationService("email");
        email.sendNotification("Welcome via Email!");

        NotificationService sms =
                factory.getNotificationService("sms");
        sms.sendNotification("Your OTP is 123456");

        NotificationService push =
                factory.getNotificationService("push");
        push.sendNotification("You have a new message");
    }
}
