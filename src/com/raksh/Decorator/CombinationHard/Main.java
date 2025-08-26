package com.raksh.Decorator.CombinationHard;
/*
**Context**:
You are designing a **Notification System** that supports different channels (Email, SMS, Push).

* The system should allow **step-by-step construction** of notification objects (Builder).
* It should allow **decoration** of notifications with features like encryption, logging, retry mechanism (Decorator).
* The system should have a **singleton NotificationManager** to control the sending process.

---

### 🔹 Entities and Expected Behaviors

#### 1. **Notification (Abstract Class / Interface)**

* Represents a generic notification.
* Methods:

  ```java
  String getMessage();
  String getRecipient();
  void send();  // sends the notification
  ```

#### 2. **Concrete Notifications (EmailNotification, SMSNotification, PushNotification)**

* Built via **Builder pattern**.
* Fields (datatypes clarified):

  * `String recipient`
  * `String subject` (only for Email, optional for SMS/Push → might be `null`)
  * `String body`
  * `boolean highPriority`
  * `Map<String, String> metadata` (extra info, e.g., "campaignId", "trackingId")

#### 3. **NotificationBuilder (Abstract Builder + Concrete Builders)**

* Stepwise creation of notifications.
* Each step should return `NotificationBuilder` for chaining.
* Example methods:

  ```java
  NotificationBuilder recipient(String recipient);   // return type: NotificationBuilder
  NotificationBuilder subject(String subject);       // return type: NotificationBuilder
  NotificationBuilder body(String body);             // return type: NotificationBuilder
  NotificationBuilder highPriority(boolean flag);    // return type: NotificationBuilder
  NotificationBuilder metadata(Map<String, String> meta); // return type: NotificationBuilder
  Notification build();  // return type: Notification
  ```

#### 4. **Decorator (NotificationDecorator)**

* Allows adding behaviors without modifying base notifications.
* Examples:

  * **EncryptionDecorator** → encrypts message before sending.
  * **LoggingDecorator** → logs before/after sending.
  * **RetryDecorator** → retries sending if it fails.
* All decorators should **wrap a Notification** and override `send()`.

#### 5. **Singleton NotificationManager**

* Only one instance per system.
* Responsible for:

  * Accepting a `Notification` object.
  * Managing retry counts (from decorators).
  * Dispatching send operation.
* API:

  ```java
  public static NotificationManager getInstance();
  public void dispatch(Notification notification);
  ```

---

### 🔹 Example Input / Output (like LeetCode test case)

**Input:**

```java
// Build a notification
Notification email = new EmailNotification.EmailBuilder()
        .recipient("raksh@example.com")
        .subject("Interview Update")
        .body("Your interview is scheduled for tomorrow.")
        .highPriority(true)
        .metadata(Map.of("trackingId", "12345"))
        .build();

// Decorate it
Notification decoratedEmail = new RetryDecorator(
                                new LoggingDecorator(
                                  new EncryptionDecorator(email)
                                ));

// Dispatch via Singleton Manager
NotificationManager manager = NotificationManager.getInstance();
manager.dispatch(decoratedEmail);
```

**Output (console/logs):**

```
[LOG] Preparing to send notification...
[ENCRYPT] Encrypting message body...
Sending EMAIL to raksh@example.com with subject: Interview Update
[LOG] Notification sent successfully.
```



*/

/*

 */
public class Main {
    /*
    Simple thought process create abstract class for Builder pattern
    then extend them for decorator 
     */



}
