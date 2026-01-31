package fr.spacefox.perftests.quarkus.rest.endpoint888;

import fr.spacefox.perftests.quarkus.core.service888.model.Model888;
import fr.spacefox.perftests.quarkus.rest.endpoint888.schema.Schema888;

final class Mapper {
    private Mapper() {}

    public static Schema888 of(Model888 model) {
        return new Schema888(model.id(), model.value());
    }
}
