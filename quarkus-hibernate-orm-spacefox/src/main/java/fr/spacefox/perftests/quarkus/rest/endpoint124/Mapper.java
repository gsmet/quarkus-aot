package fr.spacefox.perftests.quarkus.rest.endpoint124;

import fr.spacefox.perftests.quarkus.core.service124.model.Model124;
import fr.spacefox.perftests.quarkus.rest.endpoint124.schema.Schema124;

final class Mapper {
    private Mapper() {}

    public static Schema124 of(Model124 model) {
        return new Schema124(model.id(), model.value());
    }
}
