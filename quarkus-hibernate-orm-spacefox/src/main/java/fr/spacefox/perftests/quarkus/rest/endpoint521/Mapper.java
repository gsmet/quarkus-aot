package fr.spacefox.perftests.quarkus.rest.endpoint521;

import fr.spacefox.perftests.quarkus.core.service521.model.Model521;
import fr.spacefox.perftests.quarkus.rest.endpoint521.schema.Schema521;

final class Mapper {
    private Mapper() {}

    public static Schema521 of(Model521 model) {
        return new Schema521(model.id(), model.value());
    }
}
