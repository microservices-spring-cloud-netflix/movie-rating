package pl.pawtel.rating.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class RatingDto {

    private Long id;
    private Long movieId;
    private Integer stars;
}
