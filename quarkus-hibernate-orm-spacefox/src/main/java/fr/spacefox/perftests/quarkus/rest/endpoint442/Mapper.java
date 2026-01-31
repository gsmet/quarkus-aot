package fr.spacefox.perftests.quarkus.rest.endpoint442;

import fr.spacefox.perftests.quarkus.core.service442.model.Model442;
import fr.spacefox.perftests.quarkus.rest.endpoint442.schema.Schema442;

final class Mapper {
    private Mapper() {}

    public static Schema442 of(Model442 model) {
        return new Schema442(model.id(), model.value());
    }
}
