package fr.spacefox.perftests.quarkus.rest.endpoint262;

import fr.spacefox.perftests.quarkus.core.service262.model.Model262;
import fr.spacefox.perftests.quarkus.rest.endpoint262.schema.Schema262;

final class Mapper {
    private Mapper() {}

    public static Schema262 of(Model262 model) {
        return new Schema262(model.id(), model.value());
    }
}
