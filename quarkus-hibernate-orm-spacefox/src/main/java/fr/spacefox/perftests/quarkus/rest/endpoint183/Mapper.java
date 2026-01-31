package fr.spacefox.perftests.quarkus.rest.endpoint183;

import fr.spacefox.perftests.quarkus.core.service183.model.Model183;
import fr.spacefox.perftests.quarkus.rest.endpoint183.schema.Schema183;

final class Mapper {
    private Mapper() {}

    public static Schema183 of(Model183 model) {
        return new Schema183(model.id(), model.value());
    }
}
