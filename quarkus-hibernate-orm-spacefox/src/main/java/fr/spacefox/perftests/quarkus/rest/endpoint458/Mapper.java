package fr.spacefox.perftests.quarkus.rest.endpoint458;

import fr.spacefox.perftests.quarkus.core.service458.model.Model458;
import fr.spacefox.perftests.quarkus.rest.endpoint458.schema.Schema458;

final class Mapper {
    private Mapper() {}

    public static Schema458 of(Model458 model) {
        return new Schema458(model.id(), model.value());
    }
}
