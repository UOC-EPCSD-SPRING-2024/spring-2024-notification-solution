package edu.uoc.epcsd.notification.application.rest.dtos.dtos;


import lombok.*;

@ToString
@Getter
@Setter
@EqualsAndHashCode
@Builder
@AllArgsConstructor
public final class GetProductResponse {

    private final Long id;

    private final String name;

    private final String description;

    private final Double dailyPrice;

    private final String brand;

    private final String model;

    private final Long categoryId;

}
