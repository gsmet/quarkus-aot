package fr.spacefox.perftests.quarkus.rest.endpoint7;

import fr.spacefox.perftests.quarkus.core.service7.model.Model7;
import fr.spacefox.perftests.quarkus.rest.endpoint7.schema.Schema7;

final class Mapper {
    private Mapper() {}

    public static Schema7 of(Model7 model) {
        return new Schema7(model.id(), model.value());
    }
}
