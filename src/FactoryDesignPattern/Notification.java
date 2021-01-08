package FactoryDesignPattern;

/*we have an interface called NotificationService, and three concrete classes are implementing NotificationService interface.
A factory class NotificationFactory is created to get a NotificationService object*/

public interface Notification {

	void notifyUser();
}
