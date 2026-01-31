package fr.spacefox.perftests.quarkus.rest.endpoint921;

import fr.spacefox.perftests.quarkus.core.service921.model.Model921;
import fr.spacefox.perftests.quarkus.rest.endpoint921.schema.Schema921;

final class Mapper {
    private Mapper() {}

    public static Schema921 of(Model921 model) {
        return new Schema921(model.id(), model.value());
    }
}
