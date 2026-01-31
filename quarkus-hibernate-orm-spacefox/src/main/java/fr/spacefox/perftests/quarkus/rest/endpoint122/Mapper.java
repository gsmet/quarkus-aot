package fr.spacefox.perftests.quarkus.rest.endpoint122;

import fr.spacefox.perftests.quarkus.core.service122.model.Model122;
import fr.spacefox.perftests.quarkus.rest.endpoint122.schema.Schema122;

final class Mapper {
    private Mapper() {}

    public static Schema122 of(Model122 model) {
        return new Schema122(model.id(), model.value());
    }
}
