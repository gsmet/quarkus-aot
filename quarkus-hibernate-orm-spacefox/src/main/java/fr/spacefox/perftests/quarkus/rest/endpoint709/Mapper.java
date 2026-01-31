package fr.spacefox.perftests.quarkus.rest.endpoint709;

import fr.spacefox.perftests.quarkus.core.service709.model.Model709;
import fr.spacefox.perftests.quarkus.rest.endpoint709.schema.Schema709;

final class Mapper {
    private Mapper() {}

    public static Schema709 of(Model709 model) {
        return new Schema709(model.id(), model.value());
    }
}
