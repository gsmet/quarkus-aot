package fr.spacefox.perftests.quarkus.rest.endpoint660;

import fr.spacefox.perftests.quarkus.core.service660.model.Model660;
import fr.spacefox.perftests.quarkus.rest.endpoint660.schema.Schema660;

final class Mapper {
    private Mapper() {}

    public static Schema660 of(Model660 model) {
        return new Schema660(model.id(), model.value());
    }
}
