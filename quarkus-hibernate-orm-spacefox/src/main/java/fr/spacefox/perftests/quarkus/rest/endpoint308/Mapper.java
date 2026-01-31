package fr.spacefox.perftests.quarkus.rest.endpoint308;

import fr.spacefox.perftests.quarkus.core.service308.model.Model308;
import fr.spacefox.perftests.quarkus.rest.endpoint308.schema.Schema308;

final class Mapper {
    private Mapper() {}

    public static Schema308 of(Model308 model) {
        return new Schema308(model.id(), model.value());
    }
}
