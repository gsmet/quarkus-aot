package fr.spacefox.perftests.quarkus.rest.endpoint484;

import fr.spacefox.perftests.quarkus.core.service484.model.Model484;
import fr.spacefox.perftests.quarkus.rest.endpoint484.schema.Schema484;

final class Mapper {
    private Mapper() {}

    public static Schema484 of(Model484 model) {
        return new Schema484(model.id(), model.value());
    }
}
