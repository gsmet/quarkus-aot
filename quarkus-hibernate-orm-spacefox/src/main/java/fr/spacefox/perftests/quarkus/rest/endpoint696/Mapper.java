package fr.spacefox.perftests.quarkus.rest.endpoint696;

import fr.spacefox.perftests.quarkus.core.service696.model.Model696;
import fr.spacefox.perftests.quarkus.rest.endpoint696.schema.Schema696;

final class Mapper {
    private Mapper() {}

    public static Schema696 of(Model696 model) {
        return new Schema696(model.id(), model.value());
    }
}
