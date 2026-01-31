package fr.spacefox.perftests.quarkus.rest.endpoint287;

import fr.spacefox.perftests.quarkus.core.service287.model.Model287;
import fr.spacefox.perftests.quarkus.rest.endpoint287.schema.Schema287;

final class Mapper {
    private Mapper() {}

    public static Schema287 of(Model287 model) {
        return new Schema287(model.id(), model.value());
    }
}
