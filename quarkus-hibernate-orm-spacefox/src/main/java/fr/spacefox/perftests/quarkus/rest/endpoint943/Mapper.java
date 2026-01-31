package fr.spacefox.perftests.quarkus.rest.endpoint943;

import fr.spacefox.perftests.quarkus.core.service943.model.Model943;
import fr.spacefox.perftests.quarkus.rest.endpoint943.schema.Schema943;

final class Mapper {
    private Mapper() {}

    public static Schema943 of(Model943 model) {
        return new Schema943(model.id(), model.value());
    }
}
