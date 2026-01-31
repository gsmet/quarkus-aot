package fr.spacefox.perftests.quarkus.rest.endpoint674;

import fr.spacefox.perftests.quarkus.core.service674.model.Model674;
import fr.spacefox.perftests.quarkus.rest.endpoint674.schema.Schema674;

final class Mapper {
    private Mapper() {}

    public static Schema674 of(Model674 model) {
        return new Schema674(model.id(), model.value());
    }
}
