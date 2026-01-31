package fr.spacefox.perftests.quarkus.rest.endpoint302;

import fr.spacefox.perftests.quarkus.core.service302.model.Model302;
import fr.spacefox.perftests.quarkus.rest.endpoint302.schema.Schema302;

final class Mapper {
    private Mapper() {}

    public static Schema302 of(Model302 model) {
        return new Schema302(model.id(), model.value());
    }
}
