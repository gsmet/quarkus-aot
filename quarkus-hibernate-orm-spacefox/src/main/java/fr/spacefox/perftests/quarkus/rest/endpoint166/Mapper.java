package fr.spacefox.perftests.quarkus.rest.endpoint166;

import fr.spacefox.perftests.quarkus.core.service166.model.Model166;
import fr.spacefox.perftests.quarkus.rest.endpoint166.schema.Schema166;

final class Mapper {
    private Mapper() {}

    public static Schema166 of(Model166 model) {
        return new Schema166(model.id(), model.value());
    }
}
