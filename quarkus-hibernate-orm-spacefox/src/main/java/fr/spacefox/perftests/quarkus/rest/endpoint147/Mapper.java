package fr.spacefox.perftests.quarkus.rest.endpoint147;

import fr.spacefox.perftests.quarkus.core.service147.model.Model147;
import fr.spacefox.perftests.quarkus.rest.endpoint147.schema.Schema147;

final class Mapper {
    private Mapper() {}

    public static Schema147 of(Model147 model) {
        return new Schema147(model.id(), model.value());
    }
}
