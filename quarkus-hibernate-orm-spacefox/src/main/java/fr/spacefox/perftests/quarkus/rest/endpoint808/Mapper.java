package fr.spacefox.perftests.quarkus.rest.endpoint808;

import fr.spacefox.perftests.quarkus.core.service808.model.Model808;
import fr.spacefox.perftests.quarkus.rest.endpoint808.schema.Schema808;

final class Mapper {
    private Mapper() {}

    public static Schema808 of(Model808 model) {
        return new Schema808(model.id(), model.value());
    }
}
