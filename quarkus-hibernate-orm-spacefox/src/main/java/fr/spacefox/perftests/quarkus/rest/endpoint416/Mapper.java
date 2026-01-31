package fr.spacefox.perftests.quarkus.rest.endpoint416;

import fr.spacefox.perftests.quarkus.core.service416.model.Model416;
import fr.spacefox.perftests.quarkus.rest.endpoint416.schema.Schema416;

final class Mapper {
    private Mapper() {}

    public static Schema416 of(Model416 model) {
        return new Schema416(model.id(), model.value());
    }
}
