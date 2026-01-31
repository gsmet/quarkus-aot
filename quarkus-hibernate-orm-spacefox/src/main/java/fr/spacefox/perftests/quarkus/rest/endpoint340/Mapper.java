package fr.spacefox.perftests.quarkus.rest.endpoint340;

import fr.spacefox.perftests.quarkus.core.service340.model.Model340;
import fr.spacefox.perftests.quarkus.rest.endpoint340.schema.Schema340;

final class Mapper {
    private Mapper() {}

    public static Schema340 of(Model340 model) {
        return new Schema340(model.id(), model.value());
    }
}
