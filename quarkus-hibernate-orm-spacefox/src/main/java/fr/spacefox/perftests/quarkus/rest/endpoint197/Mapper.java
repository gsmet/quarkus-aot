package fr.spacefox.perftests.quarkus.rest.endpoint197;

import fr.spacefox.perftests.quarkus.core.service197.model.Model197;
import fr.spacefox.perftests.quarkus.rest.endpoint197.schema.Schema197;

final class Mapper {
    private Mapper() {}

    public static Schema197 of(Model197 model) {
        return new Schema197(model.id(), model.value());
    }
}
