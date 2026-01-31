package fr.spacefox.perftests.quarkus.rest.endpoint496;

import fr.spacefox.perftests.quarkus.core.service496.model.Model496;
import fr.spacefox.perftests.quarkus.rest.endpoint496.schema.Schema496;

final class Mapper {
    private Mapper() {}

    public static Schema496 of(Model496 model) {
        return new Schema496(model.id(), model.value());
    }
}
