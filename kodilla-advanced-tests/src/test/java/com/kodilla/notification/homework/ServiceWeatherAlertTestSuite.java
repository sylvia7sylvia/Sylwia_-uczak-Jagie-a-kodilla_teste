package com.kodilla.notification.homework;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.HashSet;
import java.util.Set;

public class ServiceWeatherAlertTestSuite {
    ServiceWeatherAlert serviceWeatherAlert = new ServiceWeatherAlert();
    User user = Mockito.mock(User.class);
    User user2 = Mockito.mock(User.class);
    User user3 = Mockito.mock(User.class);
    User user4 = Mockito.mock(User.class);
    Alert alert = Mockito.mock(Alert.class);
    Location location = Mockito.mock(Location.class);
    Location location2 = Mockito.mock(Location.class);
    Set<User> users = new HashSet<>();
    Set<Location> locations = new HashSet<>();

    @BeforeAll
    public static void displayIntroMessage() {
        System.out.println("Starting testing a Weather Service");
    }

    @BeforeEach
    public void prepareData() {
        users.add(user);
        users.add(user2);
        users.add(user3);
        users.add(user4);

        locations.add(location);
        locations.add(location2);

        for (Location location : locations) {
            serviceWeatherAlert.addUser(user, location);
        }
    }

    @Test
    public void subscriberShouldReceiveNotificationFromLocationToWitchHeIsSubscribed() {
        for (Location location : locations) {
            serviceWeatherAlert.sentNotificationToLocation(alert, location);
        }
        Mockito.verify(user, Mockito.times(2)).receive(alert);
    }

    @Test
    public void subscriberShouldBeAbleToRemoveSubscriptionToLocation() {
        serviceWeatherAlert.removeUserFromLocation(user, location2);

        for (Location location : locations) {
            serviceWeatherAlert.sentNotificationToLocation(alert, location);
        }

        Mockito.verify(user, Mockito.times(1)).receive(alert);
    }

    @Test
    public void shouldRemoveAllSubscriptions() {
        serviceWeatherAlert.removeAllUsers(user);

        for (Location location : locations) {
            serviceWeatherAlert.sentNotificationToLocation(alert, location);
        }

        Mockito.verify(user, Mockito.never()).receive(alert);
    }


    @Test
    public void shouldSentNotificationOnlyToSubscribesSubscribedToLocation() {
        serviceWeatherAlert.removeUserFromLocation(user, location2);
        serviceWeatherAlert.addUser(user2, location);
        serviceWeatherAlert.addUser(user3, location);
        serviceWeatherAlert.addUser(user4, location2);

        for (Location location : locations) {
            serviceWeatherAlert.sentNotificationToLocation(alert, location);
        }

        for (User user : this.users) {
            Mockito.verify(user, Mockito.times(1)).receive(alert);
        }
    }

    @Test
    public void shouldSentNotificationToAllSubscribers() {
        serviceWeatherAlert.addUser(user, location);
        serviceWeatherAlert.addUser(user2, location2);
        serviceWeatherAlert.addUser(user3, location2);
        serviceWeatherAlert.addUser(user4, location);

        serviceWeatherAlert.sendNotificationToAll(alert);

        for (User user : this.users) {
            Mockito.verify(user, Mockito.times(1)).receive(alert);
        }
    }

    @Test
    public void shouldRemoveLocationForAllSubscribers() {
        for (User user : users) {
            serviceWeatherAlert.addUser(user, location);
        }

        serviceWeatherAlert.removeLocation(location);

        for (User user : this.users) {
            Mockito.verify(user, Mockito.never()).receive(alert);
        }
    }

    @AfterAll
    public static void displayGoodByeMessage() {
        System.out.println("Finishing testing Weather Service! Check result.");
    }
}