package fr.spacefox.perftests.quarkus.rest.endpoint843;

import fr.spacefox.perftests.quarkus.core.service843.model.Model843;
import fr.spacefox.perftests.quarkus.rest.endpoint843.schema.Schema843;

final class Mapper {
    private Mapper() {}

    public static Schema843 of(Model843 model) {
        return new Schema843(model.id(), model.value());
    }
}
