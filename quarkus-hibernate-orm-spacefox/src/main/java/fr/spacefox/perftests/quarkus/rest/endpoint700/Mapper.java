package fr.spacefox.perftests.quarkus.rest.endpoint700;

import fr.spacefox.perftests.quarkus.core.service700.model.Model700;
import fr.spacefox.perftests.quarkus.rest.endpoint700.schema.Schema700;

final class Mapper {
    private Mapper() {}

    public static Schema700 of(Model700 model) {
        return new Schema700(model.id(), model.value());
    }
}
