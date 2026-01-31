package fr.spacefox.perftests.quarkus.rest.endpoint972;

import fr.spacefox.perftests.quarkus.core.service972.model.Model972;
import fr.spacefox.perftests.quarkus.rest.endpoint972.schema.Schema972;

final class Mapper {
    private Mapper() {}

    public static Schema972 of(Model972 model) {
        return new Schema972(model.id(), model.value());
    }
}
