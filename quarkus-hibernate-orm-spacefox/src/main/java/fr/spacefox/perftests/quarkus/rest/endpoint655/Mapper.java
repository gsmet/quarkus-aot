package fr.spacefox.perftests.quarkus.rest.endpoint655;

import fr.spacefox.perftests.quarkus.core.service655.model.Model655;
import fr.spacefox.perftests.quarkus.rest.endpoint655.schema.Schema655;

final class Mapper {
    private Mapper() {}

    public static Schema655 of(Model655 model) {
        return new Schema655(model.id(), model.value());
    }
}
