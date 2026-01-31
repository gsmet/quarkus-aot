package fr.spacefox.perftests.quarkus.rest.endpoint984;

import fr.spacefox.perftests.quarkus.core.service984.model.Model984;
import fr.spacefox.perftests.quarkus.rest.endpoint984.schema.Schema984;

final class Mapper {
    private Mapper() {}

    public static Schema984 of(Model984 model) {
        return new Schema984(model.id(), model.value());
    }
}
