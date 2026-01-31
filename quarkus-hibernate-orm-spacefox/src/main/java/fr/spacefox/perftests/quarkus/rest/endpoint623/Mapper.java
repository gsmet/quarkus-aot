package fr.spacefox.perftests.quarkus.rest.endpoint623;

import fr.spacefox.perftests.quarkus.core.service623.model.Model623;
import fr.spacefox.perftests.quarkus.rest.endpoint623.schema.Schema623;

final class Mapper {
    private Mapper() {}

    public static Schema623 of(Model623 model) {
        return new Schema623(model.id(), model.value());
    }
}
