package fr.spacefox.perftests.quarkus.rest.endpoint228;

import fr.spacefox.perftests.quarkus.core.service228.model.Model228;
import fr.spacefox.perftests.quarkus.rest.endpoint228.schema.Schema228;

final class Mapper {
    private Mapper() {}

    public static Schema228 of(Model228 model) {
        return new Schema228(model.id(), model.value());
    }
}
