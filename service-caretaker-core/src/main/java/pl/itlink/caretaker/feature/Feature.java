package pl.itlink.caretaker.feature;

import lombok.Builder;

@Builder
class Feature {

    private final String context;
    private final String name;
    private final FeatureValidator featureValidator;
}
