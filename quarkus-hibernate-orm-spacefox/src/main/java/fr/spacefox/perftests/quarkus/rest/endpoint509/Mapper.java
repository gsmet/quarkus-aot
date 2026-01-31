package fr.spacefox.perftests.quarkus.rest.endpoint509;

import fr.spacefox.perftests.quarkus.core.service509.model.Model509;
import fr.spacefox.perftests.quarkus.rest.endpoint509.schema.Schema509;

final class Mapper {
    private Mapper() {}

    public static Schema509 of(Model509 model) {
        return new Schema509(model.id(), model.value());
    }
}
