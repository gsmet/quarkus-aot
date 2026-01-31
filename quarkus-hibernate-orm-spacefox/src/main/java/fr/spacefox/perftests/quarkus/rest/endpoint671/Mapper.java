package fr.spacefox.perftests.quarkus.rest.endpoint671;

import fr.spacefox.perftests.quarkus.core.service671.model.Model671;
import fr.spacefox.perftests.quarkus.rest.endpoint671.schema.Schema671;

final class Mapper {
    private Mapper() {}

    public static Schema671 of(Model671 model) {
        return new Schema671(model.id(), model.value());
    }
}
