package fr.spacefox.perftests.quarkus.rest.endpoint643;

import fr.spacefox.perftests.quarkus.core.service643.model.Model643;
import fr.spacefox.perftests.quarkus.rest.endpoint643.schema.Schema643;

final class Mapper {
    private Mapper() {}

    public static Schema643 of(Model643 model) {
        return new Schema643(model.id(), model.value());
    }
}
