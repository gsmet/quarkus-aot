package fr.spacefox.perftests.quarkus.rest.endpoint113;

import fr.spacefox.perftests.quarkus.core.service113.model.Model113;
import fr.spacefox.perftests.quarkus.rest.endpoint113.schema.Schema113;

final class Mapper {
    private Mapper() {}

    public static Schema113 of(Model113 model) {
        return new Schema113(model.id(), model.value());
    }
}
