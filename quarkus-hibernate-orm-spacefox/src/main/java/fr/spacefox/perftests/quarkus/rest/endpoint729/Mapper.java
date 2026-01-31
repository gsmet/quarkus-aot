package fr.spacefox.perftests.quarkus.rest.endpoint729;

import fr.spacefox.perftests.quarkus.core.service729.model.Model729;
import fr.spacefox.perftests.quarkus.rest.endpoint729.schema.Schema729;

final class Mapper {
    private Mapper() {}

    public static Schema729 of(Model729 model) {
        return new Schema729(model.id(), model.value());
    }
}
