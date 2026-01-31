package fr.spacefox.perftests.quarkus.rest.endpoint807;

import fr.spacefox.perftests.quarkus.core.service807.model.Model807;
import fr.spacefox.perftests.quarkus.rest.endpoint807.schema.Schema807;

final class Mapper {
    private Mapper() {}

    public static Schema807 of(Model807 model) {
        return new Schema807(model.id(), model.value());
    }
}
