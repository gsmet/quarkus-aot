package fr.spacefox.perftests.quarkus.rest.endpoint238;

import fr.spacefox.perftests.quarkus.core.service238.model.Model238;
import fr.spacefox.perftests.quarkus.rest.endpoint238.schema.Schema238;

final class Mapper {
    private Mapper() {}

    public static Schema238 of(Model238 model) {
        return new Schema238(model.id(), model.value());
    }
}
