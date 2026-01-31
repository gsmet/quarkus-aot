package fr.spacefox.perftests.quarkus.rest.endpoint179;

import fr.spacefox.perftests.quarkus.core.service179.model.Model179;
import fr.spacefox.perftests.quarkus.rest.endpoint179.schema.Schema179;

final class Mapper {
    private Mapper() {}

    public static Schema179 of(Model179 model) {
        return new Schema179(model.id(), model.value());
    }
}
