package fr.spacefox.perftests.quarkus.rest.endpoint177;

import fr.spacefox.perftests.quarkus.core.service177.model.Model177;
import fr.spacefox.perftests.quarkus.rest.endpoint177.schema.Schema177;

final class Mapper {
    private Mapper() {}

    public static Schema177 of(Model177 model) {
        return new Schema177(model.id(), model.value());
    }
}
