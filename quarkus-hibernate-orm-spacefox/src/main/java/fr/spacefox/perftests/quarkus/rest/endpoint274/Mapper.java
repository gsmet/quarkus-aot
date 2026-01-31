package fr.spacefox.perftests.quarkus.rest.endpoint274;

import fr.spacefox.perftests.quarkus.core.service274.model.Model274;
import fr.spacefox.perftests.quarkus.rest.endpoint274.schema.Schema274;

final class Mapper {
    private Mapper() {}

    public static Schema274 of(Model274 model) {
        return new Schema274(model.id(), model.value());
    }
}
