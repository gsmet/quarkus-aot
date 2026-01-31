package fr.spacefox.perftests.quarkus.rest.endpoint162;

import fr.spacefox.perftests.quarkus.core.service162.model.Model162;
import fr.spacefox.perftests.quarkus.rest.endpoint162.schema.Schema162;

final class Mapper {
    private Mapper() {}

    public static Schema162 of(Model162 model) {
        return new Schema162(model.id(), model.value());
    }
}
