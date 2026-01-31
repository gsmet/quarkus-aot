package fr.spacefox.perftests.quarkus.rest.endpoint468;

import fr.spacefox.perftests.quarkus.core.service468.model.Model468;
import fr.spacefox.perftests.quarkus.rest.endpoint468.schema.Schema468;

final class Mapper {
    private Mapper() {}

    public static Schema468 of(Model468 model) {
        return new Schema468(model.id(), model.value());
    }
}
