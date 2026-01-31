package fr.spacefox.perftests.quarkus.rest.endpoint139;

import fr.spacefox.perftests.quarkus.core.service139.model.Model139;
import fr.spacefox.perftests.quarkus.rest.endpoint139.schema.Schema139;

final class Mapper {
    private Mapper() {}

    public static Schema139 of(Model139 model) {
        return new Schema139(model.id(), model.value());
    }
}
