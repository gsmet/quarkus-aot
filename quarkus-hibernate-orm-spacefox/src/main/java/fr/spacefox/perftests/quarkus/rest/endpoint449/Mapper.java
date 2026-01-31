package fr.spacefox.perftests.quarkus.rest.endpoint449;

import fr.spacefox.perftests.quarkus.core.service449.model.Model449;
import fr.spacefox.perftests.quarkus.rest.endpoint449.schema.Schema449;

final class Mapper {
    private Mapper() {}

    public static Schema449 of(Model449 model) {
        return new Schema449(model.id(), model.value());
    }
}
