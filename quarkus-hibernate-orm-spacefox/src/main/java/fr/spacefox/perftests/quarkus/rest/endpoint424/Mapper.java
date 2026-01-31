package fr.spacefox.perftests.quarkus.rest.endpoint424;

import fr.spacefox.perftests.quarkus.core.service424.model.Model424;
import fr.spacefox.perftests.quarkus.rest.endpoint424.schema.Schema424;

final class Mapper {
    private Mapper() {}

    public static Schema424 of(Model424 model) {
        return new Schema424(model.id(), model.value());
    }
}
