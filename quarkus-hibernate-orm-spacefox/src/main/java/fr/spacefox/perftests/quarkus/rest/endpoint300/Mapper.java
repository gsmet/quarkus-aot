package fr.spacefox.perftests.quarkus.rest.endpoint300;

import fr.spacefox.perftests.quarkus.core.service300.model.Model300;
import fr.spacefox.perftests.quarkus.rest.endpoint300.schema.Schema300;

final class Mapper {
    private Mapper() {}

    public static Schema300 of(Model300 model) {
        return new Schema300(model.id(), model.value());
    }
}
