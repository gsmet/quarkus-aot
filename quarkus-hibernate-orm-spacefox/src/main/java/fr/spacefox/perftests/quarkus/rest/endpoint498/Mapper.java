package fr.spacefox.perftests.quarkus.rest.endpoint498;

import fr.spacefox.perftests.quarkus.core.service498.model.Model498;
import fr.spacefox.perftests.quarkus.rest.endpoint498.schema.Schema498;

final class Mapper {
    private Mapper() {}

    public static Schema498 of(Model498 model) {
        return new Schema498(model.id(), model.value());
    }
}
