package fr.spacefox.perftests.quarkus.rest.endpoint755;

import fr.spacefox.perftests.quarkus.core.service755.model.Model755;
import fr.spacefox.perftests.quarkus.rest.endpoint755.schema.Schema755;

final class Mapper {
    private Mapper() {}

    public static Schema755 of(Model755 model) {
        return new Schema755(model.id(), model.value());
    }
}
