package fr.spacefox.perftests.quarkus.rest.endpoint920;

import fr.spacefox.perftests.quarkus.core.service920.model.Model920;
import fr.spacefox.perftests.quarkus.rest.endpoint920.schema.Schema920;

final class Mapper {
    private Mapper() {}

    public static Schema920 of(Model920 model) {
        return new Schema920(model.id(), model.value());
    }
}
