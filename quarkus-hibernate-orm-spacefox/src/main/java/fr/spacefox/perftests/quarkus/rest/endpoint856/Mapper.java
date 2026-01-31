package fr.spacefox.perftests.quarkus.rest.endpoint856;

import fr.spacefox.perftests.quarkus.core.service856.model.Model856;
import fr.spacefox.perftests.quarkus.rest.endpoint856.schema.Schema856;

final class Mapper {
    private Mapper() {}

    public static Schema856 of(Model856 model) {
        return new Schema856(model.id(), model.value());
    }
}
