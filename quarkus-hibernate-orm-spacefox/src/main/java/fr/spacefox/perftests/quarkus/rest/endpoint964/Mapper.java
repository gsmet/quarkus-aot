package fr.spacefox.perftests.quarkus.rest.endpoint964;

import fr.spacefox.perftests.quarkus.core.service964.model.Model964;
import fr.spacefox.perftests.quarkus.rest.endpoint964.schema.Schema964;

final class Mapper {
    private Mapper() {}

    public static Schema964 of(Model964 model) {
        return new Schema964(model.id(), model.value());
    }
}
