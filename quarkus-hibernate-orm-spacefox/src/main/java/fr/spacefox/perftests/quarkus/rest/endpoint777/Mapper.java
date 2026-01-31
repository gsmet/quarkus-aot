package fr.spacefox.perftests.quarkus.rest.endpoint777;

import fr.spacefox.perftests.quarkus.core.service777.model.Model777;
import fr.spacefox.perftests.quarkus.rest.endpoint777.schema.Schema777;

final class Mapper {
    private Mapper() {}

    public static Schema777 of(Model777 model) {
        return new Schema777(model.id(), model.value());
    }
}
