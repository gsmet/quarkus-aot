package fr.spacefox.perftests.quarkus.rest.endpoint453;

import fr.spacefox.perftests.quarkus.core.service453.model.Model453;
import fr.spacefox.perftests.quarkus.rest.endpoint453.schema.Schema453;

final class Mapper {
    private Mapper() {}

    public static Schema453 of(Model453 model) {
        return new Schema453(model.id(), model.value());
    }
}
