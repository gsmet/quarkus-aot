package fr.spacefox.perftests.quarkus.rest.endpoint178;

import fr.spacefox.perftests.quarkus.core.service178.model.Model178;
import fr.spacefox.perftests.quarkus.rest.endpoint178.schema.Schema178;

final class Mapper {
    private Mapper() {}

    public static Schema178 of(Model178 model) {
        return new Schema178(model.id(), model.value());
    }
}
