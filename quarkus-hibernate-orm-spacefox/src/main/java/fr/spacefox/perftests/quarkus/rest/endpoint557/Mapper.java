package fr.spacefox.perftests.quarkus.rest.endpoint557;

import fr.spacefox.perftests.quarkus.core.service557.model.Model557;
import fr.spacefox.perftests.quarkus.rest.endpoint557.schema.Schema557;

final class Mapper {
    private Mapper() {}

    public static Schema557 of(Model557 model) {
        return new Schema557(model.id(), model.value());
    }
}
