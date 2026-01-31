package fr.spacefox.perftests.quarkus.rest.endpoint188;

import fr.spacefox.perftests.quarkus.core.service188.model.Model188;
import fr.spacefox.perftests.quarkus.rest.endpoint188.schema.Schema188;

final class Mapper {
    private Mapper() {}

    public static Schema188 of(Model188 model) {
        return new Schema188(model.id(), model.value());
    }
}
