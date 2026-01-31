package fr.spacefox.perftests.quarkus.rest.endpoint506;

import fr.spacefox.perftests.quarkus.core.service506.model.Model506;
import fr.spacefox.perftests.quarkus.rest.endpoint506.schema.Schema506;

final class Mapper {
    private Mapper() {}

    public static Schema506 of(Model506 model) {
        return new Schema506(model.id(), model.value());
    }
}
