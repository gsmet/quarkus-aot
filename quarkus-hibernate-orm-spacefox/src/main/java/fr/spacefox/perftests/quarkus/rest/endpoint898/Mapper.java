package fr.spacefox.perftests.quarkus.rest.endpoint898;

import fr.spacefox.perftests.quarkus.core.service898.model.Model898;
import fr.spacefox.perftests.quarkus.rest.endpoint898.schema.Schema898;

final class Mapper {
    private Mapper() {}

    public static Schema898 of(Model898 model) {
        return new Schema898(model.id(), model.value());
    }
}
