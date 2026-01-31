package fr.spacefox.perftests.quarkus.rest.endpoint244;

import fr.spacefox.perftests.quarkus.core.service244.model.Model244;
import fr.spacefox.perftests.quarkus.rest.endpoint244.schema.Schema244;

final class Mapper {
    private Mapper() {}

    public static Schema244 of(Model244 model) {
        return new Schema244(model.id(), model.value());
    }
}
