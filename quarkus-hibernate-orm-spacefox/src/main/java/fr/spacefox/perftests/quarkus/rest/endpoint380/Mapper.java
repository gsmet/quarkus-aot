package fr.spacefox.perftests.quarkus.rest.endpoint380;

import fr.spacefox.perftests.quarkus.core.service380.model.Model380;
import fr.spacefox.perftests.quarkus.rest.endpoint380.schema.Schema380;

final class Mapper {
    private Mapper() {}

    public static Schema380 of(Model380 model) {
        return new Schema380(model.id(), model.value());
    }
}
