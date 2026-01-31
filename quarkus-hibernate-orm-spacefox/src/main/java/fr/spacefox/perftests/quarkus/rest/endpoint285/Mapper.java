package fr.spacefox.perftests.quarkus.rest.endpoint285;

import fr.spacefox.perftests.quarkus.core.service285.model.Model285;
import fr.spacefox.perftests.quarkus.rest.endpoint285.schema.Schema285;

final class Mapper {
    private Mapper() {}

    public static Schema285 of(Model285 model) {
        return new Schema285(model.id(), model.value());
    }
}
