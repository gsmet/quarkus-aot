package fr.spacefox.perftests.quarkus.rest.endpoint362;

import fr.spacefox.perftests.quarkus.core.service362.model.Model362;
import fr.spacefox.perftests.quarkus.rest.endpoint362.schema.Schema362;

final class Mapper {
    private Mapper() {}

    public static Schema362 of(Model362 model) {
        return new Schema362(model.id(), model.value());
    }
}
