package fr.spacefox.perftests.quarkus.rest.endpoint448;

import fr.spacefox.perftests.quarkus.core.service448.model.Model448;
import fr.spacefox.perftests.quarkus.rest.endpoint448.schema.Schema448;

final class Mapper {
    private Mapper() {}

    public static Schema448 of(Model448 model) {
        return new Schema448(model.id(), model.value());
    }
}
