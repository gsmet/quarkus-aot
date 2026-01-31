package fr.spacefox.perftests.quarkus.rest.endpoint165;

import fr.spacefox.perftests.quarkus.core.service165.model.Model165;
import fr.spacefox.perftests.quarkus.rest.endpoint165.schema.Schema165;

final class Mapper {
    private Mapper() {}

    public static Schema165 of(Model165 model) {
        return new Schema165(model.id(), model.value());
    }
}
