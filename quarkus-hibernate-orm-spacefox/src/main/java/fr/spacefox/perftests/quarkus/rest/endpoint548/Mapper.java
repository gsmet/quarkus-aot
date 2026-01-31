package fr.spacefox.perftests.quarkus.rest.endpoint548;

import fr.spacefox.perftests.quarkus.core.service548.model.Model548;
import fr.spacefox.perftests.quarkus.rest.endpoint548.schema.Schema548;

final class Mapper {
    private Mapper() {}

    public static Schema548 of(Model548 model) {
        return new Schema548(model.id(), model.value());
    }
}
