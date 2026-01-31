package fr.spacefox.perftests.quarkus.rest.endpoint765;

import fr.spacefox.perftests.quarkus.core.service765.model.Model765;
import fr.spacefox.perftests.quarkus.rest.endpoint765.schema.Schema765;

final class Mapper {
    private Mapper() {}

    public static Schema765 of(Model765 model) {
        return new Schema765(model.id(), model.value());
    }
}
