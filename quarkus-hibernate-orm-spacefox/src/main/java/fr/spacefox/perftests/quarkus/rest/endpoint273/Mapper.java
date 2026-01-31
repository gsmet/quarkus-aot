package fr.spacefox.perftests.quarkus.rest.endpoint273;

import fr.spacefox.perftests.quarkus.core.service273.model.Model273;
import fr.spacefox.perftests.quarkus.rest.endpoint273.schema.Schema273;

final class Mapper {
    private Mapper() {}

    public static Schema273 of(Model273 model) {
        return new Schema273(model.id(), model.value());
    }
}
