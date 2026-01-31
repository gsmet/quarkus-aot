package fr.spacefox.perftests.quarkus.rest.endpoint489;

import fr.spacefox.perftests.quarkus.core.service489.model.Model489;
import fr.spacefox.perftests.quarkus.rest.endpoint489.schema.Schema489;

final class Mapper {
    private Mapper() {}

    public static Schema489 of(Model489 model) {
        return new Schema489(model.id(), model.value());
    }
}
