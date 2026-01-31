package fr.spacefox.perftests.quarkus.rest.endpoint776;

import fr.spacefox.perftests.quarkus.core.service776.model.Model776;
import fr.spacefox.perftests.quarkus.rest.endpoint776.schema.Schema776;

final class Mapper {
    private Mapper() {}

    public static Schema776 of(Model776 model) {
        return new Schema776(model.id(), model.value());
    }
}
