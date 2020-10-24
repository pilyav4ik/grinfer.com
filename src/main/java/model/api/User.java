package model.api;

import lombok.*;

import java.util.List;
import java.util.UUID;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    private UUID id;
    private String affiliateId;
    private String email;
    private String externalAuthToken;
    private String externalAuthType;
    private Boolean fast;
    private String firstName;
    private String grantType;
    private String lastName;
    private List<String> meta;
    private String password;
    private Boolean rememberMe;
    private String timezone;
    private Boolean active;
    private Boolean anonymous;
    private Boolean headless;
    private List<String> authorities;
    private int janusId;
    private Boolean testMode;
}