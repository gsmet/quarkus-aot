package fr.spacefox.perftests.quarkus.rest.endpoint292;

import fr.spacefox.perftests.quarkus.core.service292.model.Model292;
import fr.spacefox.perftests.quarkus.rest.endpoint292.schema.Schema292;

final class Mapper {
    private Mapper() {}

    public static Schema292 of(Model292 model) {
        return new Schema292(model.id(), model.value());
    }
}
