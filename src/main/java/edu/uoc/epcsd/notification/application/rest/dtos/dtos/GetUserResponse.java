package edu.uoc.epcsd.notification.application.rest.dtos.dtos;

import lombok.*;

@ToString
@Getter
@Setter
@EqualsAndHashCode
@Builder
@AllArgsConstructor
public final class GetUserResponse {

    private final Long id;

    private final String fullName;

    private final String email;

    private final String phoneNumber;

}
