package fr.spacefox.perftests.quarkus.rest.endpoint51;

import fr.spacefox.perftests.quarkus.core.service51.model.Model51;
import fr.spacefox.perftests.quarkus.rest.endpoint51.schema.Schema51;

final class Mapper {
    private Mapper() {}

    public static Schema51 of(Model51 model) {
        return new Schema51(model.id(), model.value());
    }
}
