package fr.spacefox.perftests.quarkus.rest.endpoint469;

import fr.spacefox.perftests.quarkus.core.service469.model.Model469;
import fr.spacefox.perftests.quarkus.rest.endpoint469.schema.Schema469;

final class Mapper {
    private Mapper() {}

    public static Schema469 of(Model469 model) {
        return new Schema469(model.id(), model.value());
    }
}
