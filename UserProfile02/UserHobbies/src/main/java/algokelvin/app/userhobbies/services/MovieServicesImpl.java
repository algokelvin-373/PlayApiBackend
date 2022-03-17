package algokelvin.app.userhobbies.services;

import algokelvin.app.userhobbies.model.Movies;
import algokelvin.app.userhobbies.repository.ConfigRepository;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServicesImpl implements MovieServices {

    @Autowired
    private ConfigRepository configRepository;

    private final Logger LOG = LoggerFactory.getLogger(MovieServicesImpl.class);

    @Override
    public Movies userMovieFavorite() {

        return null;
    }
}
