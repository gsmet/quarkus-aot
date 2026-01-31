package fr.spacefox.perftests.quarkus.rest.endpoint491;

import fr.spacefox.perftests.quarkus.core.service491.model.Model491;
import fr.spacefox.perftests.quarkus.rest.endpoint491.schema.Schema491;

final class Mapper {
    private Mapper() {}

    public static Schema491 of(Model491 model) {
        return new Schema491(model.id(), model.value());
    }
}
