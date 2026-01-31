package fr.spacefox.perftests.quarkus.rest.endpoint635;

import fr.spacefox.perftests.quarkus.core.service635.model.Model635;
import fr.spacefox.perftests.quarkus.rest.endpoint635.schema.Schema635;

final class Mapper {
    private Mapper() {}

    public static Schema635 of(Model635 model) {
        return new Schema635(model.id(), model.value());
    }
}
