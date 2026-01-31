package fr.spacefox.perftests.quarkus.rest.endpoint741;

import fr.spacefox.perftests.quarkus.core.service741.model.Model741;
import fr.spacefox.perftests.quarkus.rest.endpoint741.schema.Schema741;

final class Mapper {
    private Mapper() {}

    public static Schema741 of(Model741 model) {
        return new Schema741(model.id(), model.value());
    }
}
