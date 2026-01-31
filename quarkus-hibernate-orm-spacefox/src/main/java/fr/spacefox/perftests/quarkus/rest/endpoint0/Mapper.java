package fr.spacefox.perftests.quarkus.rest.endpoint0;

import fr.spacefox.perftests.quarkus.core.service0.model.Model0;
import fr.spacefox.perftests.quarkus.rest.endpoint0.schema.Schema0;

final class Mapper {
    private Mapper() {}

    public static Schema0 of(Model0 model) {
        return new Schema0(model.id(), model.value());
    }
}
