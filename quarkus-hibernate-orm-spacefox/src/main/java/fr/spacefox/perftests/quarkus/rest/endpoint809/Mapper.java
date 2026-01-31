package fr.spacefox.perftests.quarkus.rest.endpoint809;

import fr.spacefox.perftests.quarkus.core.service809.model.Model809;
import fr.spacefox.perftests.quarkus.rest.endpoint809.schema.Schema809;

final class Mapper {
    private Mapper() {}

    public static Schema809 of(Model809 model) {
        return new Schema809(model.id(), model.value());
    }
}
