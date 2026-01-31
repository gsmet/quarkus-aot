package fr.spacefox.perftests.quarkus.rest.endpoint647;

import fr.spacefox.perftests.quarkus.core.service647.model.Model647;
import fr.spacefox.perftests.quarkus.rest.endpoint647.schema.Schema647;

final class Mapper {
    private Mapper() {}

    public static Schema647 of(Model647 model) {
        return new Schema647(model.id(), model.value());
    }
}
