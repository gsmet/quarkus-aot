package fr.spacefox.perftests.quarkus.rest.endpoint523;

import fr.spacefox.perftests.quarkus.core.service523.model.Model523;
import fr.spacefox.perftests.quarkus.rest.endpoint523.schema.Schema523;

final class Mapper {
    private Mapper() {}

    public static Schema523 of(Model523 model) {
        return new Schema523(model.id(), model.value());
    }
}
