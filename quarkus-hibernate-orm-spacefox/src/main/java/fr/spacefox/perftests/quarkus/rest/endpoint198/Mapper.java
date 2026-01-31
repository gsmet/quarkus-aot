package fr.spacefox.perftests.quarkus.rest.endpoint198;

import fr.spacefox.perftests.quarkus.core.service198.model.Model198;
import fr.spacefox.perftests.quarkus.rest.endpoint198.schema.Schema198;

final class Mapper {
    private Mapper() {}

    public static Schema198 of(Model198 model) {
        return new Schema198(model.id(), model.value());
    }
}
