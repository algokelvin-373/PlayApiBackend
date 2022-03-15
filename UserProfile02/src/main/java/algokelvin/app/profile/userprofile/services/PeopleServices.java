package algokelvin.app.profile.userprofile.services;

import algokelvin.app.profile.userprofile.dto.people.RspPeople;

public interface PeopleServices {
    RspPeople getProfile(int id);
}
