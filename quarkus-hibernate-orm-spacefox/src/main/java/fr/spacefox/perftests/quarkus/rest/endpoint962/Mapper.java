package fr.spacefox.perftests.quarkus.rest.endpoint962;

import fr.spacefox.perftests.quarkus.core.service962.model.Model962;
import fr.spacefox.perftests.quarkus.rest.endpoint962.schema.Schema962;

final class Mapper {
    private Mapper() {}

    public static Schema962 of(Model962 model) {
        return new Schema962(model.id(), model.value());
    }
}
