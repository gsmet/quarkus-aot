package fr.spacefox.perftests.quarkus.rest.endpoint561;

import fr.spacefox.perftests.quarkus.core.service561.model.Model561;
import fr.spacefox.perftests.quarkus.rest.endpoint561.schema.Schema561;

final class Mapper {
    private Mapper() {}

    public static Schema561 of(Model561 model) {
        return new Schema561(model.id(), model.value());
    }
}
