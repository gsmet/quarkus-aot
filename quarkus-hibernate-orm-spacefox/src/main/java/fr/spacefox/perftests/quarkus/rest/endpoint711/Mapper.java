package fr.spacefox.perftests.quarkus.rest.endpoint711;

import fr.spacefox.perftests.quarkus.core.service711.model.Model711;
import fr.spacefox.perftests.quarkus.rest.endpoint711.schema.Schema711;

final class Mapper {
    private Mapper() {}

    public static Schema711 of(Model711 model) {
        return new Schema711(model.id(), model.value());
    }
}
