package fr.spacefox.perftests.quarkus.rest.endpoint941;

import fr.spacefox.perftests.quarkus.core.service941.model.Model941;
import fr.spacefox.perftests.quarkus.rest.endpoint941.schema.Schema941;

final class Mapper {
    private Mapper() {}

    public static Schema941 of(Model941 model) {
        return new Schema941(model.id(), model.value());
    }
}
