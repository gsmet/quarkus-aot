package fr.spacefox.perftests.quarkus.rest.endpoint204;

import fr.spacefox.perftests.quarkus.core.service204.model.Model204;
import fr.spacefox.perftests.quarkus.rest.endpoint204.schema.Schema204;

final class Mapper {
    private Mapper() {}

    public static Schema204 of(Model204 model) {
        return new Schema204(model.id(), model.value());
    }
}
