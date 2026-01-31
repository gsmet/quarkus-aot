package fr.spacefox.perftests.quarkus.rest.endpoint249;

import fr.spacefox.perftests.quarkus.core.service249.model.Model249;
import fr.spacefox.perftests.quarkus.rest.endpoint249.schema.Schema249;

final class Mapper {
    private Mapper() {}

    public static Schema249 of(Model249 model) {
        return new Schema249(model.id(), model.value());
    }
}
