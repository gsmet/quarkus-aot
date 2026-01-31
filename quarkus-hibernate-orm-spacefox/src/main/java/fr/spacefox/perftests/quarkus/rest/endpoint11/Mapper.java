package fr.spacefox.perftests.quarkus.rest.endpoint11;

import fr.spacefox.perftests.quarkus.core.service11.model.Model11;
import fr.spacefox.perftests.quarkus.rest.endpoint11.schema.Schema11;

final class Mapper {
    private Mapper() {}

    public static Schema11 of(Model11 model) {
        return new Schema11(model.id(), model.value());
    }
}
