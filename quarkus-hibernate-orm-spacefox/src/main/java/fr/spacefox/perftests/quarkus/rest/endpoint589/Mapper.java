package fr.spacefox.perftests.quarkus.rest.endpoint589;

import fr.spacefox.perftests.quarkus.core.service589.model.Model589;
import fr.spacefox.perftests.quarkus.rest.endpoint589.schema.Schema589;

final class Mapper {
    private Mapper() {}

    public static Schema589 of(Model589 model) {
        return new Schema589(model.id(), model.value());
    }
}
