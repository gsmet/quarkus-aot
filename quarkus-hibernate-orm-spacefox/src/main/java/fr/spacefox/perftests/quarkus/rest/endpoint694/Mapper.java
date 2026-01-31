package fr.spacefox.perftests.quarkus.rest.endpoint694;

import fr.spacefox.perftests.quarkus.core.service694.model.Model694;
import fr.spacefox.perftests.quarkus.rest.endpoint694.schema.Schema694;

final class Mapper {
    private Mapper() {}

    public static Schema694 of(Model694 model) {
        return new Schema694(model.id(), model.value());
    }
}
