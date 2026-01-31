package fr.spacefox.perftests.quarkus.rest.endpoint22;

import fr.spacefox.perftests.quarkus.core.service22.model.Model22;
import fr.spacefox.perftests.quarkus.rest.endpoint22.schema.Schema22;

final class Mapper {
    private Mapper() {}

    public static Schema22 of(Model22 model) {
        return new Schema22(model.id(), model.value());
    }
}
