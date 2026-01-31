package fr.spacefox.perftests.quarkus.rest.endpoint383;

import fr.spacefox.perftests.quarkus.core.service383.model.Model383;
import fr.spacefox.perftests.quarkus.rest.endpoint383.schema.Schema383;

final class Mapper {
    private Mapper() {}

    public static Schema383 of(Model383 model) {
        return new Schema383(model.id(), model.value());
    }
}
