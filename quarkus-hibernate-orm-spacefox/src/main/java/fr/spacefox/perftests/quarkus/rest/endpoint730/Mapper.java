package fr.spacefox.perftests.quarkus.rest.endpoint730;

import fr.spacefox.perftests.quarkus.core.service730.model.Model730;
import fr.spacefox.perftests.quarkus.rest.endpoint730.schema.Schema730;

final class Mapper {
    private Mapper() {}

    public static Schema730 of(Model730 model) {
        return new Schema730(model.id(), model.value());
    }
}
