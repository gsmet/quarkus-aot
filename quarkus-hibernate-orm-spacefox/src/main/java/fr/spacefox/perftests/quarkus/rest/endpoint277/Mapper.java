package fr.spacefox.perftests.quarkus.rest.endpoint277;

import fr.spacefox.perftests.quarkus.core.service277.model.Model277;
import fr.spacefox.perftests.quarkus.rest.endpoint277.schema.Schema277;

final class Mapper {
    private Mapper() {}

    public static Schema277 of(Model277 model) {
        return new Schema277(model.id(), model.value());
    }
}
