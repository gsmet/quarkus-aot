package fr.spacefox.perftests.quarkus.rest.endpoint728;

import fr.spacefox.perftests.quarkus.core.service728.model.Model728;
import fr.spacefox.perftests.quarkus.rest.endpoint728.schema.Schema728;

final class Mapper {
    private Mapper() {}

    public static Schema728 of(Model728 model) {
        return new Schema728(model.id(), model.value());
    }
}
