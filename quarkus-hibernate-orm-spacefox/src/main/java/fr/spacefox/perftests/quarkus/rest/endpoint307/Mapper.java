package fr.spacefox.perftests.quarkus.rest.endpoint307;

import fr.spacefox.perftests.quarkus.core.service307.model.Model307;
import fr.spacefox.perftests.quarkus.rest.endpoint307.schema.Schema307;

final class Mapper {
    private Mapper() {}

    public static Schema307 of(Model307 model) {
        return new Schema307(model.id(), model.value());
    }
}
