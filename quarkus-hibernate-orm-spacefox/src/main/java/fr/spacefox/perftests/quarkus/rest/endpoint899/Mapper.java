package fr.spacefox.perftests.quarkus.rest.endpoint899;

import fr.spacefox.perftests.quarkus.core.service899.model.Model899;
import fr.spacefox.perftests.quarkus.rest.endpoint899.schema.Schema899;

final class Mapper {
    private Mapper() {}

    public static Schema899 of(Model899 model) {
        return new Schema899(model.id(), model.value());
    }
}
