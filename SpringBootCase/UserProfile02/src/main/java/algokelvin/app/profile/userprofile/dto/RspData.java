package algokelvin.app.profile.userprofile.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class RspData<T> {
    private String timestamp;
    private Integer status;
    private String error;
    private String message;
    private T data;
}
