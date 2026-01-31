package fr.spacefox.perftests.quarkus.rest.endpoint407;

import fr.spacefox.perftests.quarkus.core.service407.model.Model407;
import fr.spacefox.perftests.quarkus.rest.endpoint407.schema.Schema407;

final class Mapper {
    private Mapper() {}

    public static Schema407 of(Model407 model) {
        return new Schema407(model.id(), model.value());
    }
}
