package fr.spacefox.perftests.quarkus.rest.endpoint828;

import fr.spacefox.perftests.quarkus.core.service828.model.Model828;
import fr.spacefox.perftests.quarkus.rest.endpoint828.schema.Schema828;

final class Mapper {
    private Mapper() {}

    public static Schema828 of(Model828 model) {
        return new Schema828(model.id(), model.value());
    }
}
