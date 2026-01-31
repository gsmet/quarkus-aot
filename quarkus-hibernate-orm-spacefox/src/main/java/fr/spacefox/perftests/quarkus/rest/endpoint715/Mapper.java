package fr.spacefox.perftests.quarkus.rest.endpoint715;

import fr.spacefox.perftests.quarkus.core.service715.model.Model715;
import fr.spacefox.perftests.quarkus.rest.endpoint715.schema.Schema715;

final class Mapper {
    private Mapper() {}

    public static Schema715 of(Model715 model) {
        return new Schema715(model.id(), model.value());
    }
}
