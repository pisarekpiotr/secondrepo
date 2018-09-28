package com.kodilla.patterns.strategy;

import com.kodilla.patterns.strategy.social.*;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User rejczel = new ZGeneration("Rejczel");
        User john = new YGeneration("John Iewalker");
        User jack = new Millenials("Jack Plack");

        //When
        String rejczelShouldPubishedOn = rejczel.sharePost();
        System.out.println("Rejczel should post on: " + rejczelShouldPubishedOn);
        String johnShouldPubishedOn = john.sharePost();
        System.out.println("John should post on: " + johnShouldPubishedOn);
        String jackSouldPostOn = jack.sharePost();
        System.out.println("Jack should post on: " + jackSouldPostOn);

        //Then
        Assert.assertEquals("Snapchat", rejczelShouldPubishedOn);
        Assert.assertEquals("Facebook", johnShouldPubishedOn);
        Assert.assertEquals("Twitter", jackSouldPostOn);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User rejczel = new ZGeneration("Rejczel");

        //When
        String rejczelShouldPubishedOn = rejczel.sharePost();
        System.out.println("\n" + "Rejczel post on: " + rejczelShouldPubishedOn);
        rejczel.setSocialPublisherStrategy(new FacebookPublisher());
        rejczelShouldPubishedOn = rejczel.sharePost();
        System.out.println("Rejczel now should post on: " + rejczelShouldPubishedOn);

        //Then
        Assert.assertEquals("Facebook", rejczelShouldPubishedOn);
    }
}
