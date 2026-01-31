package fr.spacefox.perftests.quarkus.rest.endpoint254;

import fr.spacefox.perftests.quarkus.core.service254.model.Model254;
import fr.spacefox.perftests.quarkus.rest.endpoint254.schema.Schema254;

final class Mapper {
    private Mapper() {}

    public static Schema254 of(Model254 model) {
        return new Schema254(model.id(), model.value());
    }
}
