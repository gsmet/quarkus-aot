package fr.spacefox.perftests.quarkus.rest.endpoint106;

import fr.spacefox.perftests.quarkus.core.service106.model.Model106;
import fr.spacefox.perftests.quarkus.rest.endpoint106.schema.Schema106;

final class Mapper {
    private Mapper() {}

    public static Schema106 of(Model106 model) {
        return new Schema106(model.id(), model.value());
    }
}
