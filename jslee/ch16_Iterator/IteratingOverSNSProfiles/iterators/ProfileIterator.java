package IteratingOverSNSProfiles.iterators;


import IteratingOverSNSProfiles.profile.Profile;

public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();
}