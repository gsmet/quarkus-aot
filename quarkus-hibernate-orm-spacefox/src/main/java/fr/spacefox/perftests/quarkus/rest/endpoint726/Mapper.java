package fr.spacefox.perftests.quarkus.rest.endpoint726;

import fr.spacefox.perftests.quarkus.core.service726.model.Model726;
import fr.spacefox.perftests.quarkus.rest.endpoint726.schema.Schema726;

final class Mapper {
    private Mapper() {}

    public static Schema726 of(Model726 model) {
        return new Schema726(model.id(), model.value());
    }
}
