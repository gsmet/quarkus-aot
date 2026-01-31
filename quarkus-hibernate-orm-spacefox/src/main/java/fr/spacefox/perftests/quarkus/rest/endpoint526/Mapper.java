package fr.spacefox.perftests.quarkus.rest.endpoint526;

import fr.spacefox.perftests.quarkus.core.service526.model.Model526;
import fr.spacefox.perftests.quarkus.rest.endpoint526.schema.Schema526;

final class Mapper {
    private Mapper() {}

    public static Schema526 of(Model526 model) {
        return new Schema526(model.id(), model.value());
    }
}
