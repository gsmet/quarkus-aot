package fr.spacefox.perftests.quarkus.rest.endpoint68;

import fr.spacefox.perftests.quarkus.core.service68.model.Model68;
import fr.spacefox.perftests.quarkus.rest.endpoint68.schema.Schema68;

final class Mapper {
    private Mapper() {}

    public static Schema68 of(Model68 model) {
        return new Schema68(model.id(), model.value());
    }
}
