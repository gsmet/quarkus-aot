package fr.spacefox.perftests.quarkus.rest.endpoint210;

import fr.spacefox.perftests.quarkus.core.service210.model.Model210;
import fr.spacefox.perftests.quarkus.rest.endpoint210.schema.Schema210;

final class Mapper {
    private Mapper() {}

    public static Schema210 of(Model210 model) {
        return new Schema210(model.id(), model.value());
    }
}
