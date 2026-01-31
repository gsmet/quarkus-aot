package fr.spacefox.perftests.quarkus.rest.endpoint321;

import fr.spacefox.perftests.quarkus.core.service321.model.Model321;
import fr.spacefox.perftests.quarkus.rest.endpoint321.schema.Schema321;

final class Mapper {
    private Mapper() {}

    public static Schema321 of(Model321 model) {
        return new Schema321(model.id(), model.value());
    }
}
