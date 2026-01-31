package fr.spacefox.perftests.quarkus.rest.endpoint454;

import fr.spacefox.perftests.quarkus.core.service454.model.Model454;
import fr.spacefox.perftests.quarkus.rest.endpoint454.schema.Schema454;

final class Mapper {
    private Mapper() {}

    public static Schema454 of(Model454 model) {
        return new Schema454(model.id(), model.value());
    }
}
