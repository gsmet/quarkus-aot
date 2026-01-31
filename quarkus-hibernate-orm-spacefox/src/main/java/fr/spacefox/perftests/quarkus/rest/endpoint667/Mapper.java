package fr.spacefox.perftests.quarkus.rest.endpoint667;

import fr.spacefox.perftests.quarkus.core.service667.model.Model667;
import fr.spacefox.perftests.quarkus.rest.endpoint667.schema.Schema667;

final class Mapper {
    private Mapper() {}

    public static Schema667 of(Model667 model) {
        return new Schema667(model.id(), model.value());
    }
}
