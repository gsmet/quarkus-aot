package fr.spacefox.perftests.quarkus.rest.endpoint266;

import fr.spacefox.perftests.quarkus.core.service266.model.Model266;
import fr.spacefox.perftests.quarkus.rest.endpoint266.schema.Schema266;

final class Mapper {
    private Mapper() {}

    public static Schema266 of(Model266 model) {
        return new Schema266(model.id(), model.value());
    }
}
