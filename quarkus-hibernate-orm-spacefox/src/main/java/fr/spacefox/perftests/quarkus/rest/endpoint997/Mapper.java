package fr.spacefox.perftests.quarkus.rest.endpoint997;

import fr.spacefox.perftests.quarkus.core.service997.model.Model997;
import fr.spacefox.perftests.quarkus.rest.endpoint997.schema.Schema997;

final class Mapper {
    private Mapper() {}

    public static Schema997 of(Model997 model) {
        return new Schema997(model.id(), model.value());
    }
}
