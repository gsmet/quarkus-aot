package fr.spacefox.perftests.quarkus.rest.endpoint239;

import fr.spacefox.perftests.quarkus.core.service239.model.Model239;
import fr.spacefox.perftests.quarkus.rest.endpoint239.schema.Schema239;

final class Mapper {
    private Mapper() {}

    public static Schema239 of(Model239 model) {
        return new Schema239(model.id(), model.value());
    }
}
