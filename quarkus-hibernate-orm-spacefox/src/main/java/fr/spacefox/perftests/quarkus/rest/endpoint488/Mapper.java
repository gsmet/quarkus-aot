package fr.spacefox.perftests.quarkus.rest.endpoint488;

import fr.spacefox.perftests.quarkus.core.service488.model.Model488;
import fr.spacefox.perftests.quarkus.rest.endpoint488.schema.Schema488;

final class Mapper {
    private Mapper() {}

    public static Schema488 of(Model488 model) {
        return new Schema488(model.id(), model.value());
    }
}
