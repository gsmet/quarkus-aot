package fr.spacefox.perftests.quarkus.rest.endpoint410;

import fr.spacefox.perftests.quarkus.core.service410.model.Model410;
import fr.spacefox.perftests.quarkus.rest.endpoint410.schema.Schema410;

final class Mapper {
    private Mapper() {}

    public static Schema410 of(Model410 model) {
        return new Schema410(model.id(), model.value());
    }
}
