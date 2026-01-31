package fr.spacefox.perftests.quarkus.rest.endpoint311;

import fr.spacefox.perftests.quarkus.core.service311.model.Model311;
import fr.spacefox.perftests.quarkus.rest.endpoint311.schema.Schema311;

final class Mapper {
    private Mapper() {}

    public static Schema311 of(Model311 model) {
        return new Schema311(model.id(), model.value());
    }
}
