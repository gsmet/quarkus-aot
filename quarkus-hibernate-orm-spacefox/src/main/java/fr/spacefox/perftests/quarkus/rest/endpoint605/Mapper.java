package fr.spacefox.perftests.quarkus.rest.endpoint605;

import fr.spacefox.perftests.quarkus.core.service605.model.Model605;
import fr.spacefox.perftests.quarkus.rest.endpoint605.schema.Schema605;

final class Mapper {
    private Mapper() {}

    public static Schema605 of(Model605 model) {
        return new Schema605(model.id(), model.value());
    }
}
