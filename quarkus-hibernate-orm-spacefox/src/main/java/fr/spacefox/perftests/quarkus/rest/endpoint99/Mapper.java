package fr.spacefox.perftests.quarkus.rest.endpoint99;

import fr.spacefox.perftests.quarkus.core.service99.model.Model99;
import fr.spacefox.perftests.quarkus.rest.endpoint99.schema.Schema99;

final class Mapper {
    private Mapper() {}

    public static Schema99 of(Model99 model) {
        return new Schema99(model.id(), model.value());
    }
}
