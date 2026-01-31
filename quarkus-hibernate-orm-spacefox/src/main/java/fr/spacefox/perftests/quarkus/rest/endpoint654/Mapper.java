package fr.spacefox.perftests.quarkus.rest.endpoint654;

import fr.spacefox.perftests.quarkus.core.service654.model.Model654;
import fr.spacefox.perftests.quarkus.rest.endpoint654.schema.Schema654;

final class Mapper {
    private Mapper() {}

    public static Schema654 of(Model654 model) {
        return new Schema654(model.id(), model.value());
    }
}
