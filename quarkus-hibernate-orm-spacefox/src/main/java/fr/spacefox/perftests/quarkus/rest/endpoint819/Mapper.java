package fr.spacefox.perftests.quarkus.rest.endpoint819;

import fr.spacefox.perftests.quarkus.core.service819.model.Model819;
import fr.spacefox.perftests.quarkus.rest.endpoint819.schema.Schema819;

final class Mapper {
    private Mapper() {}

    public static Schema819 of(Model819 model) {
        return new Schema819(model.id(), model.value());
    }
}
