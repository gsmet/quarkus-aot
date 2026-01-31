package fr.spacefox.perftests.quarkus.rest.endpoint568;

import fr.spacefox.perftests.quarkus.core.service568.model.Model568;
import fr.spacefox.perftests.quarkus.rest.endpoint568.schema.Schema568;

final class Mapper {
    private Mapper() {}

    public static Schema568 of(Model568 model) {
        return new Schema568(model.id(), model.value());
    }
}
