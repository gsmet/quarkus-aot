package fr.spacefox.perftests.quarkus.rest.endpoint243;

import fr.spacefox.perftests.quarkus.core.service243.model.Model243;
import fr.spacefox.perftests.quarkus.rest.endpoint243.schema.Schema243;

final class Mapper {
    private Mapper() {}

    public static Schema243 of(Model243 model) {
        return new Schema243(model.id(), model.value());
    }
}
