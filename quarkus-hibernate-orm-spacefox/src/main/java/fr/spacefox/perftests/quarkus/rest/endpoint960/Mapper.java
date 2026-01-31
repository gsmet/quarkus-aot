package fr.spacefox.perftests.quarkus.rest.endpoint960;

import fr.spacefox.perftests.quarkus.core.service960.model.Model960;
import fr.spacefox.perftests.quarkus.rest.endpoint960.schema.Schema960;

final class Mapper {
    private Mapper() {}

    public static Schema960 of(Model960 model) {
        return new Schema960(model.id(), model.value());
    }
}
