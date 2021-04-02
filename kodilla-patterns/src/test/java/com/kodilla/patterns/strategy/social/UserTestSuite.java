package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        //given
        User tytus = new Millenials("Tytus");
        User romek = new YGeneration("Romek");
        User atomek = new ZGeneration("Atomek");

        //when
        String tytusShares = tytus.sharePost();
        System.out.println("Tytus: " + tytusShares);
        String romekShares = romek.sharePost();
        System.out.println("Romek: " + romekShares);
        String atomekShares = atomek.sharePost();
        System.out.println("Atomek: " + atomekShares);

        //then
        assertEquals("share via Facebook", tytusShares);
        assertEquals("share via Twitter", romekShares);
        assertEquals("share via Snapchat", atomekShares);
    }

    @Test
    void testIndividualSharingStrategy() {
        //given
        User tytus = new Millenials("Tytus");

        //when
        String tytusShares = tytus.sharePost();
        System.out.println("Tytus: " + tytusShares);
        tytus.setSocialPublisher(new TwitterPublisher());
        tytusShares = tytus.sharePost();
        System.out.println("Tytus: " + tytusShares);

        //then
        assertEquals("share via Twitter", tytusShares);
    }
}
