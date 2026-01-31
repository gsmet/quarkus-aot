package fr.spacefox.perftests.quarkus.rest.endpoint746;

import fr.spacefox.perftests.quarkus.core.service746.model.Model746;
import fr.spacefox.perftests.quarkus.rest.endpoint746.schema.Schema746;

final class Mapper {
    private Mapper() {}

    public static Schema746 of(Model746 model) {
        return new Schema746(model.id(), model.value());
    }
}
