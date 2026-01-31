package fr.spacefox.perftests.quarkus.rest.endpoint813;

import fr.spacefox.perftests.quarkus.core.service813.model.Model813;
import fr.spacefox.perftests.quarkus.rest.endpoint813.schema.Schema813;

final class Mapper {
    private Mapper() {}

    public static Schema813 of(Model813 model) {
        return new Schema813(model.id(), model.value());
    }
}
