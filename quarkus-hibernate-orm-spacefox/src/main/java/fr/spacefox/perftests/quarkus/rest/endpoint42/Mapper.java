package fr.spacefox.perftests.quarkus.rest.endpoint42;

import fr.spacefox.perftests.quarkus.core.service42.model.Model42;
import fr.spacefox.perftests.quarkus.rest.endpoint42.schema.Schema42;

final class Mapper {
    private Mapper() {}

    public static Schema42 of(Model42 model) {
        return new Schema42(model.id(), model.value());
    }
}
