package fr.spacefox.perftests.quarkus.rest.endpoint524;

import fr.spacefox.perftests.quarkus.core.service524.model.Model524;
import fr.spacefox.perftests.quarkus.rest.endpoint524.schema.Schema524;

final class Mapper {
    private Mapper() {}

    public static Schema524 of(Model524 model) {
        return new Schema524(model.id(), model.value());
    }
}
