package fr.spacefox.perftests.quarkus.rest.endpoint573;

import fr.spacefox.perftests.quarkus.core.service573.model.Model573;
import fr.spacefox.perftests.quarkus.rest.endpoint573.schema.Schema573;

final class Mapper {
    private Mapper() {}

    public static Schema573 of(Model573 model) {
        return new Schema573(model.id(), model.value());
    }
}
