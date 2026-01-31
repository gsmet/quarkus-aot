package fr.spacefox.perftests.quarkus.rest.endpoint195;

import fr.spacefox.perftests.quarkus.core.service195.model.Model195;
import fr.spacefox.perftests.quarkus.rest.endpoint195.schema.Schema195;

final class Mapper {
    private Mapper() {}

    public static Schema195 of(Model195 model) {
        return new Schema195(model.id(), model.value());
    }
}
