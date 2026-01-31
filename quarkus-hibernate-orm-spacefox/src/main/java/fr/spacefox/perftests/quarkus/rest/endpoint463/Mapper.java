package fr.spacefox.perftests.quarkus.rest.endpoint463;

import fr.spacefox.perftests.quarkus.core.service463.model.Model463;
import fr.spacefox.perftests.quarkus.rest.endpoint463.schema.Schema463;

final class Mapper {
    private Mapper() {}

    public static Schema463 of(Model463 model) {
        return new Schema463(model.id(), model.value());
    }
}
