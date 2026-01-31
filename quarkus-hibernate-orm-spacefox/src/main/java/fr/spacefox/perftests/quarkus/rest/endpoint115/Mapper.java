package fr.spacefox.perftests.quarkus.rest.endpoint115;

import fr.spacefox.perftests.quarkus.core.service115.model.Model115;
import fr.spacefox.perftests.quarkus.rest.endpoint115.schema.Schema115;

final class Mapper {
    private Mapper() {}

    public static Schema115 of(Model115 model) {
        return new Schema115(model.id(), model.value());
    }
}
