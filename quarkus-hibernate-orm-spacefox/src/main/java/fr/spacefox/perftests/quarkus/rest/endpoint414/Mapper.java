package fr.spacefox.perftests.quarkus.rest.endpoint414;

import fr.spacefox.perftests.quarkus.core.service414.model.Model414;
import fr.spacefox.perftests.quarkus.rest.endpoint414.schema.Schema414;

final class Mapper {
    private Mapper() {}

    public static Schema414 of(Model414 model) {
        return new Schema414(model.id(), model.value());
    }
}
