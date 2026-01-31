package fr.spacefox.perftests.quarkus.rest.endpoint841;

import fr.spacefox.perftests.quarkus.core.service841.model.Model841;
import fr.spacefox.perftests.quarkus.rest.endpoint841.schema.Schema841;

final class Mapper {
    private Mapper() {}

    public static Schema841 of(Model841 model) {
        return new Schema841(model.id(), model.value());
    }
}
