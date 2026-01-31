package fr.spacefox.perftests.quarkus.rest.endpoint836;

import fr.spacefox.perftests.quarkus.core.service836.model.Model836;
import fr.spacefox.perftests.quarkus.rest.endpoint836.schema.Schema836;

final class Mapper {
    private Mapper() {}

    public static Schema836 of(Model836 model) {
        return new Schema836(model.id(), model.value());
    }
}
