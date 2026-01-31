package fr.spacefox.perftests.quarkus.rest.endpoint208;

import fr.spacefox.perftests.quarkus.core.service208.model.Model208;
import fr.spacefox.perftests.quarkus.rest.endpoint208.schema.Schema208;

final class Mapper {
    private Mapper() {}

    public static Schema208 of(Model208 model) {
        return new Schema208(model.id(), model.value());
    }
}
