package fr.spacefox.perftests.quarkus.rest.endpoint500;

import fr.spacefox.perftests.quarkus.core.service500.model.Model500;
import fr.spacefox.perftests.quarkus.rest.endpoint500.schema.Schema500;

final class Mapper {
    private Mapper() {}

    public static Schema500 of(Model500 model) {
        return new Schema500(model.id(), model.value());
    }
}
