package fr.spacefox.perftests.quarkus.rest.endpoint669;

import fr.spacefox.perftests.quarkus.core.service669.model.Model669;
import fr.spacefox.perftests.quarkus.rest.endpoint669.schema.Schema669;

final class Mapper {
    private Mapper() {}

    public static Schema669 of(Model669 model) {
        return new Schema669(model.id(), model.value());
    }
}
