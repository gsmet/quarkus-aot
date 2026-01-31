package fr.spacefox.perftests.quarkus.rest.endpoint422;

import fr.spacefox.perftests.quarkus.core.service422.model.Model422;
import fr.spacefox.perftests.quarkus.rest.endpoint422.schema.Schema422;

final class Mapper {
    private Mapper() {}

    public static Schema422 of(Model422 model) {
        return new Schema422(model.id(), model.value());
    }
}
