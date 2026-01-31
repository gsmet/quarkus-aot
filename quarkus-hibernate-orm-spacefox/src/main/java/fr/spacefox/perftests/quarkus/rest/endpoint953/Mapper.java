package fr.spacefox.perftests.quarkus.rest.endpoint953;

import fr.spacefox.perftests.quarkus.core.service953.model.Model953;
import fr.spacefox.perftests.quarkus.rest.endpoint953.schema.Schema953;

final class Mapper {
    private Mapper() {}

    public static Schema953 of(Model953 model) {
        return new Schema953(model.id(), model.value());
    }
}
