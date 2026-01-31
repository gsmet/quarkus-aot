package fr.spacefox.perftests.quarkus.rest.endpoint913;

import fr.spacefox.perftests.quarkus.core.service913.model.Model913;
import fr.spacefox.perftests.quarkus.rest.endpoint913.schema.Schema913;

final class Mapper {
    private Mapper() {}

    public static Schema913 of(Model913 model) {
        return new Schema913(model.id(), model.value());
    }
}
