package algokelvin.app.profile.userprofile.dto.people;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RspPeople {
    String name;
    String address;
    String description;
}
