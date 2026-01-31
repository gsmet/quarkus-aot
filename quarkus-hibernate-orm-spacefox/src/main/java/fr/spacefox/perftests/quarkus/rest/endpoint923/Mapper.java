package fr.spacefox.perftests.quarkus.rest.endpoint923;

import fr.spacefox.perftests.quarkus.core.service923.model.Model923;
import fr.spacefox.perftests.quarkus.rest.endpoint923.schema.Schema923;

final class Mapper {
    private Mapper() {}

    public static Schema923 of(Model923 model) {
        return new Schema923(model.id(), model.value());
    }
}
