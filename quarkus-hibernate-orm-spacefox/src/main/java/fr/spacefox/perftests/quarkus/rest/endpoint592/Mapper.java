package fr.spacefox.perftests.quarkus.rest.endpoint592;

import fr.spacefox.perftests.quarkus.core.service592.model.Model592;
import fr.spacefox.perftests.quarkus.rest.endpoint592.schema.Schema592;

final class Mapper {
    private Mapper() {}

    public static Schema592 of(Model592 model) {
        return new Schema592(model.id(), model.value());
    }
}
