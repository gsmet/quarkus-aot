package fr.spacefox.perftests.quarkus.rest.endpoint212;

import fr.spacefox.perftests.quarkus.core.service212.model.Model212;
import fr.spacefox.perftests.quarkus.rest.endpoint212.schema.Schema212;

final class Mapper {
    private Mapper() {}

    public static Schema212 of(Model212 model) {
        return new Schema212(model.id(), model.value());
    }
}
