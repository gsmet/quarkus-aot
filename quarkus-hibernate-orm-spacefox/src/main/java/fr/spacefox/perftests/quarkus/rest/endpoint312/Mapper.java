package fr.spacefox.perftests.quarkus.rest.endpoint312;

import fr.spacefox.perftests.quarkus.core.service312.model.Model312;
import fr.spacefox.perftests.quarkus.rest.endpoint312.schema.Schema312;

final class Mapper {
    private Mapper() {}

    public static Schema312 of(Model312 model) {
        return new Schema312(model.id(), model.value());
    }
}
