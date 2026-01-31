package fr.spacefox.perftests.quarkus.rest.endpoint225;

import fr.spacefox.perftests.quarkus.core.service225.model.Model225;
import fr.spacefox.perftests.quarkus.rest.endpoint225.schema.Schema225;

final class Mapper {
    private Mapper() {}

    public static Schema225 of(Model225 model) {
        return new Schema225(model.id(), model.value());
    }
}
