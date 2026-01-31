package fr.spacefox.perftests.quarkus.rest.endpoint908;

import fr.spacefox.perftests.quarkus.core.service908.model.Model908;
import fr.spacefox.perftests.quarkus.rest.endpoint908.schema.Schema908;

final class Mapper {
    private Mapper() {}

    public static Schema908 of(Model908 model) {
        return new Schema908(model.id(), model.value());
    }
}
