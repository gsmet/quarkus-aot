package fr.spacefox.perftests.quarkus.rest.endpoint542;

import fr.spacefox.perftests.quarkus.core.service542.model.Model542;
import fr.spacefox.perftests.quarkus.rest.endpoint542.schema.Schema542;

final class Mapper {
    private Mapper() {}

    public static Schema542 of(Model542 model) {
        return new Schema542(model.id(), model.value());
    }
}
