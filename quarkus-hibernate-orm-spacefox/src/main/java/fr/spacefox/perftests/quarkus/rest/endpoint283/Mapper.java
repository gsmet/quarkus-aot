package fr.spacefox.perftests.quarkus.rest.endpoint283;

import fr.spacefox.perftests.quarkus.core.service283.model.Model283;
import fr.spacefox.perftests.quarkus.rest.endpoint283.schema.Schema283;

final class Mapper {
    private Mapper() {}

    public static Schema283 of(Model283 model) {
        return new Schema283(model.id(), model.value());
    }
}
