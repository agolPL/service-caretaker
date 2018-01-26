package pl.itlink.caretaker.service;

import lombok.Builder;

import java.util.List;

@Builder
class Service {

    private final String context;
    private final String name;
    private final List<String> providedFeatures;
    private final List<String> usedFeatures;
}
