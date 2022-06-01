package IteratingOverSNSProfiles.social_networks;


import IteratingOverSNSProfiles.iterators.ProfileIterator;

public interface SocialNetwork {
    ProfileIterator createFriendsIterator(String profileEmail);

    ProfileIterator createCoworkersIterator(String profileEmail);
}
