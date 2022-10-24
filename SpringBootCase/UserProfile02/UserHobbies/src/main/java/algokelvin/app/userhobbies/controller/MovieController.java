package algokelvin.app.userhobbies.controller;

import algokelvin.app.userhobbies.config.GlobalApiResponse;
import algokelvin.app.userhobbies.services.MovieServices;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/movie", produces = MediaType.APPLICATION_JSON_VALUE)
@Validated
@Api(tags = "Movie")
@Slf4j
public class MovieController {

    @Autowired
    MovieServices movieServices;

    @GetMapping(value = "favorite", produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "successful operation", response = GlobalApiResponse.class)
    }) public GlobalApiResponse<?> getDataProfile(@RequestParam int id) {
        return new GlobalApiResponse<>(
                HttpStatus.OK.value(),
                movieServices.userMovieFavorite()
        );
    }

}
