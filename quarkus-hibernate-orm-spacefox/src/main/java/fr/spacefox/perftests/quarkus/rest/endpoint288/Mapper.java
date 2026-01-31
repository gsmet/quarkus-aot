package fr.spacefox.perftests.quarkus.rest.endpoint288;

import fr.spacefox.perftests.quarkus.core.service288.model.Model288;
import fr.spacefox.perftests.quarkus.rest.endpoint288.schema.Schema288;

final class Mapper {
    private Mapper() {}

    public static Schema288 of(Model288 model) {
        return new Schema288(model.id(), model.value());
    }
}
