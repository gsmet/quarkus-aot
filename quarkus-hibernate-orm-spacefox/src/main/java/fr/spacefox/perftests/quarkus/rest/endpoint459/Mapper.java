package fr.spacefox.perftests.quarkus.rest.endpoint459;

import fr.spacefox.perftests.quarkus.core.service459.model.Model459;
import fr.spacefox.perftests.quarkus.rest.endpoint459.schema.Schema459;

final class Mapper {
    private Mapper() {}

    public static Schema459 of(Model459 model) {
        return new Schema459(model.id(), model.value());
    }
}
