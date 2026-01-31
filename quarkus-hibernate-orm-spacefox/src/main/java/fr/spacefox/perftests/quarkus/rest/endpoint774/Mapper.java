package fr.spacefox.perftests.quarkus.rest.endpoint774;

import fr.spacefox.perftests.quarkus.core.service774.model.Model774;
import fr.spacefox.perftests.quarkus.rest.endpoint774.schema.Schema774;

final class Mapper {
    private Mapper() {}

    public static Schema774 of(Model774 model) {
        return new Schema774(model.id(), model.value());
    }
}
