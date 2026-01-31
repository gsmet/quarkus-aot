package fr.spacefox.perftests.quarkus.rest.endpoint37;

import fr.spacefox.perftests.quarkus.core.service37.model.Model37;
import fr.spacefox.perftests.quarkus.rest.endpoint37.schema.Schema37;

final class Mapper {
    private Mapper() {}

    public static Schema37 of(Model37 model) {
        return new Schema37(model.id(), model.value());
    }
}
