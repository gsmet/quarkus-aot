package fr.spacefox.perftests.quarkus.rest.endpoint569;

import fr.spacefox.perftests.quarkus.core.service569.model.Model569;
import fr.spacefox.perftests.quarkus.rest.endpoint569.schema.Schema569;

final class Mapper {
    private Mapper() {}

    public static Schema569 of(Model569 model) {
        return new Schema569(model.id(), model.value());
    }
}
