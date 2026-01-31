package fr.spacefox.perftests.quarkus.rest.endpoint223;

import fr.spacefox.perftests.quarkus.core.service223.model.Model223;
import fr.spacefox.perftests.quarkus.rest.endpoint223.schema.Schema223;

final class Mapper {
    private Mapper() {}

    public static Schema223 of(Model223 model) {
        return new Schema223(model.id(), model.value());
    }
}
