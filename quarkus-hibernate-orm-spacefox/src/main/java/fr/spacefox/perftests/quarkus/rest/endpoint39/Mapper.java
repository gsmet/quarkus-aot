package fr.spacefox.perftests.quarkus.rest.endpoint39;

import fr.spacefox.perftests.quarkus.core.service39.model.Model39;
import fr.spacefox.perftests.quarkus.rest.endpoint39.schema.Schema39;

final class Mapper {
    private Mapper() {}

    public static Schema39 of(Model39 model) {
        return new Schema39(model.id(), model.value());
    }
}
