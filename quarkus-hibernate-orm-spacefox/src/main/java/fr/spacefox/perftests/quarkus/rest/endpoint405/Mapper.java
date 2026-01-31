package fr.spacefox.perftests.quarkus.rest.endpoint405;

import fr.spacefox.perftests.quarkus.core.service405.model.Model405;
import fr.spacefox.perftests.quarkus.rest.endpoint405.schema.Schema405;

final class Mapper {
    private Mapper() {}

    public static Schema405 of(Model405 model) {
        return new Schema405(model.id(), model.value());
    }
}
