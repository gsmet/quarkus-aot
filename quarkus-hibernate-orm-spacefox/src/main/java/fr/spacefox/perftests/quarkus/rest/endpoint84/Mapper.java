package fr.spacefox.perftests.quarkus.rest.endpoint84;

import fr.spacefox.perftests.quarkus.core.service84.model.Model84;
import fr.spacefox.perftests.quarkus.rest.endpoint84.schema.Schema84;

final class Mapper {
    private Mapper() {}

    public static Schema84 of(Model84 model) {
        return new Schema84(model.id(), model.value());
    }
}
