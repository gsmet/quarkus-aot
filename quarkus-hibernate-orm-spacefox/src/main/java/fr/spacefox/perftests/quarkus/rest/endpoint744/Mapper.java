package fr.spacefox.perftests.quarkus.rest.endpoint744;

import fr.spacefox.perftests.quarkus.core.service744.model.Model744;
import fr.spacefox.perftests.quarkus.rest.endpoint744.schema.Schema744;

final class Mapper {
    private Mapper() {}

    public static Schema744 of(Model744 model) {
        return new Schema744(model.id(), model.value());
    }
}
