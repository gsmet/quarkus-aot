package fr.spacefox.perftests.quarkus.rest.endpoint926;

import fr.spacefox.perftests.quarkus.core.service926.model.Model926;
import fr.spacefox.perftests.quarkus.rest.endpoint926.schema.Schema926;

final class Mapper {
    private Mapper() {}

    public static Schema926 of(Model926 model) {
        return new Schema926(model.id(), model.value());
    }
}
