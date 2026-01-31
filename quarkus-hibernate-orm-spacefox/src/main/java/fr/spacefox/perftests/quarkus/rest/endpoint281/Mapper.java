package fr.spacefox.perftests.quarkus.rest.endpoint281;

import fr.spacefox.perftests.quarkus.core.service281.model.Model281;
import fr.spacefox.perftests.quarkus.rest.endpoint281.schema.Schema281;

final class Mapper {
    private Mapper() {}

    public static Schema281 of(Model281 model) {
        return new Schema281(model.id(), model.value());
    }
}
