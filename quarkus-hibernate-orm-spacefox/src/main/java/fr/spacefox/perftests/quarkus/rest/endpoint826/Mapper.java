package fr.spacefox.perftests.quarkus.rest.endpoint826;

import fr.spacefox.perftests.quarkus.core.service826.model.Model826;
import fr.spacefox.perftests.quarkus.rest.endpoint826.schema.Schema826;

final class Mapper {
    private Mapper() {}

    public static Schema826 of(Model826 model) {
        return new Schema826(model.id(), model.value());
    }
}
