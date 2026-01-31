package fr.spacefox.perftests.quarkus.rest.endpoint117;

import fr.spacefox.perftests.quarkus.core.service117.model.Model117;
import fr.spacefox.perftests.quarkus.rest.endpoint117.schema.Schema117;

final class Mapper {
    private Mapper() {}

    public static Schema117 of(Model117 model) {
        return new Schema117(model.id(), model.value());
    }
}
