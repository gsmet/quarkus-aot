package fr.spacefox.perftests.quarkus.rest.endpoint518;

import fr.spacefox.perftests.quarkus.core.service518.model.Model518;
import fr.spacefox.perftests.quarkus.rest.endpoint518.schema.Schema518;

final class Mapper {
    private Mapper() {}

    public static Schema518 of(Model518 model) {
        return new Schema518(model.id(), model.value());
    }
}
