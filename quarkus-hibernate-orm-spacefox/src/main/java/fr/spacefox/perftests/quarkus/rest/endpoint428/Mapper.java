package fr.spacefox.perftests.quarkus.rest.endpoint428;

import fr.spacefox.perftests.quarkus.core.service428.model.Model428;
import fr.spacefox.perftests.quarkus.rest.endpoint428.schema.Schema428;

final class Mapper {
    private Mapper() {}

    public static Schema428 of(Model428 model) {
        return new Schema428(model.id(), model.value());
    }
}
