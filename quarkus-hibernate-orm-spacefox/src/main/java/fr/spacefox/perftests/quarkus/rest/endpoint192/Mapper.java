package fr.spacefox.perftests.quarkus.rest.endpoint192;

import fr.spacefox.perftests.quarkus.core.service192.model.Model192;
import fr.spacefox.perftests.quarkus.rest.endpoint192.schema.Schema192;

final class Mapper {
    private Mapper() {}

    public static Schema192 of(Model192 model) {
        return new Schema192(model.id(), model.value());
    }
}
