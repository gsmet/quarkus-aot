package fr.spacefox.perftests.quarkus.rest.endpoint293;

import fr.spacefox.perftests.quarkus.core.service293.model.Model293;
import fr.spacefox.perftests.quarkus.rest.endpoint293.schema.Schema293;

final class Mapper {
    private Mapper() {}

    public static Schema293 of(Model293 model) {
        return new Schema293(model.id(), model.value());
    }
}
