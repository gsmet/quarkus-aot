package fr.spacefox.perftests.quarkus.rest.endpoint603;

import fr.spacefox.perftests.quarkus.core.service603.model.Model603;
import fr.spacefox.perftests.quarkus.rest.endpoint603.schema.Schema603;

final class Mapper {
    private Mapper() {}

    public static Schema603 of(Model603 model) {
        return new Schema603(model.id(), model.value());
    }
}
