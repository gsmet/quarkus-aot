package fr.spacefox.perftests.quarkus.rest.endpoint687;

import fr.spacefox.perftests.quarkus.core.service687.model.Model687;
import fr.spacefox.perftests.quarkus.rest.endpoint687.schema.Schema687;

final class Mapper {
    private Mapper() {}

    public static Schema687 of(Model687 model) {
        return new Schema687(model.id(), model.value());
    }
}
