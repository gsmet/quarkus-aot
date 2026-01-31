package fr.spacefox.perftests.quarkus.rest.endpoint207;

import fr.spacefox.perftests.quarkus.core.service207.model.Model207;
import fr.spacefox.perftests.quarkus.rest.endpoint207.schema.Schema207;

final class Mapper {
    private Mapper() {}

    public static Schema207 of(Model207 model) {
        return new Schema207(model.id(), model.value());
    }
}
